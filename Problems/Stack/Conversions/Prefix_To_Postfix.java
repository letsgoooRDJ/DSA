class Solution {
    static String preToPost(String pre_exp) {
      
        Stack<String> stack = new Stack<>();
      
        StringBuilder sb = new StringBuilder(pre_exp);
        String str = sb.reverse().toString();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push("" + ch + "");
            }else{
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push(s1 +  s2 + ch);
            }
        }
        
        return stack.pop();
    }
}
