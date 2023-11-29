import java.util.*;
class circle
{
private double r;
protected double a;
void get(int a)
{
r=x;
}
void calculate()
{
r=3.14*r*r;
}
void display()
{
system.out.println("area of circle is"+a);
}
class cylinder extends circle
{
private double h;
private double v;
}
void get(int y)
{
h=y;
}
void calculate()
{
v=a*h;
}
void display()
{
system.out.println("volume of cylinder"+r);
}
public static void main(String args[])
{
int d,b;
Scanner s=new Scanner(system.in);
System.out.println("enter radius:");
d=s.nextint();
system.out.println("enter height:");
b=s.nextint();
cylinder obj=new cylinder();
obj.get(d);
obj.calculate();
obj.display();
obj.get2();
obj.calculate2();
obj.display2();
}
}