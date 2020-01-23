class A implements Runnable
{
public void run()
{
int i=0;
for(i=0;i<10;i++)
{
System.out.println(i+"Thread A");
}
System.out.println("Thread name:"+Thread.currentThread().getName());
}}
class Main12
{
public static void main(String args[])
{
Thread a1=new Thread(new A());
a1.start();
}}
