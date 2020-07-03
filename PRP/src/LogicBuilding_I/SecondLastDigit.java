package LogicBuilding_I;
import java.util.*;
public class SecondLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int SDigit =(Math.abs(n)%100)/10;
  
   System.out.println(SDigit);
	}

}
