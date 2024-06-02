package com.dsa.array;

public class GraphDS {
    private final int vertices;
    private final int[][] adjMatrix;

    public GraphDS(int n){
        this.vertices=n;
        adjMatrix=new int[n][n];

    }

    public void insertEdge(int u,int v,int x){
        adjMatrix[u][v]=x;


    }
    public void deletEdge(int u,int v){
        adjMatrix[u][v]=0;
    }



    public boolean existEdge(int u, int v) {
        return adjMatrix[u][v] != 0;
    }

    public int vertiexCount(){
        return  vertices;
    }

    public int edgeCount(){
        int count=0;
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                if(adjMatrix[i][j]!=0)
                    count++;
            }
        }

        return count;
    }
    public void edges(){
        System.out.println("Edges:");
        for(int i=0;i<vertices;i++){

            for(int j=0;j<vertices;j++){

                if(adjMatrix[i][j]!=0)
                    System.out.println(i+"--"+j);

            }
        }


    }

    public int outDegree(int v){
        int count=0;
        for(int i=0;i<vertices;i++){

            if(adjMatrix[v][i]!=0);
            count++;
        }
        return count;
    }
    public int indegree(int v) {
        int count = 0;
        for(int i=0;i<vertices;i++)
            if(adjMatrix[i][v]!=0)
                count = count + 1;
        return count;
    }


    public void display() {
        for(int i=0;i<vertices;i++) {
            for(int j=0;j<vertices;j++)
                System.out.print(adjMatrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }

}

