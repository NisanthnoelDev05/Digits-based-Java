import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=Math.abs(n);
int l=t%10;
int f=t;
int p=1;
while(f>=10)
{
f/=10;
p*=10;
}
int r=l*p+(t%p)/10*10+f;
if(n<0)
r=-r;
System.out.println(r);
}
}