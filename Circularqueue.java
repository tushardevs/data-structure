package arraylist;

public class Circularqueue {
    public int data[];
    public int end=0;
    public int front=0;
    public int size=0;
    public int DEFAULT_SIZE=10;

    public Circularqueue() {
        this.data=new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        if(size==data.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(end==front){
            return true;
        }
        return false;
    }

    public void insert(int value){
        if(isFull()){
            System.out.println("queue is full");;
        }
        else{
            this.data[end++]=value;
            end=end%data.length;
            size++;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return 0;
        }
        int temp=data[front];
        front++;
        front=front%data.length;
        size--;
        return temp;
    }

    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(data[(front+i)%data.length]);
        }
    }
}
