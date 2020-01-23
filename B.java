import java.util.*;
class A
{
int a,b;
A()
{
a=10;
b=10;
}
void show()
{
System.out.println("IN BASE CLASS");
System.out.println(a+b);
}
}
class B extends A
{
public static void main(String args[])
{
B o=new B();
o.show();
}}