import java.util.*;
class Checks
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++)
a[i]=s.nextInt();
int au=0;
int as=0;
for(int i=0;i<5;i++)
{
int b=a[i];
int d=b;
int no=d;
int c=0;
while(b!=0)
{
b=b/10;
c++;
}
int r[]=new int[c];
int k=0;
while(d!=0)
{
r[k]=d%10;
d=d/10;
k++;
}
int h[]=new int[100];
for(int u=0;u<k;u++)
{
h[r[u]]++;
}
for(int u=0;u<k-1;u++)
{
if(h[r[u]]!=0)
{
if(h[r[u]]==h[r[u+1]])
au+=no;
else
as+=no;
}}}
int ans=as-au;
System.out.println(ans);
}}
