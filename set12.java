import java.util.*;
class set12
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Set<Integer> se=new TreeSet<Integer>();
Set<Integer> se1=new TreeSet<Integer>();
se1.add(1);
se1.add(100);
se1.add(99);
se1.add(54);
se1.add(1);
se1.add(1);
se.add(100);
se.add(99);
se.add(54);
se.add(1);
se.add(2);
se.add(1000);
se.add(999);
se.retainAll(se1);
System.out.println(se);
se.addAll(se1);
System.out.println(se);
se1.removeAll(se);
System.out.println(se);
}}