class Info
{
int feet;
int inches;
Info()
{
feet=inches=0;
}
Info(int a,int b)
{
feet=a;
inches=b;
}
void convert()
{
System.out.println(feet*12+inches);
}}
class Demo
{
public static void main(String args[])
{
Info i1=new Info();
Info i2=new Info(5,7);
i1.convert();
i2.convert();
}}