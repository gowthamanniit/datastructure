// 1. regular inner class
/*class Employer
{
	private int money=1000;
	class Employee
	{
		private int money=2000;
		void display()
		{
		 System.out.println("answer = "+money);	
		 System.out.println("answer = "+this.money);
		 System.out.println("answer = "+Employer.this.money);
		}		
	}
}




public class InnerClass 
{
	public static void main(String[] args) 
	{
		Employer er=new Employer();
		Employer.Employee em=er.new Employee();
		em.display();		

	}
}
*/
class Teacher
{
	int x=100;
	void display()
	{
		int x=200;
		class Student
		{
			int x=300;
			void display()
			{
				int x=400;
				System.out.println(" answer = "+x); 
				System.out.println(" answer = "+this.x);
				System.out.println(" answer = "+Teacher.this.x);
				
			}			
		}	
		Student obj=new Student();
		obj.display();
	}
}

public class InnerClass 
{
	public static void main(String[] args) 
	{
		Teacher t=new Teacher();
		t.display();
	}
}
	