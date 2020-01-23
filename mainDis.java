import java.util.Scanner;
class compDist
{
int km,m;
void setvalue(int a,int b)
{
km=a;
m=b;
}
void adddis(compDist d)
{
m+=d.m;
km+=d.km;
if(m>=1000)
{
m-=1000;
km+=1;
}
System.out.println("KM="+km);
System.out.println("M="+m);
}
void subdis(compDist d)
{
m-=d.m;
km-=d.km;
if(m>=1000)
{
m-=1000;
km+=1;
}
System.out.println("KM="+km);
System.out.println("M="+m);
}
}
class mainDis
{
public static void main(String args[])
{
int a,b;
int c,d;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=s.nextInt();
compDist D=new compDist();
compDist E=new compDist();
D.setvalue(a,b);
E.setvalue(c,d);
D.adddis(E);
D.subdis(E);
}}