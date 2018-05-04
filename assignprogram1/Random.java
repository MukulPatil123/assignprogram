class Random
{
	public static void main(String[] args) 
	{
		int arr[]={5,3,5,6,2,1};
		int n=arr.length;
		int k=8;
		System.out.println("Number which appears more than n/k times"+maxRepeat(arr,n,k));
		
	}

	static int maxRepeat(int arr[],int n,int k)
	{
		for(int i=0;i<n;i++)
			arr[arr[i]%k]+=k;

		int max=arr[0],result=0;
		for(int i=0;i<n;i++)
			if(arr[i]>max)
			{
				max=arr[i];
				result=i;
			}
	}
}