class Solution {
    public boolean isValid(String s) {
    // 1. Map closing brackets to their matching opening brackets
    HashMap<Character, Character> map = new HashMap<>();
    map.put(']', '[');
    map.put(')', '(');
    map.put('}', '{');

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (map.containsKey(c)) {
            if (stack.isEmpty() || stack.pop() != map.get(c)) {
                return false;
            }
        } else {
            stack.push(c);
        }
    }
    return stack.isEmpty();
}
}
