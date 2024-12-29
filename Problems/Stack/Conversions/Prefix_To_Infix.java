class Solution {
    
    static String preToInfix(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);

        String str = sb.reverse().toString();
        
        Stack<String> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
             stack.push("" + ch + "");
            }else{
                String ss = stack.pop();
                String ss2 = stack.pop();
                stack.push("(" + ss + ch + ss2 + ")");
            }
        }
        
        str = stack.pop();
        
        
        
        return str;
    }
}
