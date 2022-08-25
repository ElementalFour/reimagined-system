public class CollatzConjecture
{
    public static void main(String args[])
    {
        int x = 9;
        System.out.println(x);
        System.out.println(collatzConjecture(x));
    }
    public static String collatzConjecture(int z)
    {
        if(z == 1)
        {
            return "Collatz conjecture 4 - 2 - 1 loop confirmed.";    
        }
        else if (z % 2 == 0 )
        {
            return collatzConjecture(evenCollatz(z));
        }
        else
        {
            return collatzConjecture(oddCollatz(z));
        }
    }
    public static int oddCollatz(int z)
    {
        z = 3 * z + 1;
        System.out.println(z);
        return z;
    }
    public static int evenCollatz(int z)
    {
        z = z / 2;
        System.out.println(z);
        return z;
    }
}