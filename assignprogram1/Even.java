import java.util.Scanner;
class EvenNumber
{
  public void prime(int s)
  {
    int b,isPrime=0,tot=0;
    for(int k=2;k<=s/2;k++)
    {
      if(s%k==0)
      {
        isPrime=1;
        break;
      }
    }
    if(isPrime!=1)
    {
      while(value>0)
      {
        b=value%10;
        tot=tot+b;
        value=value/10;
      }
      if(tot%2==0)
        System.out.println("Even Number");
      else
        System.out.println("Odd Number");

    }


  }
  public static void main(String arg[])
  {
    EvenNumber obj=new EvenNumber();
    System.out.println("Enter row and column:");
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int sum=0;
    int arr[][]=new int[r][c];
    System.out.println("Enter value in matrix:");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[r][c]=sc.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++ )
      {
        sum=arr[i][j]+arr[j][i];
      }
    }
    obj.prime(sum);


  }
}
