class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<tokens.length; i++){
            if (tokens[i].equals("/")){
                int first = stack.pop();
                int second = stack.pop();
                int total = second / first;
                stack.push(total);
            }
            else if (tokens[i].equals("+")){
                int first = stack.pop();
                int second = stack.pop();
                int total = second + first;
                stack.push(total);
            }
            else if (tokens[i].equals("-")){
                int first = stack.pop();
                int second = stack.pop();
                int total = second - first;
                stack.push(total);
            }
            else if (tokens[i].equals("*")){
                int first = stack.pop();
                int second = stack.pop();
                int total = second * first;
                stack.push(total);
            }

            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}
