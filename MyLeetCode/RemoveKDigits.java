import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int iterator = 0;
        while(iterator < num.length())
        {
            while(k > 0  && !stack.isEmpty() && stack.peek() > num.charAt(iterator))
            {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(iterator));
            iterator++;
        }

        // if k is still remaining just pop the stack element
        while(k > 0)
        {
            stack.pop();
            k--;
        }
        System.out.println(stack);

        // print it in reverse order and remove the leading zero
        StringBuilder string = new StringBuilder();
        while(!stack.isEmpty())
        {
            string.append(stack.peek());
            stack.pop();
        }

        string.reverse();

        // remove the leding zero
        while(string.length() > 1 && string.charAt(0) == '0')
        {
            string.deleteCharAt(0);
        }

        System.out.println(string);

        return new String(string);
    }
}

class RemoveKDigitsDemo
{
    public static void main(String[] args) {
       
            String num = "10";
            int k = 1;
            RemoveKDigits rd = new RemoveKDigits();
            System.out.println(rd.removeKdigits(num, k));
        
    }
}