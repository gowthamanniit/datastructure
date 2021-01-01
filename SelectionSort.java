
public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {64,25,12,22,11};
		int len=arr.length;
		int i,j,minindex,temp;
		
		for(i=0;i<len-1;i++)
		{
			minindex=i;
			for(j=i+1;j<len;j++)
			{
				if (arr[j]<arr[minindex])
					minindex=j;
			}
			temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;			
		}
		System.out.println("Selection Sorted Array");
		for(i=0;i<len;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}