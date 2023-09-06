package exercicio01;
import java.util.*;

public class Grafo {

    public Map<Integer, List<Integer>> adjList;
    public int nodeCount;
    public int edgeCount;

    public Grafo() {
        adjList = new HashMap<>();
        nodeCount = 0;
        edgeCount = 0;
    }

    public void addNode(int node) {
        if (adjList.containsKey(node)) {
            System.out.println("WARN: Node " + node + " already exists");
            return;
        }
        adjList.put(node, new ArrayList<>());
        nodeCount++;
    }

    public void addEdge(int node1, int node2) {
        if (!adjList.containsKey(node1)) {
            System.out.println("WARN: Node " + node1 + " does not exist");
            return;
        }
        adjList.get(node1).add(node2);
        edgeCount++;
    }

    public boolean areNeighbors(int node1, int node2) {
        if (!adjList.containsKey(node1) || !adjList.containsKey(node2)) {
            System.out.println("WARN: One or both nodes do not exist");
            return false;
        }
        return adjList.get(node1).contains(node2);
    }

    public List<Integer> getNeighbors(int node) {
        if (!adjList.containsKey(node)) {
            System.out.println("WARN: Node " + node + " does not exist");
            return new ArrayList<>();
        }
        return adjList.get(node);
    }

}