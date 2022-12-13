package datastructures.graphs;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

  @Test
  void testAddVertex() {
    Graph<String> g = new Graph<>(10);
    g.addVertex("Data science languages");
    assertEquals(new LinkedList<String>(), g.adjacencyLists.get(new Vertex<>("Data science languages")));
  }

  @Test
  void testAddEdge() {
    Graph<String> g = new Graph<>(10);
    g.addVertex("Julia");
    g.addVertex("Python");
    g.addEdge(new Vertex<>("Python"), new Vertex<>("Julia"));
    Edge<String> e = new Edge<>(new Vertex<>("Julia"));
    assertEquals(e.destination, g.adjacencyLists.get(new Vertex<>("Python")).get(0).destination);
  }

  @Test
  void testGetVertices() {
    Graph<String> g = new Graph<>(10);
    g.addVertex("Data science languages");
    g.addVertex("Python");
    g.addEdge(new Vertex<>("Data science languages"), new Vertex<>("Python"));
    assertEquals(2, g.getVertices().size());
  }

  @Test
  void testGetEdges() {
    Graph<String> g = new Graph<>(10);
    g.addVertex("Data science languages");
    g.addVertex("Python");
    g.addEdge(new Vertex<>("Data science languages"), new Vertex<>("Python"));
    assertEquals(1, g.getNeighbors(new Vertex<>("Data science languages")).size());
  }

  @Test
  void testSize() {
    Graph<String> g = new Graph<>(10);
    g.addVertex("Data science languages");
    g.addVertex("Python");
    g.addEdge(new Vertex<>("Data science languages"), new Vertex<>("Python"));
    assertEquals(2, g.size());
  }
}
