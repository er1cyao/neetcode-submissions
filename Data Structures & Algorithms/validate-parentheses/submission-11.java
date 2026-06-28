class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        if (s.length() <= 1) return false;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            stack.push(s.charAt(i));

            else if (s.charAt(i)== ')'){
                if (stack.isEmpty() || stack.peek() != '(' ){
                    return false;
                }
                stack.pop();           
            }
            else if (s.charAt(i)== '}'){
                if (stack.isEmpty() || stack.peek() != '{'){
                    return false;
                }      
                stack.pop();     
            }
            else if (s.charAt(i)== ']'){
                if (stack.isEmpty() || stack.peek() != '[' ){
                    return false;
                } 
                stack.pop();          
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;

        
    }
}
