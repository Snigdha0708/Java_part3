import java.util.*;
class Account
{
int bal;
public Account(int m)
{
bal=m;
}
synchronized public boolean is_suff(int w)
{
if(bal>w)
return true;
else
return false;
}
synchronized void withdraw(int amt)
{
bal=bal-amt;
System.out.println("Current Balance="+bal);
}}
class Customer implements Runnable
{
Account ac;
String name;
public Customer(Account a,String n)
{
ac=a;
name=n;
}
public void run()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter amount to withdraw");
int amt=s.nextInt();
if(ac.is_suff(amt))
{
ac.withdraw(amt);
}
else
System.out.println("Not sufficient");
}}
public class sync12
{
public static void main(String args[])
{
Account a1=new Account(5000);
Customer c1=new Customer(a1,"Snigdha");
Customer c2=new Customer(a1,"Aggarwal");
Thread t1=new Thread(c1);
Thread t2=new Thread(c2);
t1.start();
t2.start();
}}