import java.io.*;
import java.util.*;
class deldigits
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int ip=s.nextInt();
int k=s.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
int p=ip;
while(p!=0)
{
al.add(p%10);
p=p/10;
}
Collections.sort(al);
StringBuffer str=new StringBuffer(String.valueOf(al.get(0)));
for(int i=1;i<al.size();i++)
 str.append(String.valueOf(al.get(i)));
int x=0;
while(x<k)
{
x++;
str.deleteCharAt(str.length()-1);
}
System.out.println(str);
}
}
