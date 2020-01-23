import java.util.*;
class STRINGMETHODS
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("SNIGDHA");
sb.append("ABC");
System.out.println(sb);
int a=sb.capacity();
System.out.println(a);
char b=sb.charAt(3);
System.out.println(b);
sb.delete(0,5);
System.out.println(sb);
sb.replace(0,5,"AGGARWAL");
System.out.println(sb);
sb.reverse();
System.out.println(sb);
int c=sb.indexOf("A");
System.out.println(c);
int d=sb.lastIndexOf("A");
System.out.println(d);
String e=sb.toString();
System.out.println(e);
int l=sb.length();
System.out.println(l);
}}