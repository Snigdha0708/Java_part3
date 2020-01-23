import java.util.*;
class STACKS122
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Stack<Integer>a=new Stack<Integer>();
int ele;
int size;
size=s.nextInt();
for(int i=0;i<size;i++)
{
ele=s.nextInt();
a.push(ele);
}
System.out.println("peek="+a.peek());
if(a.empty())
System.out.println("empty");
else
System.out.println("not empty");
int su=a.search(3);
System.out.println(su);
while(!a.empty())
{
System.out.print(a.peek()+" ");
a.pop();
}
}}