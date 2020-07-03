package LogicBuilding_I;
import java.util.*;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  int lDigit=Math.abs(n)%10;
  
  System.out.println(lDigit);
  
	}

}
