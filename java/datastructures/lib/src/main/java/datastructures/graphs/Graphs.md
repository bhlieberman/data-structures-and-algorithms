# Graphs

This is an implementation of a graph data structure in Java. It associates nodes (vertices) with other nodes using the concept of "edges".

## Challenge
Implement a graph data structure. The `Graph` class should provide a constructor and methods for performing various operations on the object, including adding vertices, edges, and returning its size (the number of vertices in the graph).

## Approach & Efficiency
I used a `java.util.Hashmap` to represent the adjacency list for my graph. This requires `O(n)` space for the vertices of the graph and provides constant time lookup as a consequence.

## API
`public Vertex<T> addVertex(T value)`: generic method for adding a vertex to the graph given a value of type T.

`public void addEdge(Vertex<T> start, Vertex<T> destination)`: generic method for adding an edge to the graph given two vertices. Also overloaded with an additional `int` parameter for specifying a weight for the edge.

`public List<Vertex<T>> getVertices()`: returns a list of the vertices in the graph.

`public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)`: returns a list of the neighbors of a given vertex.

`public int size()`: returns the number of vertices in the graph.

`public int compareTo()`: unimplemented

`public String toString()`: overridden method to return a string representation of the graph's adjacency list.
