import java.util.Scanner;
class TwoDimention
{
  public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  TwoDimention obj=new TwoDimention();
  int row,column;

  System.out.println("Enter r and C");

   row=sc.nextInt();
   column=sc.nextInt();
   int arr1[][]=new int[row][column];
   int arr2[][]=new int[row][column];

    for(int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
        {
         System.out.println("enter 1st arr");
         arr1[i][j]=sc.nextInt();
         System.out.println("enter 2nd arr");
         arr2[i][j]=sc.nextInt();

        }
    }

    int and[][]=new int[row][column];
    int or[][]=new int[row][column];

  //perform And operation
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<column;j++)
      {
        and[i][j]=arr1[i][j]&arr2[i][j];
      }
    }

      System.out.println("and operation elemnts");
      for(int i=0;i<row;i++)
        {
         for(int j=0;j<column;j++)
         {
             System.out.println(and[i][j]);
            }
          }

//perform OR operation
       for(int i=0;i<row;i++)
         {
          for(int j=0;j<column;j++)
             {
                or[i][j]=arr1[i][j] | and[i][j];
              }
            }

    int arr3[]=new int[10];
    int c=0;

    System.out.println("or opert");
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<column;j++)
        {
          arr3[cnt]=or[i][j];
          System.out.println(arr3[c]);
          c++;
        }
      }

//perform binary to decimal
    int inc=0, decimal=0;
    for(int k=0;k<arr3.length-1;k++)
    {
        decimal += arr3[k]*Math.pow(2, inc);
        inc++;
    }



System.out.println("decimal is: "+decimal);


}
}
