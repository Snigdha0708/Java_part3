import java.util.Scanner;
class Search
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[5];
int b[]=new int[5];
for(int i=0;i<5;i++)
{
a[i]=s.nextInt();
b[i]=s.nextInt();
}
for(int j=0;j<5;j++)
{
for(int k=0;k<5;k++)
{
if(a[j]==b[k])
{
System.out.println(a[j]);
}}}
}}