class Solution {
    static String postToPre(String str) {
        // code here
        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push("" + ch + "");
            }else{
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push(ch + s2 + s1);
            }
        }
        
        return stack.pop();
    }
}
