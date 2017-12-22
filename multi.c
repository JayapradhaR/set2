#include<stdio.h>
void multiple(int x);
void main()
{
    int n;
    scanf("%d",&n);
    multiple(n);
}
void multiple(int x)
{
    int i,j,multi;
    for(i=1;i<=x;i++)
    {
            multi=i*x;
            printf("%d\t",multi);
    }
}


