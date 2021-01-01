import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> mylist=new LinkedList<Integer>();
		Scanner scan=new Scanner(System.in);
		int choice;
		
		while(true)
		{
			System.out.println("\n1.insert 2.delete 3.display 4.exit \n Enter your Choice: ");
			int ch=scan.nextInt();
			
		switch(ch)
		{
		case 1:
			    System.out.println("Enter Element:");
				int ele=scan.nextInt();
				
				System.out.println("do you want to insert 1.begin 2. end 3.middle:\n Enter choice:");
				choice=scan.nextInt();
				if(choice==1)
				{
					mylist.addFirst(ele);
					System.out.println("successfully added at begin postion");
				}
				else if(choice==2)
				{
					mylist.addLast(ele);
					System.out.println("successfully added at end postion");
				}
				else if(choice==3)
				{				
				System.out.println("Enter Position");
				int pos=scan.nextInt();
				if (pos>=0 && pos<=mylist.size())
				{
					mylist.add(pos,ele);
					System.out.println("Successfully inserted at postitoin:"+pos);
				}
				else
				System.out.println("pls enter position correctly!!");				
				}
				else
				{
					System.out.println("Enter correct one: begin or end or middle");
				}
				break;
		case 2:				
			
			System.out.println("do you want to delete 1.begin 2. end 3.middle :\n Enter choice:");
			choice=scan.nextInt();
			if(choice==1)
			{
				mylist.pop();
				System.out.println("successfully deleted at begin postion");
			}
			else if(choice==2)
			{
				mylist.removeLast();
				System.out.println("successfully deleted at end postion");
			}
			else if(choice==3)
			{				
			System.out.println("Enter Position");
			int pos=scan.nextInt();
			if (pos>=0 && pos<=mylist.size())
			{
				mylist.remove(pos);
				System.out.println("Successfully deleted at postitoin:"+pos);
			}
			else
			System.out.println("pls enter position correctly!!");				
			}
			else
			{
				System.out.println("Enter correct one: begin or end or middle");
			}
			break;
			
			
		case 3:
			    System.out.println("\n Linked List Elements:");
				
			    /*Iterator<Integer> ob=mylist.iterator();
				while(ob.hasNext())
				{
					System.out.print(ob.next()+"--->");
				}*/
				
				ListIterator<Integer> ob1=mylist.listIterator();
				System.out.println("\n forward direction \n ");
				while(ob1.hasNext())
				{
					System.out.println(ob1.next()+"--->");
				}
				System.out.println("\n backward direction \n ");
				while(ob1.hasPrevious())
				{
					System.out.println("<---"+ob1.previous());
				}
				
				
				break;
		case 4:
				System.out.println("good bye");
				System.exit(0);
		default:
				System.out.println("Enter choice correctly");
		}
		}		
	}
}
