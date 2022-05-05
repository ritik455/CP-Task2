import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        //Declaring i for index and n for number
        int i,n;                                  
        //Initial array
        int a[]={1,2,3,4,5,6};                    
        int arr[]=new int[7];  //new array                   
        System.out.println("Enter an index and a number:");//Input operation
        i=Sc.nextInt();
        n=Sc.nextInt();
        for(int j=0;j<=6;j++)//logic 
        {
            if(j<i)
            arr[j]=a[j];
            else if(j==i)
            arr[j]=n;
            else if(j>i)
            arr[j]=a[j-1];
        }
        System.out.println("Array after inserting one element:");//Output operation
        for(int k=0;k<7;k++)
        {
            System.out.println(arr[k]);
        }
        Sc.close();
    }
}
