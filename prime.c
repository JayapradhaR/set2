#include <stdio.h>
int main()
{
    int m, n, i, flag;
    scanf("%d %d", &m, &n);
  for(m=m+1;m<n;m++)
    {
        flag = 0;

        for(i = 2; i <= m/2; ++i)
        {
            if(m % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            printf("%d ", m);
    }

    return 0;
}
