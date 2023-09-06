package exercicio01;

public class Teste {

    public static void main(String[] args) {
        
        Grafo graph = new Grafo();

        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);

        graph.addEdge(0, 1);
        graph.addEdge(2, 5);
        graph.addEdge(0, 5);
        graph.addEdge(1, 2);
        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.addEdge(4, 5);
        graph.addEdge(4, 3);
        graph.addEdge(5, 6);
        graph.addEdge(6, 4);

        System.out.println("Node Count: " + graph.nodeCount);
        System.out.println("Edge Count: " + graph.edgeCount);
        System.out.println("Lista Adjacente (Grafo): " + graph.adjList);

        System.out.println("Os nós 1 e 2 são vizinhos? " + graph.areNeighbors(1, 2));
        System.out.println("Os nós 0 e 3 são vizinhos? " + graph.areNeighbors(0, 3));

        System.out.println("Vizinhos do nó 2: " + graph.getNeighbors(2));
        System.out.println("Vizinhos do nó 3: " + graph.getNeighbors(3));
    }
    
}
