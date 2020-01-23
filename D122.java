import java.io.*;
class D122
{
public static void main(String args[])
{
try
{
FileOutputStream fos=new FileOutputStream("ABC.txt");
DataOutputStream dos=new DataOutputStream(fos);
dos.writeUTF("I am in class");
}
catch(Exception e)
{}}}