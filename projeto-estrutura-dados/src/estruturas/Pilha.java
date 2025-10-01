package estruturas;

public class Pilha {
    private String[] dados;
    private int topo;

    public Pilha(int capacidade) {
        dados = new String[capacidade];
        topo = -1;
    }

    public void empilhar(String valor) {
        if (topo == dados.length - 1) {  
            mostrarPilha();
            System.out.println("Pilha cheia! Nao e possivel empilhar: " + valor);
            return;
        }
        dados[++topo] = valor;
    }

    public String desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia! Nao e possivel desempilhar.");
            return null;
        }
        return dados[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public int capacidade() {
        return dados.length;
    }

    public void mostrarPilha() {
        System.out.println("Estado atual da pilha:");
        if (estaVazia()) {
            System.out.println("Pilha está vazia.");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println("[" + i + "] " + dados[i]);
            }
        }
    }
}
