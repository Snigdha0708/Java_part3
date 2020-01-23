import java.io.*;
class D124
{
public static void main(String args[]) throws Exception
{
FileInputStream fos=new FileInputStream("ABC.txt");
FileOutputStream fs=new FileOutputStream("AS.txt");
DataOutputStream ds=new DataOutputStream(fs);
try
{
int c;
while((c=fos.read())!=-1)
ds.write((char)c);
}
catch(Exception e)
{}
}}