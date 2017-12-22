import java.io.*;
class fact
{
    public static void main(String args[])throws IOException
    {
        int i,n,fact=1;
        DataInputStream dis=new DataInputStream(System.in);
        n=Integer.parseInt(dis.readLine());
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
