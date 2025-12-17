import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
n=Math.abs(n);
int p=10;
int f=1;
while(n>0)
{
int d=n%10;
if(d>p)
{
f=0;
break;
}
p=d;
n/=10;
}
if(f==1)
System.out.println("Ascending");
else
System.out.println("NotAscending");
}
}