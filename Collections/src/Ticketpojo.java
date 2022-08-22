import java.util.Scanner;
import java.util.TreeSet;
public class Ticketpojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String price;
	String source,destination;
		TreeSet<String> ts=new TreeSet<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			price=sc.next();
			source=sc.next();
			destination=sc.next();
			ts.add(price);
			ts.add(source);
			ts.add(destination);
			
			//System.out.println(ts);

		}
		for(String str1:ts)
		{
		System.out.println(str1);
		}
	}

}
