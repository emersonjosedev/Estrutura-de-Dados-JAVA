package meuPacote;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList<>();
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int from, int to) {
        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from); // Para um grafo não-direcionado, adicione a aresta nos dois sentidos
    }

    public void display() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + i + ":");
            for (Integer vertex : adjacencyList.get(i)) {
                System.out.print(" " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        System.out.println("Lista de Adjacência do Grafo:");
        graph.display();
    }
}
