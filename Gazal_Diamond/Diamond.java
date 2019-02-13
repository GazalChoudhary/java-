import java.util.Scanner;
 class Diamond
{
    public static void main(String [] args) 
    {
        int n, i, j ;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int k=n-1;
		/* printing upper triangle */
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= k; i++)  /* printing blank spaces*/ 
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
         k = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= k; i++) 
            {
                System.out.print(" ");
            }
            k++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        } 
    }
}