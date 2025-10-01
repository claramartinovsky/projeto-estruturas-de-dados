package estruturas;

public class Fila {
    private String[] dados;
    private int tamanho;

    public Fila(int capacidade) {
        dados = new String[capacidade];
        tamanho = 0;
    }

    public void enfileirar(String valor) {
        if (tamanho == dados.length) {
            System.out.println("Fila cheia! Nao e possivel enfileirar: " + valor);
            return;
        }
        dados[tamanho] = valor;
        tamanho++;
    }

    public String desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia! Nao e possivel desenfileirar.");
            return null;
        }
        String removido = dados[0];
        for (int i = 0; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return removido;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }
}
