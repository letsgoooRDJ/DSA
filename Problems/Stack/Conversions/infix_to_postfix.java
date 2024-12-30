
class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int priority(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            
            case '*':
            case '/':
                return 2;
                
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String s) {
        // Your code here
        Stack<Character> stack = new Stack<>();
        String result="";
        for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }else if(ch == '('){
                stack.push('(');
            }else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(ch) ){
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        
        return result;
    }
}
