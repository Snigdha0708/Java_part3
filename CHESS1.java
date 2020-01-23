import java.util.*;
class CHESS1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
int b=s.nextInt();
int c=a;
if((b%2!=0)&&(c%2!=0))
System.out.println("BLACK");
else
System.out.println("WHITE");
}}