public class dummy2 {
public static void main(String args[])
{
//System.out.println("Hello");
float a,b,sum,sub,mult;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[2]);
sum=a+b;
sub=a-b;
mult=a*b;
float div=a/b;
if(args[1].equals("+"))
System.out.println(a+" aur "+b+ " ka sum h : " +sum);
else if(args[1].equals("-"))
System.out.println(sub);
else if(args[1].equals("x"))
System.out.println(mult);
else if(args[1].equals("/"))
System.out.println(div);
else
System.out.println("Error!");
}
}
