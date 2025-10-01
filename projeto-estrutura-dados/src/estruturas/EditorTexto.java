package estruturas;

public class EditorTexto {
    private Pilha pilhaDesfazer;
    private Pilha pilhaRefazer;
    private String textoAtual;

    public EditorTexto(int capacidade) {
        pilhaDesfazer = new Pilha(capacidade);
        pilhaRefazer = new Pilha(capacidade);
        textoAtual = "";
    }

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        pilhaRefazer = new Pilha(pilhaRefazer.capacidade());
        textoAtual = novoTexto;
        System.out.println("Texto atual: " + textoAtual);
    }

    public void desfazer() {
        if (pilhaDesfazer.estaVazia()) {
            System.out.println("Nada para desfazer.");
            return;
        }
        pilhaRefazer.empilhar(textoAtual);
        textoAtual = pilhaDesfazer.desempilhar();
        System.out.println("Desfeito. Texto atual: " + textoAtual);
    }

    public void refazer() {
        if (pilhaRefazer.estaVazia()) {
            System.out.println("Nada para refazer.");
            return;
        }
        pilhaDesfazer.empilhar(textoAtual);
        textoAtual = pilhaRefazer.desempilhar();
        System.out.println("Refeito. Texto atual: " + textoAtual);
    }
}
