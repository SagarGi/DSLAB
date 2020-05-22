import java.util.Stack;

class  StockSpanner
{
    Stack<Integer> stack;

    StockSpanner()
    {
        this.stack = new Stack<>();
    }

    public int next(int price)
    {
        int count = 1;
        if(stack.isEmpty())
        {
            stack.push(price);
        }
        else if(stack.peek() > price)
        {
            stack.push(price);
        }
        else
        {
                int i = stack.size() - 1;
                while(i >= 0)
                {
                    int stackPeek = stack.get(i);
                    if(stackPeek <= price)
                    {
                        count++;
                        i--;
                    }
                    else
                    {
                        break;
                    }
                }
            stack.push(price);
        }
        return count;
    }
}

class OnlineStockSpannerDemo
{
    public static void main(String[] args) {
        StockSpanner sp = new StockSpanner();
        System.out.println(sp.next(100));
        System.out.println(sp.next(80));
        System.out.println(sp.next(60));
        System.out.println(sp.next(70));
        System.out.println(sp.next(60));
        System.out.println(sp.next(75));
        System.out.println(sp.next(85));
       
       
    
    }
}