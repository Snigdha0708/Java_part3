import java.util.*;
class Calc
{
public void divide(int a,int b) throws Exception
{
if(a==5)
throw new Exception("a cannot be 5");
else
System.out.println(a/b);
}}
class Calc123
{
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
try
{
Calc c=new Calc();
c.divide(a,b);
}
catch(Exception e)
{
System.out.println(e);
}}}