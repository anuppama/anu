import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int fact=1;
for(int i=num;i>=1;i--)
{
fact*= num;
}
if(num==0)
 System.out.println("1");
else
 System.out.println(fact);
}
}
