import java.util.Stack;

/**
 *
 * @author Sai
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        
        if(s.length()%2 == 1){
            return false;
        }
        
        Stack<Character> stack = new Stack<Character>(); 
        
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            
            if(temp=='('|| temp=='{' || temp =='['){
                stack.push(temp);
            }
            else if(temp == ')' && !stack.empty() && stack.peek()=='('){
                    stack.pop();
            }else if(temp == '}' && !stack.empty() && stack.peek() == '{'){
                    stack.pop();
            }else if(temp == ']' && !stack.empty() && stack.peek() == '['){
                    stack.pop();
            } else{
                return  false;
            }
        }
        return stack.empty() ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("["));
        System.out.println(isValid("){"));
        System.out.println(isValid("([)]"));
    }
}
