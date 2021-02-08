#include<stdio.h>

int main()
{
  int i,j,n,fact,sign = -1;
  float x,p,sum=0;
  
  scanf("%f", &x);
  scanf("%d", &n);
  
  for(i=1; i<=n; i+=2)
  {
    p=1;
    fact=1;
    for(j=1; j<=i; j++)
    {
      p = p*x;
      fact = fact*j;
    }
    sign = -1*sign;
    sum += sign*p/fact;
  }
  
  printf("%f", sum);
  
  return 0;
 }
