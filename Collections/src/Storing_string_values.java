import java.util.*;
public class Storing_string_values {

	public void remove(String str,String rem_ele,Set list)
	{
		list.remove(rem_ele);
	}
	public void display(HashSet list)
	{
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> list=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str,rem_ele;
		
		for(int i=0;i<n;i++)
		{
			 str=sc.next();
			list.add(str);
		}
		System.out.println(list);
		rem_ele=sc.next();
		
		Storing_string_values obj=new Storing_string_values();
		obj.remove(rem_ele, rem_ele, list);
		obj.display(list);
		
	}

}
