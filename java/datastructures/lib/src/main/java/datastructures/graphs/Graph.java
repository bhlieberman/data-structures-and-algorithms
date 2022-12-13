package datastructures.graphs;

import java.util.*;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public void addVertex(T value)  // addNode()
  {
    Vertex<T> v = new Vertex<>(value);
    var newVertex = adjacencyLists.putIfAbsent(v, new LinkedList<>());
    if (newVertex == null) numberOfVertices += 1;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    adjacencyLists.get(start).add(new Edge<T>(destination));
  }

  public Set<Vertex<T>> breadthFirst(T root) {
    Set<Vertex<T>> visited = new LinkedHashSet<>();
    Queue<Vertex<T>> queue = new LinkedList<>();
    queue.add(new Vertex<T>(root));
    visited.add(new Vertex<>(root));
    while (!queue.isEmpty()) {
      Vertex<T> vertex = queue.poll();
      for (Edge<T> v : this.getNeighbors(vertex)) {
        if (!visited.contains(v.destination)) {
          visited.add(v.destination);
          queue.add(v.destination);
        }
      }
    }
    return visited;
  }

  public List<Vertex<T>> getVertices()  // getNodes()
  {
    return adjacencyLists.keySet().stream().toList();
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    return adjacencyLists.get(vertex);
  }

  public int size()
  {
    return numberOfVertices;
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    return adjacencyLists.toString();
  }
}
