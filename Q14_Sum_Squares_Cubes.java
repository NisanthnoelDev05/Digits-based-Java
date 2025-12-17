import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
n=Math.abs(n);
int s1=0,s2=0;
while(n>0)
{
int d=n%10;
s1+=d*d;
s2+=d*d*d;
n/=10;
}
System.out.println(s1);
System.out.println(s2);
}
}