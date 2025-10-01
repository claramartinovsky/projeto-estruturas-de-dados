package estruturas;

public class MainImpressao {
    public static void main(String[] args) {
        FilaDocumento fila = new FilaDocumento(5);

        Documento d1 = new Documento("PlanilhaSemana.xlsx", 700);
        Documento d2 = new Documento("TrabalhoTestes.docx", 650);
        Documento d3 = new Documento("FotoPc.png", 300);
        Documento d4 = new Documento("RelatorioMes.pdf", 511);

        fila.adicionarDocumento(d1);
        fila.adicionarDocumento(d2);
        fila.adicionarDocumento(d3);
        fila.adicionarDocumento(d4);

        fila.mostrarFila();
        System.out.println("Numero de documentos na fila: " + fila.numeroDocumentos());

        fila.imprimirProximo();
        System.out.println("Numero de documentos na fila: " + fila.numeroDocumentos());
        fila.imprimirProximo();
        System.out.println("Numero de documentos na fila: " + fila.numeroDocumentos());

        fila.mostrarFila();

        fila.adicionarDocumento(new Documento("ApresentacaoJava.pptx", 930));
        System.out.println("Numero de documentos na fila: " + fila.numeroDocumentos());

        fila.mostrarFila();

        while (!fila.estaVazia()) {
            fila.imprimirProximo();
        }
        System.out.println("Numero de documentos na fila: " + fila.numeroDocumentos());

        fila.imprimirProximo();
    }
}
