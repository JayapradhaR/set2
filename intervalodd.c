#include<stdio.h>
#include<conio.h>
void main()
{
    int i,m,n;
    clrscr();
    scanf("%d%d",&m,&n);
    for(i=m;i<=n;i++)
    {
       if(i%2==1)
       {
           printf("%d\t",i);
       }
    }
}
