class A implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
{try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}}
System.out.println("Thread:"+Thread.currentThread().getName());
}}
class Main13
{
public static void main(String args[])
{
Thread a1=new Thread(new A());
a1.start();
}}