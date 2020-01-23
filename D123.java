import java.io.*;
class D123
{
public static void main(String args[]) throws Exception
{
FileInputStream fos=new FileInputStream("ABC.txt");
try
{
int c;
while((c=fos.read())!=-1)
System.out.print((char)c);
}
catch(Exception e)

{}}}