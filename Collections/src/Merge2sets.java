import java.util.*;
public class Merge2sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str;
TreeSet<String> h=new TreeSet<>();
String a[]=new String[n];
String b[]=new String[n];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
h.add(a[i]);
}
TreeSet<String> h1=new TreeSet<>();
for(int i=0;i<n;i++)
{
b[i]=sc.next();
h1.add(b[i]);
}
h.addAll(h1);

ArrayList<String> list=new ArrayList<>();
list.addAll(h);
System.out.println(list);
	}

}
