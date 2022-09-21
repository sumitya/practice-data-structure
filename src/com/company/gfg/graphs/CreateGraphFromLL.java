package com.company.gfg.graphs;

import java.util.LinkedList;

// Java Program to Implement the Unidirectional Graph
// Using Linked List

// Importing required classes from packages

class CreateGraphFromLL {

    // Method 1
    // To make pair of nodes
    static void
    addEdge(LinkedList<LinkedList<Integer>> Adj, int u,
            int v)
    {
        // Creating bi-directional vertex
        Adj.get(u).add(v);
        Adj.get(v).add(u);
    }

    // Method 2
    // To print the adjacency list
    static void
    printadjacencylist(LinkedList<LinkedList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); ++i) {

            // Printing the head
            System.out.print(i + "->");

            for (int v : adj.get(i)) {
                // Printing the nodes
                System.out.print(v + " ");
            }

            // Now a new lin eis needed
            System.out.println();
        }
    }

    // Method 3
    // Main driver method
    public static void main(String[] args)
    {

        // Creating vertex
        int V = 5;

        LinkedList<LinkedList<Integer> > adj
                = new LinkedList<LinkedList<Integer> >();
        for (int i = 0; i < V; ++i) {
            adj.add(new LinkedList<Integer>());
        }

        // Inserting nodes
        // Custom input node elements
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        // Printing adjacency list
        printadjacencylist(adj);
    }
}

