public class Cup
{
   protected Die d1, d2;
   private int value1, value2, total;

      //Creates two six-sided Die objects
      public Cup () {
      d1 = new Die();
      d2 = new Die();
      value1 = 1;
      value2 = 1;
      total = value1 + value2;
   }

   //Rolls dice and returns result
   public void roll () {
       d1.roll();
       d2.roll();
   }

   //Return total
   public int getDiceSum () {
	   total = getDie1() + getDie2();
      return total;
   }

   //Returns value of first die
   public int getDie1() {
	    return d1.getFaceValue();
   }

   //Returns value of second die
   public int getDie2 () {
	   return d2.getFaceValue();
   }
	
   //FaceValue of first die
	public void setDie1 (int value) {
		d1.setFaceValue(value);
	}

	//FaceValue of second die
	public void setDie2(int value) {
		d2.setFaceValue(value);
	}
	
	//Sets FaceValue of second die
	public String toString() {
	String result = "You rolled a " + total;

	return result;
   } 
	
}
