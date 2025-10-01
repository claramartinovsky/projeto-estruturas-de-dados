package estruturas;

public class FilaDocumento {
    private Documento[] dados;
    private int tamanho;

    public FilaDocumento(int capacidade) {
        dados = new Documento[capacidade];
        tamanho = 0;
    }

    public void adicionarDocumento(Documento doc) {
        if (tamanho == dados.length) {
            System.out.println("Fila de impressao cheia! Nao e possivel adicionar: " + doc);
            return;
        }
        dados[tamanho++] = doc;
        System.out.println("Documento adicionado: " + doc);
    }

    public Documento imprimirProximo() {
        if (estaVazia()) {
            System.out.println("Fila de impressao vazia!");
            return null;
        }
        Documento doc = dados[0];
        for (int i = 0; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        dados[--tamanho] = null;
        System.out.println("Imprimindo: " + doc);
        return doc;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int numeroDocumentos() {
        return tamanho;
    }

    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("Fila de impressao vazia!");
            return;
        }
        System.out.print("Fila de impressao: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[i] + " | ");
        }
        System.out.println();
    }
}
