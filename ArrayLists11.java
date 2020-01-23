import java.util.*;
class ArrayLists11
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();
int size=s.nextInt();
int addz;
for(int i=0;i<size;i++)
{
addz=s.nextInt();
a.add(addz);
}
Collections.reverse(a);
System.out.println(a.get(2));
System.out.println(a);
}}