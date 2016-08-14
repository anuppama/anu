import java.io.*;
import java.util.*;
class stringrev
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
StringBuffer st=new StringBuffer(str);
String res=String.valueOf(st.reverse());
System.out.println(res);
}
}
