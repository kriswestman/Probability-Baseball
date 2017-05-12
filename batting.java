import java.util.*;

public class Batting {
   int number;
   Random pitch = new Random();
   
   public String normalPitch() {
      String[] result = new int[25];
      for (int i = 0; i <= 24; i++) {
         result[i] = "strike";
      for (int i = 1; i <= 4; i++) {
         result[pitch.nextInt(25) + 1] = "hit";
      }
      for (int i = 5; i <= 14; i++) {
         result[pitch.nextInt(25) + 1] = "ball";
      }
      if(result[number] = "hit") {
         return hit();
      } else if(result[number] = "ball") {
         return "ball";
      } else if(result[number] = "strike") {
         return "strike";
      }
   }
         
   public String hit() {
      int randomHit = pitch.nextInt(10) + 1;
      if(randomHit <= 4) {
         return "single";
      } else if(randomHit <= 7) {
         return "dub";
      } else if(randomHit = 8) {
         return "triple";
      } else if(randomHit > 8) {
         return "homeRun";
      }
   }
      
  }    
}