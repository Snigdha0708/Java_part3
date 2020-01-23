import java.util.Scanner;
class Rotation
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int ar[]=new int[5]; 
for(int i=0;i<5;i++)
ar[i]=s.nextInt();
int k,temp;
k=s.nextInt();
for(int j=0;j<k;j++)
{
temp=ar[0];
for(int u=0;u<4;u++)
{
ar[u]=ar[u+1];
}
ar[ar.length-1]=temp;
}
for(int t=0;t<5;t++)
System.out.println(ar[t]);
}}