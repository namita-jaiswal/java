package maths;
import java.util.Scanner;

public class sum
{
    static int logic(int n)
    {
        int sum=0,i;
        if (n>0)
        {
            for(i=1;i<=n;i++)
            {
               sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int x;
        Scanner num = new Scanner(System.in);
        x = num.nextInt();
        num.close();
        System.out.println(logic(x));
    }
}