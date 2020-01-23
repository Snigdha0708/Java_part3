import java.util.Scanner;
class HW
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=s.nextInt();
}}
int s1,s2;
s1=s2=Integer.MAX_VALUE;
for(int k=0;k<2;k++)
{
for(int l=0;l<2;l++)
{
if(a[k][l]<s1)
{
s2=s1;
s1=a[k][l];
}
else if(a[k][l]>s1&&a[k][l]<s2)
{
s2=a[k][l];
}}}
System.out.println("1st Smallest="+s1);
System.out.println("2nd Smallest="+s2);
}}