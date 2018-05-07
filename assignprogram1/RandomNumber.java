import java.util.Scanner;
class Random
{
  public static void main(String[]args)
  {
    System.out.println("Enter Random Number: ");
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();

    System.out.println("Enter size");
    int n=sc.nextInt();

    int arr[]=new int[n];
    System.out.println("Enter values in array");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }

    //more than n/k times
    int appear=n/k;

    for(int x=0;x<n;x++)
    {
      int count=1;
      for(int y=x+1;y<n-1;y++)
      {
        if(arr[x]==arr[y]&&arr[x]!=0)
        {
          arr[y]=0;
          count++;
        }
      }
      if(count>=appear)
      {
        System.out.println(arr[x]+" "+count);
      }
    }


  }
}
