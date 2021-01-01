public class BubbleSort {
	public static void main(String[] args) {

  int arr[]= {5,1,2,2,7,7,8,8,4,4,9};
  int len=arr.length;
  int i,j,temp;
  
  //   i=0  i<6-1 ; 
  for (i=0;i<len-1;i++)
  {
	  for(j=0;j<len-1-i;j++)
	  {
		  if (arr[j]>arr[j+1])
		  {
			  temp=arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
		  }
	  }	  
  }	

  System.out.println("\nBubble sort:");
  for(i=0;i<len;i++)
  {
	  System.out.print(" "+arr[i]);
  }
  
}
}