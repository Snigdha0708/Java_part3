import java.util.Scanner;
class Duplicate
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[5];
int b[]=new int[5];
int c[]=new int[5];
for(int i=0;i<5;i++)
{
a[i]=s.nextInt();
b[i]=s.nextInt();
}
int u=0;
for(int j=0;j<5;j++)
{
for(int k=0;k<5;k++)
{
if(a[j]==b[k])
{
c[u]=a[j];
u++;
}}}
for(int us=0;us<c.length-1;us++)
System.out.print(c[us]);
int lo=0;
for(int o=0;o<c.length-1;o++)
{
if(c[o]==c[o+1])
{
System.out.println(c[o]);
break;
}
else
System.out.println(c[o]);
}}}