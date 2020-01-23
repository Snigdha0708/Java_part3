import java.io.*;
class D125
{
public static void main(String args[])throws Exception
{
FileReader in=new FileReader("ABC.txt");
FileWriter out=new FileWriter("CDE.txt");
try
{
int c;
while((c=in.read())!=-1)
{
out.write(c);
}}
catch(Exception e)
{}
}}