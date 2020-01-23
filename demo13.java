class demo13
{
public static void main(String args[])
{
System.out.println(0);
try
{
System.out.println(0);
int ar[]=new int[5];
ar[5]=10;
System.out.println(ar[5]);
}
catch(NullPointerException|ArrayIndexOutOfBoundsException|ArithmeticException e)
{
System.out.println(e);
}}}