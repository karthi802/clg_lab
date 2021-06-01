#include <iostream>

using namespace std;

class histogram
{

    int a[15],n,count=0,max,freq[15],arr[15],temp,min,d;
    public:
        void init();
        void calculate();
        void display();
};
void histogram::init()
{
    cin>>n;
    temp=n;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
        arr[i]=a[i];
    }
}
void histogram::calculate()
{
    for(int r=0;r<n;r++)
    {
        min=r;
        for(int k=r;k<n;k++)
        {
            if(arr[min]>arr[k])
            min=k;
        }
        d=arr[r];
        arr[r]=arr[min];
        arr[min]=d;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                for(int k=j;k<n;k++)
                {
                    arr[k]=arr[k+1];

                }
                n--;
            }
        }
    }
    for(int x=0;x<n;x++)
    {
        for(int y=0;y<temp;y++)
        {
            if(arr[x]==a[y])
                count++;
        }
        freq[x]=count;
        count=0;
    }
}
void histogram::display()
{
    for(int q=0;q<n;q++)
    {
        cout<<arr[q]<<" "<<freq[q]<<endl;
    }
}
int main()
{
    histogram h;
    h.init();
    h.calculate();
    h.display();
    return 0;
}
