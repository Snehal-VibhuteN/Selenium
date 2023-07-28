package Interview;

public class StrProgram {
	public static void main(String[] args) {
     String s="Simple Sample";
     System.out.println("In given string the words starts with same character: " +splitingString(s) );
		
		
	}

	  public static boolean splitingString (String s) {
		  
		  String []s1 =s.split(" ");
		  
		  char c1=s1[0].charAt(0);
		  char c2=s1[1].charAt(0);
		  
		  return c1==c2;
		  
	  } 
}

