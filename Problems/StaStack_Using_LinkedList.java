import java.util.*;
public class Main{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      next=null;
    }
  }
  public static class Stack{

    public static Node head;
    public static boolean isEmpty(){
      
      return head == null;
    }

    public static void push(int n){
      Node newNode = new Node(n);
      if(isEmpty()){
        System.out.println("Empty");
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public static int pop(){
      int top=head.data;
      head=head.next;
      return top;
    }
    
    public static int peek(){
     int top=head.data;
      return top;
    }
  }
  public static void main(String []args){
 
    Stack s=new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println( s.peek());
    System.out.println( s.pop());
    System.out.println( s.peek());
    s.push(1);
    s.push(2);
    s.push(2);
    s.push(2);
    s.push(3);
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println( s.pop());
    System.out.println(s.peek());
  }
}
