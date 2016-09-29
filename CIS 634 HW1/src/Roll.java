public class Roll {

		//Creates two die and rolls them
		public static void main (String[] args ) {
		Die d1, d2 ;
		int sum ;
	
		//Two Die objects
		d1 = new Die() ;
		d2 = new Die() ;
		
		d1.roll() ;
		d2.roll() ;
		
		System.out.println ( " Die One: " + d1 + " , Die Two: " + d2 ) ;
		
		sum = d1.getFaceValue() + d2.getFaceValue();
		System.out.println ( " Sum: " + sum ) ;

   }
}
