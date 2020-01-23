import java.util.*;
class QU
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Queue<Integer>a=new LinkedList<Integer>();
int size;
size=s.nextInt();
for(int i=0;i<size;i++)
{
a.add(s.nextInt());
}
System.out.println(a.peek());
System.out.println(a.poll());
System.out.println(a.size());
a.remove();
for(int i=0;i<size;i++)
{
System.out.println(a);
}}}