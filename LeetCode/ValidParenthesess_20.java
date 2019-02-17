import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesess_20 {
    public static void main(String[] args) {
        String str = "]";
        ValidParenthesess_20 instance = new ValidParenthesess_20();
        System.out.println(instance.isValid4(str));
    }

    public Boolean isValid4(String str) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : str.toCharArray()) {
            if(c == '[') {
                stack.add(']');
            } else if(c == '{') {
                stack.add('}');
            } else if(c == '(') {
                stack.add(')');
            } else if(stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public Boolean isValid3(String str) {
        Map<Character, Character> mapping = new HashMap<Character, Character>();
        mapping.put(']', '[');
        mapping.put('}', '{');
        mapping.put(')', '(');
        Stack<Character> stack = new Stack<Character>();
        for(char c : str.toCharArray()) {
            if(mapping.containsKey(c)) {
                Character topElement = stack.isEmpty() ? '#' : stack.pop();
                System.out.println(topElement + " " + mapping.get(c));
                if(!topElement.equals(mapping.get(c))) {
                    return false;
                }
            } else {
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }

    public Boolean isValid2(String str) {
        ArrayList<String> stack = new ArrayList<String>();
        Map<String, String> matchMap = new HashMap<String, String>();
        matchMap.put("{", "}");
        matchMap.put("[", "]");
        matchMap.put("(", ")");
        for(char c : str.toCharArray()) {
            if(matchMap.containsKey(String.valueOf(c))) {
                stack.add(String.valueOf(c));
            } else {
                String top = "";
                if(stack.size() >= 1) {
                    top = stack.get(stack.size() - 1);
                }
                if(!getKey(matchMap, String.valueOf(c)).equals(top)) {
                    return false;
                }
                stack.remove(stack.size() - 1);
            }
        }
        System.out.println(stack.toString());
        return stack.isEmpty();
    }

    public Boolean isValid(String str) {
        Stack<String> stack = new Stack<String>();
        Map<String, String> matchMap = new HashMap<String, String>();
        matchMap.put("{", "}");
        matchMap.put("[", "]");
        matchMap.put("(", ")");
        for(char c : str.toCharArray()) {
            if(matchMap.containsKey(String.valueOf(c))) {
                stack.push(String.valueOf(c));
            } else {
                if(!getKey(matchMap, String.valueOf(c)).equals(stack.peek())) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }

    public String getKey(Map<String, String> map, String value) {
        for(Map.Entry<String, String> item : map.entrySet()) {
            if(item.getValue().equals(value)) {
                return item.getKey();
            }
        }
        return "";
    }
}