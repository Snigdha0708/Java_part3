import java.util.*;
class Test<t>
{
t a;
Test(t v)
{
a=v;
}
t print(Test a1)
{
System.out.print(a);
return this.a;
}}
class Main991
{
public static void main(String args[])
{
Test<Integer>t1=new Test<Integer>(100);
t1.print(t1);
Test<String>t2=new Test<String>("Snigdha");
t2.print(t2);
}}
