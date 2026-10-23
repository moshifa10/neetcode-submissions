class Solution {
    public boolean isValid(String s) {

        LinkedList<Character> stack = new LinkedList<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for (char c: s.toCharArray()){
            if(map.containsKey(c)){
                if(  (stack.isEmpty() || stack.removeLast() != map.get(c))){
                    return false;
                }
            }else{
                stack.addLast(c);
            }   
        }

        return stack.isEmpty();

    }
}
