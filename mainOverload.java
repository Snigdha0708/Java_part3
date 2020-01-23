import java.util.Scanner;
class Overload
{
void disp()
{
System.out.println("NO PARAMETERS");
}
void disp(int a)
{
System.out.println("INTEGER PASSED");
}
void disp(int a,char b)
{
System.out.println("INTEGER AND CHAR PASSED");
}}
class mainOverload
{
public static void main(String args[])
{
Overload s=new Overload();
s.disp();
s.disp(1);
s.disp(1,'a');}}