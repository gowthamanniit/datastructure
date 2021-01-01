
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="            i            am       good         man          ";
		int len=text.length();
		int i,j;
		String res="";
		for(i=0;i<len-1;i++)
		{
			if(text.charAt(i)==' ' && text.charAt(i+1)==' ')
				continue;
			else
				res=res+text.charAt(i+1);
			// i  -->  i' '-->   i' 'a 
		}
		if(text.charAt(i)==' ')
			System.out.println("Finally  Text="+res.substring(0,res.length()-1));
		else
			System.out.println("Finally  Text="+res);
			
	}
}