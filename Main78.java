class GenDemo<T>
{
T obj;
GenDemo(T obj)
{
this.obj=obj;
}
void print()
{
System.out.println(this.obj);
}}
class Main78
{
public static void main(String args[])
{
GenDemo<Integer>G1=new GenDemo<Integer>(99);
G1.print();
GenDemo<String>G2=new GenDemo<String>("Chitkara");
G2.print();
}}