import java.io.*;
class armstrongintervals
{
    public static void main(String args[])throws IOException
    {
        int num,n,rem,s,t,i;
        DataInputStream dis=new DataInputStream(System.in);
        s=Integer.parseInt(dis.readLine());
        t=Integer.parseInt(dis.readLine());
        for(i=s+1;i<t;i++)
        {
            n=i;
            num=0;
            while(n!=0)
            {
            rem=n%10;
            num=num+rem*rem*rem;
            n=n/10;
            }
            if(i==num)
            {
                System.out.println(i);
            }
        }
    }
}
