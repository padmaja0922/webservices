import java.util.*;
public class Randm {
	public static void main(String[] args) {
		 String aToZ="SIVAKIRAN02041992"; // 36 letter.
		  String randomStr=generateRandom(aToZ);
System.out.println(randomStr);
		}

		private static String generateRandom(String aToZ) {
		    Random rand=new Random();
		    StringBuilder res=new StringBuilder();
		    for (int i = 0; i < 18; i++) {
		       int randIndex=rand.nextInt(aToZ.length()); 
		       System.out.println("index is :"+randIndex);
		       res.append(aToZ.charAt(randIndex));            
		    }
		    return res.toString();
		
		
		}

}
