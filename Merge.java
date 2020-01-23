import java.util.Scanner;
class Merge
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int o=x+y;
int a[]=new int[x];
int b[]=new int[y];
for(int i=0;i<x;i++)
a[i]=s.nextInt();
for(int j=0;j<y;j++)
b[j]=s.nextInt();
int c[]=new int[o];
int u,v,w;
u=v=w=0;
while(v<x)
{
c[u]=a[v];
u++;
v++;
}
while(w<y)
{
c[u]=b[w];
u++;
w++;
}
int snigdha=0;
for(int ab=0;ab<o;ab++)
{
for(int bc=0;bc<o-ab-1;bc++)
{
if(c[bc]>c[bc+1])
{
snigdha=c[bc];
c[bc]=c[bc+1];
c[bc+1]=snigdha;
}}}
for(int um=0;um<o;um++)
System.out.println(c[um]);
}}