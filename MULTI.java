import java.util.Scanner;
class MULTI
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int size;
size=s.nextInt();
int a[][]=new int[size][size];
int b[][]=new int[size][size];
for(int i=0;i<size;i++)
for(int j=0;j<size;j++)
{
a[i][j]=s.nextInt();
b[i][j]=s.nextInt();
}
int c[][]=new int[size][size];
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
c[i][j]=0;
for(int k=0;k<size;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}}}
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
System.out.print(c[i][j]+" ");
System.out.println();
}}}