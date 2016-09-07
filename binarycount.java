import java.io.*;

import java.util.*;

class binarycount
{

public static void main(String args[])
{

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
String str[]=new String[n];
for(int i=0;i<n;i++)
{
 a[i]=s.nextInt();
 str[i]=Integer.toBinaryString(a[i]); 
}
int count=0;
int c[]=new int[n];
for(int i=0;i<n;i++)
{
 for(int j=0;j<str[i].length();j++)
 {
  if(str[i].charAt(j)=='1')
    count++;
 }
c[i]=count;
count=0;
}
while(n!=0)
{
count=c[0];
int j=0;
for(int i=0;i<c.length;i++)
{
 if(c[i]>count)
   {
    count=c[i];
    j=i;
   }
 else if(c[i]==count)
   {
    if(a[i]>a[j])
      j=i;
   }
}
System.out.print(a[j]+" ");
c[j]=-7;
n--;
}
}
}
