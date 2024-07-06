package com.company.advance.graph;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseAGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(5); // 5 nodes in graph
        graph.addEdge(0,1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        graph.traversal(0);
    }
}

class Graph{
    int vertices;
    LinkedList<Integer> adjList[];

    // initialize Aj. List for a graph
    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for(int i=0;i<vertices;i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        // add neighbour to vth vertex
        adjList[v].add(w);
    }

    void traversal(int startNode) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        //mark incoming node as visited, add it to queue
        visited[startNode] = true;
        queue.add(startNode);

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.println("current node "+currentNode);

            for(int neighbour: adjList[currentNode]) {
                if(!visited[neighbour]) { //if not visited
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }
}
