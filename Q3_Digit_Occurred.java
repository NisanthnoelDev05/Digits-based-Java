import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();
n=Math.abs(n);
int f=0;
while(n>0)
{
if(n%10==d)
{
f=1;
break;
}
n/=10;
}
if(f==1)
System.out.println("Yes");
else
System.out.println("No");
}
}