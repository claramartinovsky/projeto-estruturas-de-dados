package estruturas;

public class MainEditor {
    public static void main(String[] args) {
        System.out.println("===== Editor de Texto =====");
        EditorTexto editor = new EditorTexto(10);
        editor.inserirTexto("Um");
        editor.inserirTexto("Dois");
        editor.desfazer();
        editor.refazer();
        editor.inserirTexto("Tres");
        editor.desfazer();
        editor.desfazer();
    }
}

