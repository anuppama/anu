import java.io.*;
import java.util.*;
class numindex
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
 arr[i]=s.nextInt();
}
System.out.println(checkindex(arr));
}
public static String checkindex(int a[])
{
String str="";
for(int i=0;i<a.length;i++)
{
 if(a[i]==i)
  str+=String.valueOf(a[i])+" ";
}
return str;
}
}
