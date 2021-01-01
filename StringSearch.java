
public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String arr[]= {"gowthaman","santhosh","rajan","anbu","anu","ananth"};
       String ss="an";
       boolean test=false;
       for(int i=0;i<arr.length;i++)
       {   
    	   
    	   if (arr[i].contains(ss))
    	   //if (arr[i].startsWith(ss)==true || arr[i].endsWith(ss)==true)
    	   {
    		   System.out.println("the word "+ss+ " is found at postion"+i+"="+arr[i]);
    		   test=true;
    	   }
       }
       if(test==false)
    	   System.out.println("not found");
		
	}
}