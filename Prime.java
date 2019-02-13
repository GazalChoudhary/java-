
class Prime{
	public static void main(String [] args){
	
		int n=1000;
		System.out.println("Prime Numbers between 1 and 1000 are:");
			
		for(int i=1;i<=n;i++){
			boolean isPrime =true;
			for(int j=2;j<i;j++){
				if(i%j ==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i +" ");
		}
	}
}