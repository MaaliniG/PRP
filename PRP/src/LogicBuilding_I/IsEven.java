package LogicBuilding_I;
import java.util.*;
public class IsEven {
    public static void Even(int n)
    {   Math.abs(n);
    	if(n%2==0)
    	{
         System.out.println("2");
        }
    
    	else {
    		System.out.println("1");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Even(n);
  
	}

}
