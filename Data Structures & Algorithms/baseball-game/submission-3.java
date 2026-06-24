class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int out = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(second + first);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        for(int num : stack){
            out+= num;
        }
        return out;
    }
}