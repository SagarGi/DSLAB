import java.util.Stack;

public class ValidParanthesis {

    public boolean isSameParanthesis(char one , char two)
    {
        if(one == '(' && two ==')')
        {
            return true;
        }

        if(one == '{' && two =='}')
        {
            return true;
        }

        if(one == '[' && two ==']')
        {
            return true;
        }

        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.isEmpty())
        {
            return true;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                if(isSameParanthesis(stack.peek(), s.charAt(i)))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        if(!stack.empty())
        {
            return false;
        }
        return true;
    }
}

class ValidParanthesisDemo
{
    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        String s = "()]";
        System.out.println(vp.isValid(s));

    }
}