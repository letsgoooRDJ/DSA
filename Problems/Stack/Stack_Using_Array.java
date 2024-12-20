
public class Main{
  public static class Stack{
    static int  arr[]=new int[5];
    static int  top=-1;
    public static int peek(){
      if(top == -1) {
        System.out.println("Empty");
        return -1;
      }
      return arr[top];
    }

    public static void push(int n){
       if(top == arr.length - 1) {
        System.out.println( "Oerflow");
      }else{
          top++;
      arr[top] =n;
      }
    }
    public static int pop(){
       if(top == - 1) {
        System.out.println( "Empty");
        return -1;
      }
      int peek = arr[top];
       top--;
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
    System.out.println( s.pop());
    s.push(1);
    s.push(2);
    s.push(2);
    s.push(2);
    s.push(3);
    System.out.println(s.peek());
  }
}
