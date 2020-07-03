package LogicBuilding_I;
import java.util.*;
public class SumLastDigit {
   public int addLastDigits(int input1,int input2)
   {
	   return input1+input2;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int x=Math.abs(sc.nextInt())%10;
   int y=Math.abs(sc.nextInt())%10;
   // System.out.println(x+","+y);
   SumLastDigit s=new SumLastDigit();
  System.out.println( s.addLastDigits(x, y));
	}

}
