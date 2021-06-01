#include<stdio.h>

int main()
{
    int a, b, i, j;
    int m1[10][10], m2[10][10], sum[10][10];
    scanf("%d",&a);
    scanf("%d",&b);
    for ( i = 0; i < a ; i++ )
    {
        for ( j = 0 ; j < b ; j++ )
        {
            scanf("%d",&m1[i][j]);
        }
    }
    for (i = 0 ; i < a ; i++ )
    {
        for ( j = 0 ; j < b ; j++ )
        {
            scanf("%d",&m2[i][j]);
        }
    }
    for ( i = 0 ; i < a ; i++ )
    {
        for ( j = 0 ; j < b ; j++ )
        {
            sum[i][j] = m1[i][j] + m2[i][j];
        }
    }
    for ( i = 0 ; i < a ; i++ )
    {
        for ( j = 0 ; j < b ; j++ )
        {
        printf("%d\n",sum[i][j]);
        }
    }
return 0;
}
