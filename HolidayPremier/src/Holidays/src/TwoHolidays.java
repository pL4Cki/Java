public class TwoHolidays {
	public static void main(String[] args){
		Holiday place1 = new Holiday("10/03/2017" , "10/04/2017" , "Poland" , "£400");
		Holiday place2 = new Holiday("20/05/2017" , "20/06/2017" , "Austria" , "£700");

		System.out.println("This is the first destination");
		System.out.println(place1.getplace());
		System.out.println(place1.getstartDate());
		System.out.println(place1.getendDate());
		System.out.println(place1.getprice());
		
		System.out.println();
		
		System.out.println("This is the second destination");
		System.out.println(place2.getplace());
		System.out.println(place2.getstartDate());
		System.out.println(place2.getendDate());
		System.out.println(place2.getprice());
	}
	
}