import java.util.*;

public class School_invitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> hm=new HashMap<>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String name,type = " ",address;
for(int i=0;i<n;i++)
{
	name=sc.next();
	type=sc.next();
	address=sc.next();
	hm.put(name,address);
	
}
for(String s:hm.keySet())
{
	if(hm.get(s).contains("gmail")) {
		System.out.println(s+" needs  "+"Invitation type as email and the email id is :"+hm.get(s));
	
	
}
}

for(String s1:hm.keySet())
{
if(!hm.get(s1).contains("gmail")) {
	System.out.println(s1+" needs  "+"Invitation type as postal and the postalId is :"+hm.get(s1));
}
}
sc.close();
	}
	}


