import java.util.Random;

public class Die {
		
      private int faceValue;
      private final int MAX=6;
      private Random dieGen;
      
      public Die() {
          faceValue = 1;
          dieGen = new Random();
      }

      //Random integers from 1 - 6
      public void roll() {
          faceValue = dieGen.nextInt(MAX) + 1;
      }

      //Sets the face value
      public void setFaceValue(int value) {
        faceValue=value;
      }
      
      //Gets the face value

      public int getFaceValue() {
        return faceValue;
      }
       
      //Converts values into a String
      public String toString() {
        String result = "You rolled a " + faceValue;
        return result;
      }
}