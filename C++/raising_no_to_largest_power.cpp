using namespace std;
#include<iostream>
class sample{
	int n=0,pow=0,res=0;
public:
	void init();
	void compute();
	void display();
};

void sample::init(){
	cin>>n>>pow;
}

void sample::compute(){
	int pro,pseq,p;
	pro=1;
	pseq=n;
	p=pow;
	while(p>0){
		if(p%2)
			pro *= pseq;
		p/=2;
		pseq*=pseq;

	}
	res=pro;
}

void sample::display(){
    cout<<res;
}

int main(){
	sample s;
	s.init();
	s.compute();
	s.display();
	return 1;
}
