import java.util.Scanner;
class file12
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String rstr="";
String[] words=str.split(" ");
for(int i=0;i<words.length;i++)
{
String word;
String rword="";
word=words[i];
for(int j=word.length()-1;j>=0;j--)
rword+=word.charAt(j);
rstr+=rword+" ";
}
String c1[]=str.split(" ");
String c2[]=rstr.split(" ");
int c=0;
for(int i=0;i<c1.length;i++)
if(c1[i].equals(c2[i]))
c++;
System.out.println(c);
}}