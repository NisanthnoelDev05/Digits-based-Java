import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
n=Math.abs(n);
int e=0,o=0;
while(n>0)
{
if((n%10)%2==0)
e++;
else
o++;
n/=10;
}
if(e>0&&o==0)
System.out.println("AllEven");
else if(o>0&&e==0)
System.out.println("AllOdd");
else
System.out.println("Mixed");
}
}