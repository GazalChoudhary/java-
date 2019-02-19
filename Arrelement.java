import java.util.Scanner;
public class Arrelement {
	
	public static void main(String [] args)
	{
	int i,n;
	Scanner sc=new Scanner(System.in); 

	System.out.println("Enter no of elements:");
	n=sc.nextInt();
	int a[]=new int[n];

	System.out.println("Enter elements of Array:");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();
	sc.close();
	
	int smallest = a[0];
	int largest = a[0];
	
	for(int j=0; j< a.length; j++)
	{
		if(a[j] > largest)
			largest = a[j];
		else if (a[j] < smallest)
			smallest = a[j];
		
	}
	
	System.out.println("Largest Number is : " + largest);
	System.out.println("Smallest Number is : " + smallest);
}
}


