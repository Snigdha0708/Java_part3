import java.util.*;
class Check
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int w=s.nextInt();
int a[]=new int[w];
for(int i=0;i<w;i++)
a[i]=s.nextInt();
int au=0;
int as=0;
for(int i=0;i<w;i++)
{
int flag=-1;
int b=a[i];
int d=b;
int no=d;
int c=0;
while(b!=0)
{
b=b/10;
c++;
}
if(c==1)
as+=d;
else
{
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
if((h[r[u]]==h[r[u+1]])&&(h[r[u]]!=0))
flag=1;
else
flag=0;
}
if(flag==1)
as+=no;
else
au+=no;
}}
int ans=as-au;
System.out.println(ans);
}}
