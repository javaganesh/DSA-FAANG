package com.dsa.Queue;
class MyCQueue{
    private int fornt;
    private int rear;
    int[] arr;
    public MyCQueue(int size){
     fornt=-1;
     rear=-1;
     arr=new int[size];

    }
    public void add(int elemnt){
        if(rear==arr.length){
            System.out.println("Queue is alredy full");
            return;
        }

        if(fornt==-1){
            fornt=0;
            rear=0;
            arr[rear]=elemnt;
        }
        else{
            arr[++rear]=elemnt;
        }

    }
    public int removeElemnt(){
        if(arr.length==0){
            System.out.println("Queue is Empty");
            return -1;
        }
       fornt++;
        return arr[fornt-1];
    }
    public boolean isEmpty(){
        if(fornt==-1)
            return true;
        else {

            return false;
        }
    }
public void display(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=fornt;i<=rear;i++){
                System.out.println(arr[i]);
            }
        }
}


}

public class QueueUsingArray {
    public static void main(String[] args) {
    MyCQueue myCQueue=new MyCQueue(10);
    myCQueue.add(1);
    myCQueue.add(2);
    myCQueue.add(3);
    myCQueue.add(4);
    myCQueue.display();
        System.out.println("================");
    myCQueue.removeElemnt();
        myCQueue.display();
        myCQueue.removeElemnt();
        myCQueue.display();
        myCQueue.removeElemnt();
        myCQueue.display();

    }
}
