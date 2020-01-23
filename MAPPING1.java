import java.util.*;
class MAPPING1
{
public static void main(String args[])
{
Map<Integer,String>m1=new HashMap<Integer,String>();
Set<Map.Entry<Integer,String>>s1=m1.entrySet();
m1.put(1,"Snigdha");
m1.put(10,"Shubham");
m1.put(2,"Tanish");
m1.put(100,"Snigdha");
m1.put(99,"Shubham");
m1.put(2,"Tanish");
System.out.println(s1);
}}