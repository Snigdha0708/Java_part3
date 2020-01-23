import java.util.*;
class STUDENT
{
int id;
void show_id()
{
id=1710991802;
System.out.println("STUDENT NAME= "+"SNIGDHA AGGARWAL");
System.out.println("STUDENT ID= "+id);
}}
class MARKS extends STUDENT
{
int m1;
int m2;
int m3;
void show_marks()
{
m1=100;
m2=100;
m3=100;
System.out.println("Total Marks="+(m1+m2+m3));
}}
class SPORTS extends MARKS
{
int sport;
int a=10;
void show_s()
{
sport=100;
System.out.println("Sport Marks="+sport);
}}
class RESULT extends SPORTS
{
int a=20;
void show()
{System.out.println(super.a+a);}
public static void main(String args[])
{
RESULT r=new RESULT();
r.show();
r.show_id();
r.show_marks();
r.show_s();

}}

