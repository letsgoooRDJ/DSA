import java.util.*;
public class Main{
  public static class Stack{
    // static int  arr[]=new int[5];
    // static int  top=-1;

    static ArrayList<Integer> arr=new ArrayList<>();
    
    public static int peek(){
      if(arr.size() == 0) {
        System.out.println("Empty");
        return -1;
      }
      return arr.get(arr.size() - 1);
    }

    public static void push(int n){
       arr.add(n);
    }
    public static int pop(){
       if(arr.size() == 0) {
        System.out.println("Empty");
        return -1;
      }
      int peek = arr.get(arr.size() - 1);
      arr.remove(arr.size() - 1);
      return peek;
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
