import java.util.Scanner;
class J
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String rstr="";
for(int i=str.length()-1;i>=0;i--)
{
rstr+=str.charAt(i);
}
System.out.println(rstr);
}}