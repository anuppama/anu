import java.io.*;
import java.util.*;
class revnum
{
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
int num=s.nextInt();
int n;
String rev="";
while(num!=0)
{
	n=num%10;
rev+=String.valueOf(n);
num=num/10;
}
System.out.println(rev);

}
}
