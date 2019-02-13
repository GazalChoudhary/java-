import java.util.Scanner;
 class Pyramid
{
    public static void main(String [] args) 
    {
        int n, i, j ;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int k=n-1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= k; i++)   
            {
                System.out.print(" ");
            }
            k--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
	}
}