import java.util.*;
class A
{
static int i;
int j;
static
{
i=10;
System.out.println("STATIC BLOCK");
}
A()
{
j=20;
System.out.println("CONSTRUCTOR");
}}
class MAIN
{
public static void main(String args[])
{
System.out.println(A.i);
}}