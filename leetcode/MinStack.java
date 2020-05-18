public class MinStack
{
    int top;
    int stack[];

    public MinStack()
    {
        this.top = -1;
        this.stack = new int[100];
    }

    public void push(int x)
    {
       top++;
       stack[top] = x;
    }

    public void pop()
    {
        top--;
    }

    public int top()
    {
        return stack[top];
    }

    public int getMin()
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= top; i++)
        {
            if(min > stack[i])
            {
                min = stack[i];
            }
        }

        return min;
    }

    public void  displayStack()
    {
        for(int i = 0; i <= top; i++)
        {
            System.out.println(stack[i]);
        }
    }
}

class MinStackDemo
{
    public static void main(String[] args) {

        MinStack ms = new MinStack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println("Min = "  + ms.getMin());
        System.out.println(ms.top);
        // ms.displayStack();
        
    }
}