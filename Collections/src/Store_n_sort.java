import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class StudentDetails {
	public int id;
	public String name;
	public int salary;
	

	public StudentDetails(int id, String name,int salary) {
		super();
		this.id=id;
		this.name = name;
		this.salary=salary;
	}
}
	class idComparator implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			StudentDetails obj1=(StudentDetails)o1;
			StudentDetails obj2=(StudentDetails)o2;
			int diff=obj1.id-obj2.id;
			
				
			return obj1.id==obj2.id?obj1.name.compareTo(obj2.name):obj1.id-obj2.id;
		}
	}

class NameComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		StudentDetails obj1=(StudentDetails)o1;
		StudentDetails obj2=(StudentDetails)o2;
		
		return obj1.name.compareTo(obj2.name);
	}
}
class salaryComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		StudentDetails obj1=(StudentDetails)o1;
		StudentDetails obj2=(StudentDetails)o2;
		int diff=obj1.salary-obj2.salary;
		
			
		return obj1.salary==obj2.salary?obj1.name.compareTo(obj2.name):obj1.salary-obj2.salary;
	}
}

public class Store_n_sort {
	public static void main(String[] args) {
		
	
	ArrayList<StudentDetails>alist=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	int id=sc.nextInt();
	String name=sc.next();
	int salary=sc.nextInt();
	alist.add(new StudentDetails(id,name,salary));
	}
	Collections.sort(alist,new idComparator());
	for(StudentDetails s : alist)
		System.out.println(s.id+" "+s.name+" "+" "+s.salary);
	
	}
}