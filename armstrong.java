import java.io.*;
class armstrong
{
    public static void main(String args[])throws IOException
    {
        int num,n,rem,res=0;
        DataInputStream dis=new DataInputStream(System.in);
        num=Integer.parseInt(dis.readLine());
        n=num;
        while(n!=0)
        {
            rem=n%10;
            res=res+rem*rem*rem;
            n=n/10;
        }
        if(res==num)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
