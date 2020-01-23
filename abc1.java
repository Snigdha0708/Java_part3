import java.util.*;
class abc1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Deque<Integer>a=new LinkedList<Integer>();
int si=s.nextInt();
for(int i=0;i<si;i++)
a.add(s.nextInt());
a.addFirst(0);
a.addLast(6);
System.out.println(a);
a.remove();
a.removeFirst();
a.removeLast();
System.out.println(a);
a.push(1);
System.out.println(a);
a.pop();
System.out.println(a);
a.offer(1);
System.out.println(a);
a.offerLast(5);
System.out.println(a);
a.offerFirst(100);
System.out.println(a);
a.remove();
a.removeFirst();
a.removeLast();
System.out.println(a);
System.out.println(a.peek());
System.out.println(a.peekLast());
}}