public class flag
{
public static void main(String args[])
{
boolean flag=false;
int num=3;
for(int i=1;i<=100;i=i+1)
{
if(i%num==0)
{
flag=true;
}
}
System.out.println(flag);
}
}
