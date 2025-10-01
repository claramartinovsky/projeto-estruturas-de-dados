package estruturas;

public class MainPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        System.out.println("A pilha esta vazia? " + pilha.estaVazia());

        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("E");
        pilha.empilhar("F"); 

        System.out.println("A pilha esta vazia? " + pilha.estaVazia());

        System.out.println("Desempilhando: " + pilha.desempilhar());
        System.out.println("Desempilhando: " + pilha.desempilhar());

        pilha.empilhar("G");
        pilha.empilhar("H");
        pilha.empilhar("I"); 

        System.out.println("Desempilhando todos os elementos restantes:");
        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilhar());
        }

        pilha.desempilhar(); 
    }
}
