import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        //System.out.printIn(stack.empty());

        stack.push("Ali");
        stack.push("Hassan");
        stack.push("Hussain");
        stack.push("Raza");
        stack.push("Muhammad");

        String myFavName = stack.pop();


        
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(("Ali")));
        

    }
    
}