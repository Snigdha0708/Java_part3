import java.util.*;
class MAPPING
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Map<String,Integer>m1=new TreeMap<String,Integer>();
m1.put("a",91);
m1.put("b",92);
System.out.println(m1);
m1.remove("b");
System.out.println(m1.get("a"));
System.out.println(m1);
m1.replace("a",99);
System.out.println(m1);
m1.clear();
System.out.println(m1);
System.out.println(m1.keySet());
}}