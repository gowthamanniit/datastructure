public class SortChar {
	public static void main(String[] args) {
		String text="sudharshan";
		int len=text.length();
		int i,j;
		char temp;		
		char c[]=new char[len];
		char d[]=new char[len];
		
		c=text.toCharArray();		
		d=text.toCharArray();
		
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(c[i]>c[j])   // s>a				
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;			
				}
			}			
		}
		System.out.println("Input"+text);
		System.out.println("Result :");		
	System.out.println("Ascending Order Char's wise :");		
		
		for(i=0;i<len;i++)
		{
			System.out.print(c[i]);
		}

//		boolean t=false;

		System.out.println("\n\nAscending Order number or index wise :");		
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			if(c[i]==d[j])
			{				
				System.out.print(j);
				d[j]=' ';
				break;
			}
		}
			
	}}