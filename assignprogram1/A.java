class A
{
	public static void main(String [] args)
	{
	
	System.out.println("Enter Number");
	
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	int arr[][]=new arr[n][n];
	
	System.out.println("Enter values of array");
	
	for(int i=0;i<n;i++)
	{
	Scanner sc1=new Scanner(System.in);
	int arr[i][j]=sc1.nextInt();
	}
	
	System.out.println("Opposite index elements:");
	int sum;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	sum=arr[i][j]+arr[j][i];

	System.out.println("Check whether Prime or not");
	int fact=0;

	for(int k=2;k<sum;k++)
	{
	if(sum/k%2==0)
	{
	
	fact=fact+1;
	break;
	}
	}

	System.out.println("Check whether addition is odd or even");

	while(sum>0)
	{
	int temp=0;
	a=sum%10;
	a1=a+temp;
	sum=sum/10;
	}

	if(a1%2!=0 && fact==0)
	System.out.println(sum+ "Prime Number and Digit Addition is Odd Number");
	
	}

	}
}