import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();
        stack.push("Main()");
        stack.push("Print()");
        stack.push("PrintHello()");
        
        for(String str:stack){
        
            System.out.println(stack.pop());
        }
        for(String str:stack){
            System.out.println(str);
        }
    }
}
