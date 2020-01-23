class ThreadDemo implements Runnable
{
public void run()
{
System.out.println("IN THREAD");
}}
class Main11
{
public static void main(String args[])
{
Thread t1=new Thread(new ThreadDemo());
t1.start();
}}