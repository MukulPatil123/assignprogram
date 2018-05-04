import java.util.Scanner;
class EvenPrime
{
 public static void main(String[] args) 
  {
  EvenPrime pr =new EvenPrime();
  Scanner sc= new Scanner(System.in);
  int i,j,row,column;
  System.out.println("Enter r and c");
   row=sc.nextInt();
   column=sc.nextInt();
    int arr[][] = new int[row][column];
    int tot=0;
    System.out.println("enter elemnts in array");
    for(int k=0;k<row;k++)
    {
     for(int l=0;l<column;l++)
     {
       arr[k][l]=sc.nextInt();
     }
    }
     for (i=0;i<row;i++)
     {
      for(j=0;j<column;j++)
       {
        sum=arr[i][j]+arr[j][i];
     
        pr.prime(tot,arr[i][j],arr[j][i]);
    }
    }
    public void prime(int tot,int n1,int n2)
     {
      int isPrime=0,flag=0,sum=0,number=tot;
       for(int a=2;a<=tot/2;a++)
        {
        if(number%a==0)
       {
       isPrime=1;
       break;
      }
      }
       if(isPrime!=1)
       {
         while(number>0)
         {
          sum=sum+n%10;
          number=number/10;
         }
           
       if(tot%2!=0)
        {
         System.out.println("addition "+n1+ " "+n2+" odd and prime"+tot );
        }
       }


  }
  }
}
