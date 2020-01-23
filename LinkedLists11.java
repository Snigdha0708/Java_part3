import java.util.*;
class LinkedLists11
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
LinkedList<Integer> a=new LinkedList<Integer>();
int size=s.nextInt();
int addz;
for(int i=0;i<size;i++)
{
addz=s.nextInt();
a.add(addz);
}
a.set(2,10);
a.remove(2);
if(a.contains(2))
System.out.println("Yes");
else
System.out.println("No");
Collections.sort(a);
Iterator in=a.iterator();
while(in.hasNext())
System.out.print(in.next());
}}