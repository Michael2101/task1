public class task {
    public static void main(String[] args){
        System.out.println(reminders(1, 3));
        System.out.println(triArea(10, 20));
        System.out.println(animals(2, 3, 5));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('a'));
        System.out.println(addUpTo(7));
        System.out.println(nextEdge(8, 10));
        int[] numbers = new int[]{ 3,4,5 };
        System.out.println(sumCube(numbers));
        System.out.println(abcmath(42, 5, 10));
    }
    public static int reminders (int a, int b)
    {
        return a%b;
    }
    public static double triArea (float height, float length)
    {
        return (0.5 * height * length);
    }
    public static int animals (int chickens, int cows, int pigs)
    {
        return chickens * 2 + cows * 4 + pigs * 4;
    }
    public static boolean profitableGamble(double prob, double prize, double pay)
    {
        return (prob * prize > pay);
    }
    public static String operation(int N, int a, int b)
    {
        String result = "none";    

        if (a + b == N) {result = "aadded";}
        if (a - b == N) {result = "subtracted";}
        if (a * b == N) {result = "multiplicated";}
        if (a / b == N) {result = "divided";}

        return result;
    }
    public static int ctoa (char a)
    {
        return a;
    }
    public static int addUpTo (int a)
    {
        int sum = 0;
        for (int i = a; i > 0; i--)
        {
            sum += i;
        }
        return sum;
    }
    public static int nextEdge (int a, int b)
    {
        return (a+b-1);
    }
    public static int sumCube(int cubes[])
    {
        int sum = 0;
        for (int i=0; i < cubes.length; i++)
        {
            sum += cubes[i] * cubes[i] * cubes[i];
        }
        return sum;
    }
    public static boolean abcmath (int a, int b, int c)
    {
        for (int i = b; i > 0; i--)
        {
            a+=a;
        }
        return (a%c == 0);
    }
}
