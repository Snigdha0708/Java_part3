import java.util.Scanner;
class D
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int a[]=new int[x];
int b[]=new int[x];
for(int i=0;i<x;i++)
{
a[i]=s.nextInt();
}
int n=0;
for(int j=0;j<x;j++)
{
if(a[j]==a[j+1])
{
n++;
if(n==1)
System.out.println(a[j]);
}
}
int dumb=0;
dumb=+1;
System.out.println(dumb);
}}
