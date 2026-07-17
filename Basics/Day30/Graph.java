package Basics.Day30;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes; // Addidng headers to our Adjacency matrix.

     int[][] matrix;
    Graph (int size) { // the amount of nodes we might have.
        nodes = new ArrayList<>();
        matrix = new int[size] [size]; // No. of vertices squared.
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src, int dst){ // src is the row and dst is he column
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst){
        if ( matrix[src][dst] == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public void print(){
        System.out.print(" ");
        for (Node node : nodes ){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++){ // will iterate over all the matrices
            System.out.print(nodes.get(i).data + " "); 
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void DepthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src,visited);
    }
    private void dFSHelper(int src, boolean[] visited){ // invoked to see if the current node we are on is visted or not.
        if (visited[src]){
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " visited ");
        }
        for(int i = 0; i < matrix[src].length; i++){
            if(matrix[src][i] == 1){
                dFSHelper(i, visited);
            }
        }
        return;
    }
}
