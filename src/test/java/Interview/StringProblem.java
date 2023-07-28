package Interview;

public class StringProblem {

	public static void main(String[] args) {
	
		String s="Simple Sample";
		
		String arr[]= s.split(" ");
		
		char m1=arr[0].charAt(0);
		char m2=arr[1].charAt(0);
		
		if(m1==m2) 
			System.out.println("true");
		else
			System.out.println("false");
		
		
		

	}
}