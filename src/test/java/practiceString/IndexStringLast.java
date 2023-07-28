package practiceString;

public class IndexStringLast {

	public static void main(String[] args) {
	
		int ind;
		String cityName="Tiruvananthapuram";
		ind =cityName.lastIndexOf('a', 13);
		System.out.println(ind);
		
		
		ind = cityName.indexOf('a');
		System.out.println(ind);
		
		ind=cityName.indexOf('a',cityName.indexOf('a')+1);
		System.out.println(ind);
	}

}



