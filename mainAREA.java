import java.util.Scanner;
class AREA
{
void area(int a)
{
System.out.println("Area of square="+(a*a));
}
void area(int a,int b)
{
System.out.println("Area of rectangle="+(a*b));
}}
class mainAREA
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
AREA A=new AREA();
A.area(a);
A.area(b,c);
}}