import java.io.*;
import java.util.*;
class regnum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int arr[]=new int[s.nextInt()];
int n=0;
int i,j;
for(i=0;i<arr.length;i++)
{
  n=s.nextInt();
for(j=0;j<arr.length;j++)
{
 if(n==arr[j])
 {
  System.out.println("Repeated:"+n);
  break;
 }
}
if(j>=arr.length)
 arr[i]=n;
}
}
}
