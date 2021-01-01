
import java.util.Scanner;
public class Bsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    
		System.out.println("Enter the character:");
		char c=scan.next().charAt(0);  // i
		
		String text="niitkarur";
		
		boolean check=false;
		boolean firsttime=true;
		
		char arr[]=text.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(c==arr[i])
			{
				if (firsttime==true)
				{
					System.out.print("the char '"+c+"' is found at position:"+i);
					firsttime=false;
					check=true;
				}
				else
				{
					System.out.print(" --> "+i);
				}
			}
		}
		if(check==false)
			System.out.println("The given char '"+c+"' is not found");;
				
		scan.close();
	}
}
