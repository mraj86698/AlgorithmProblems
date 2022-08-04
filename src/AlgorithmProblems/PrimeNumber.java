package AlgorithmProblems;
/**
 * This is an prime Number in java
 * @author mraj
 *	To check number is prime or not
 */
public class PrimeNumber {
	//To check number is prime or not
    public static boolean isPrime (int number) {

     for(int i=2; i<=number/2; i++){
         if(number % i == 0){
             return false;
         }
     }
     return true;
    }

	  public static int[] primeNumbers(int n)
	    {
	            int a[]=new int[n];int k=0;
	            for(int i=0;i<n;i++)
	            {
	                if(isPrime(i))
	                {
	                    a[k]=i;
	                    k++;
	                }
	            }
	            int len=0;
	            for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0)
	                        len++;
	                }

	                int [] newArray = new int[len];
	                int j=0;
	                for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0) {
	                        newArray[j] = a[i];
	                        j++;
	                    }
	                }
	                System.out.println();

	            return newArray;
	    }
	//Method to display array
	    public static void display(int array[])
	    {

	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the nth term:");
		int n=Utility.inputInteger();
		int arr[]=new int[1000];
		arr=primeNumbers(n);
		display(arr);

	}

}
