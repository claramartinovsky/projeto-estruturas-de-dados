package estruturas; 

public class MainFila {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        System.out.println("A fila esta vazia? " + fila.estaVazia());

        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        
        fila.mostrarFila();
        
        fila.enfileirar("F"); 

        System.out.println("Removido: " + fila.desenfileirar());
        System.out.println("Removido: " + fila.desenfileirar());

        fila.mostrarFila();

        fila.enfileirar("G");
        fila.enfileirar("H");

        fila.mostrarFila();

        while (!fila.estaVazia()) {
            System.out.println("Removido: " + fila.desenfileirar());
        }

        fila.desenfileirar();
    } 
}
