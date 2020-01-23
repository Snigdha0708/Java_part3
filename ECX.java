import java.util.*;
class ECX
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
try
{
if(a==5)
throw new Exception("a cannot be 5");
else
System.out.println(a/b);
}
catch(Exception e)
{
System.out.println(e);
}}}