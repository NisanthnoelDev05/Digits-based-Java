import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
n=Math.abs(n);
int m=0;
while(n>0)
{
int d=n%10;
if(d>m)
m=d;
n/=10;
}
System.out.println(m);
}
}