import java.util.*;

public class Batting {
   int number;
   Random pitch = new Random();
   
   public String normalPitch() {
      String[] result = new int[25];
      for (int i = 0; i <= 24; i++) {
         result[i] = "strike";
      for (int i = 1; i <= 4; i++) {
         result[randomPitch()] = "hit";
      }
      for (int i = 5; i <= 14; i++) {
         result[randomPitch()] = "ball";
      }
      if(result[number] = "hit") {
         return hit();
      } else if(result[number] = "ball") {
         return "ball";
      } else if(result[number] = "strike") {
         return "strike";
      }
      
   public int randomPitch() {
   return pitch.nextInt(25) + 1;
   }
   
   public String hit   






}