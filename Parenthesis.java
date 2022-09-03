class Parenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> open = new ArrayList<>();
        open.add('(');
        open.add('{');
        open.add('[');

        Map<Character, Character> map2 = new HashMap<>();
        map2.put(')', '(');
        map2.put('}', '{');
        map2.put(']', '[');

        for(int i = 0; i < s.length(); i++) {
            if(open.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if(stack.empty() || stack.pop() != map2.get(s.charAt(i))) return false;
            }
        }

        return stack.empty();
    }
}