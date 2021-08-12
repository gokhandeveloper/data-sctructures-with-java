import java.util.Stack;

public class StackJava {

    public static String stack() {
      String str = "abcd";
      Stack<Character> stack = new Stack<>();
      for(int i=0; i<=str.toCharArray().length; i++){
          stack.push(str.toCharArray()[i]);
      }
      StringBuffer reversed =  new StringBuffer();
      while(!stack.empty()) {
          reversed.append(stack.pop());
      }
      return reversed.toString();

    }

    public static boolean balancedExpression(String input) {
        Stack<Character> stack = new Stack<>();
        for( char ch: input.toCharArray()){
            if(ch=='(')
            stack.push(ch);
            if(ch==')')
                if(stack.empty()) return false;
                stack.pop();
        }
        return stack.empty();


    }

}
