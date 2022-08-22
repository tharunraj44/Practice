import java.util.*;
class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.marks=marks;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
	   return this.name;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return this.marks;
	}
}
class MarksComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return o1.getMarks()-o2.getMarks();
	}
	
}
class NameComparator2 implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class Students_marks
{
	
	public static void main(String args[])
	{
		ArrayList<Student>list=new ArrayList<>();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String name;
	    int marks;
	    for(int i=0;i<n;i++)
	    {
	     name=sc.next();
	     marks=sc.nextInt();
	    list.add(new Student(name,marks));
	    }
	    Collections.sort(list,new NameComparator2());
		for(Student s : list)
			System.out.println(s.name+" "+s.marks);
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			name=sc.next();
			marks=sc.nextInt();
		    hm.put(name, marks);
		}
		for(String s: hm.keySet())
		{
			if(hm.get(s)<=60)
			{
			System.out.println("Special classes for "+s+"\tValue: "+hm.get(s));
			}
		}
		for(String s1: hm.keySet())
		{
		if(hm.get(s1)>60)
		{
		System.out.println("No Special classes for "+s1+"\tValue: "+hm.get(s1));
		}
		}
				
}
}