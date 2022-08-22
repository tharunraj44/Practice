import java.util.*;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         HashMap<Integer,Integer> hm=new HashMap<>();
         int id,price;
         for(int i=0;i<n;i++)
         {
        	 id=sc.nextInt();
        	 price=sc.nextInt();
        	 hm.put(id, price);
         }
         for(Map.Entry hm1: hm.entrySet())
 		{
 			System.out.println(hm1.getKey()+"\t"+hm1.getValue());
 		}
	}

}
