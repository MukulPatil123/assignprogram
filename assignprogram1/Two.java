import java.util.Scanner;
class Two
{

  public static void main(String []args)
  {
    Two obj=new Two();


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row");
    int row=sc.nextInt();

    System.out.println("Enter column");
    int col=sc.nextInt();

    int arr1[][]=new int[row][col];
    int arr2[][]=new int[row][col];

    System.out.println("Enter array");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.println("1st array");
        arr1[i][j]=sc.nextInt();
        System.out.println("2nd array");
        arr2[i][j]=sc.nextInt();
      }
    }

    int and[][]=new int[row][col];
    int or[][]=new int[row][col];

    System.out.println("AND operation: ");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        and[i][j]=arr1[i][j] & arr2[i][j];
      }
    }
    System.out.println("AND operation: ");
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.println(and[i][j])
      }
    }
    //OR operation
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        or[i][j]=and[i][j] | arr1[i][j];
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        System.out.println("AND operation");
        System.out.println(and[i][j]);
        System.out.println("OR operation");
        System.out.println(or[i][j]);
      }
    }
    //convert 2D to 1D
    int bin[]=new int[row*col];
    int x=0;
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        bin[x]=or[i][j];
        //System.out.println("2D: "+bin[x]);
        x++;

      }
    }

    //convert binary to decimal
    int decimal=0;
    for(int i=0;i<bin.length-1;i++)
    {
      decimal+=bin[i]*Math.pow(2,i);

    }
    System.out.println("Decimal: "+decimal);

  }
}

