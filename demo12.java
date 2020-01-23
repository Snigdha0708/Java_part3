class demo12
{
public static void main(String args[])
{
int ar[]=new int[5];
try
{
ar[5]=10;
System.out.println(ar[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Error");
}}
}

