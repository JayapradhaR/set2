import java.io.*;
class prime
{
    public static void main(String args[])throws IOException
    {
        int i,n,num=0;
        DataInputStream dis=new DataInputStream(System.in);
        n=Integer.parseInt(dis.readLine());
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                num++;
            }
        }
        if(num==2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
