package datastructures.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    Vertex<T> v = new Vertex<>(value);
    var newVertex = adjacencyLists.putIfAbsent(v, new LinkedList<>());
    if (newVertex == null) numberOfVertices += 1;
    return v;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    adjacencyLists.get(start).add(new Edge<T>(destination));
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
