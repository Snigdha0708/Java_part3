import java.util.*;
class Employee implements Comparable<Employees>
{
String name;
int id;
int salary;
int age;
Employee(String n,int i,int s,int a)
{
name=n;
id=i;
age=a;
salary=s;
}
public int getId()
{
return this.id;
}
public int getSalary()
{
return this.salary;
}
public int getAge()
{
return this.age;
}
public String toString()
{
return "EMPLOYEE = "+name+" ID = "+id+" SALARY = "+salary+" AGE = "+age;
}
public String getName()
{
return this.name;
}
public compareTo(Employee aid)
{
return this.getId()-aid.getId();
}
}
class MAIN12345
{
public static void main(String args[])
{
List<Employee>Emp_data=new ArrayList<>();
Emp_data.add(new Employee("ABC",1089,1000,30));
Emp_data.add(new Employee("ABA",107,1007,70));
Comparator<Employee>a11=new Comparator<Employee>();
{
public int compare(Employee e1,Employee e2)
{
return e1.getName().compareTo(e2.getName());
}}
Collections.sort(Emp_data,a11);
Iterator it=Emp_data.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}}}