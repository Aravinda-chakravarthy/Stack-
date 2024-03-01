import java.util.Arrays;

public class Main{
    private int arr[];
    private int top;
    private int capacity;
    public Main(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x){
        if (isFull()){
            System.out.println("Stack overflow");
            System.exit(1);
        }
        System.out.println("Inserting " +x);
        arr[++top] = x;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top--];
    }
    public int getSize(){
        return top+1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public Boolean isFull(){
        return top == capacity-1;
    }
    public void printstack(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i] + " , ");
        }
    }
    public static void main(String[] args){
        Main stack = new Main(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack : ");
        stack.printstack();
        stack.pop();
        stack.pop();
        System.out.println("\nAfter popping out:");
        stack.printstack();
    }
}