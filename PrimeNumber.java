//This program checks if a number is a prime number or not in Java

public class PrimeNumber {
    public static boolean isPrime(int num)
    {
        if(num < 2)
        {
            return false;
        }

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        int num = 2;
        if(isPrime(num))
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}
