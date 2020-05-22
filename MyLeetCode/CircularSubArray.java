class CircularSubArray
{
    public int maxSubarraySumCircular(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = A[0];
        int currentMax = A[0];
        int currentMin = A[0];

        if(A.length == 1)
        {
            return A[A.length - 1];
        }

        for(int i = 1; i < A.length; i++)
        {
            // find the max;
            currentMax = Math.max(A[i], currentMax + A[i]);
            if(currentMax > max)
            {
                max = currentMax;
            }

            currentMin = Math.min(A[i], currentMin + A[i]);
            if(currentMin < min)
            {
                min = currentMin;
            }

            total = total + A[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(total);

        if(max < 0)
        {
            return max;
        }
        else
        {
            return Math.max(max, total - min);
        }
    }
}

class CircularSubArrayDemo
{
    public static void main(String[] args) {
        CircularSubArray ca = new CircularSubArray();
        int A[] = {-2,-3,-1};
        System.out.println(ca.maxSubarraySumCircular(A));

    }
}