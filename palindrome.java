import java.io.*;
class palindrome
{
    public static void main(String args[])throws IOException
    {
        int n,temp,num,i,rev=0,ld;
        DataInputStream dis=new DataInputStream(System.in);
        num=Integer.parseInt(dis.readLine());
        temp=num;
        while(temp>0)
        {
            ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        if(rev==num)
        {
        System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
    }
}

