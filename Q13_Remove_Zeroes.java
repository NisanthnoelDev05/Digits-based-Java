import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String n=sc.next();
String r="";
for(int i=0;i<n.length();i++)
if(n.charAt(i)!='0')
r+=n.charAt(i);
System.out.println(r.length()==0?0:r);
}
}