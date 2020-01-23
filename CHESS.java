import java.util.*;
class CHESS
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
int b=s.nextInt();
int c=a;
int d=0;
d=c+b;
if(d%2==0)
System.out.println("BLACK");
else
System.out.println("WHITE");
}}