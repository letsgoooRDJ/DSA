/*
1) if character push in stack
2) if operator pop top 2 characters from stack (a,b)
3) expression will be => (b,operator,a) push into stack

*/

class Solution {
    static String postToInfix(String str) {
        // code here
        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push("" + ch + "");
            }else{
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push("(" + s2 + ch +   s1 + ")");
            }
        }
        
        return stack.pop();
    }
}
