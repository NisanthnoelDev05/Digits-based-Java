import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String n=sc.next();
String[]w={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
for(int i=0;i<n.length();i++)
System.out.println(w[n.charAt(i)-'0']);
}
}