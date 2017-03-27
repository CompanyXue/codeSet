#include <iostream>
#include <cstdio>
#include <vector>
#include <queue>
#include <string>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <stack>
using namespace std;

const int maxn=50;
int mid[maxn],fr[maxn];

struct node{
	int l,r;
}a[maxn];

int build(int la,int ra,int lb,int rb)//la,ra表示中序遍历 lb,rb表示前序遍历
{
	if(la>ra)
		return 0;
	int rt=fr[lb],p1,p2;
	p1=la;
	while(mid[p1]!=rt)	p1++;//在前序遍历中找到根节点
	p2=p1-la;
	a[rt].l=build(la,p1-1,lb+1,lb+p2);
	a[rt].r=build(p1+1,ra,lb+p2+1,rb);
	return rt;
}

void bfs(int x)//层序遍历
{
	queue<int>q;
	vector<int>v;
	q.push(x);
	while(!q.empty())
	{
		int w=q.front();
		q.pop();
		if(w==0)
			break;
		v.push_back(w);
		if(a[w].r!=0)
			q.push(a[w].r);
		if(a[w].l!=0)
			q.push(a[w].l);

	}
	int len=v.size();
	for(int i=0;i<len;i++)
		printf("%d%c",v[i],i==len-1?'\n':' ');
	return;
}

int main()
{
	int n,i,j;
	cin>>n;
	for(i=0;i<n;i++) 
		scanf("%d",&mid[i]);
	for(i=0;i<n;i++) 
		scanf("%d",&fr[i]);
	build(0,n-1,0,n-1);
	int root=fr[0];
	bfs(root);
    return 0;
}
