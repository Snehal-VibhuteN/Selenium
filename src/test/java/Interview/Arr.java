package Interview;
public class Arr {
	public static void main(String[] args) {	
		int[] arr= {12,34,10,6,40};
		int max=0;
		int x=0,y=0;
	
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   int sum =arr[i]+arr[j];
    		   if(sum>max)
    		   {
    			   max=sum;
    			   x=arr[i];
    			   y=arr[j];
    		   }
    	   }	   
	}
       System.out.println("Sum= "+max);
       System.out.println("First_Number= "+ x + "\nSecond_Number= " +y );
 }
}
	

