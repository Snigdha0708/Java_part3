class Threadp extends Thread
{
public void run()
{
System.out.println("SNIGDHA");
}}
class Main155
{
public static void main(String args[])
{
Threadp A=new Threadp();
Threadp B=new Threadp();
A.start();
System.out.println(A.getPriority());
System.out.println(B.getPriority());
A.setPriority(6);
B.setPriority(9);
System.out.println(A.getPriority());
System.out.println(B.getPriority());
}}