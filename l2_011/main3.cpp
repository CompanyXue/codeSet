#include <cstdio>
#include <iostream>
#include <cstring>
#include <algorithm>
#include <map>
#include <queue>
#include <stack>
using namespace std;

int pre[35];
int mid[35];
struct Btnode
{
    int x;
    Btnode *left,*right;
    Btnode(){}
    Btnode(int c = 0,Btnode* a = NULL,Btnode* b = NULL)
    {
        x = c;  left = a;   right = b;
    }
};
Btnode* root = NULL;


Btnode* build(int l1,int r1,int l,int r)
{
    if(l > r) return NULL;
    Btnode* now = new Btnode(0);
    now->x = pre[l1];
    int m = 0;
    while(mid[m]!=pre[l1])
        m++;
    int lnum = m - l;
    now->left = build(l1+1,l1+lnum,l,m-1);
    now->right = build(l1+lnum+1,r1,m+1,r);

    return now;
}

int n,num = 1;

int order()
{
    queue< Btnode* > Q;
    Q.push(root);
    while(!Q.empty())
    {
        Btnode* node = Q.front();
        Q.pop();
        if(node->x != 0)
        {
            if(num == n)
                printf("%d",node->x);
            else printf("%d ",node->x);
            num++;
        }
        if(node->right != NULL)
            Q.push(node->right);
        if(node->left != NULL)
            Q.push(node->left);
    }
}
int main()
{

    scanf("%d",&n);
    root = new Btnode(0);
    for(int i = 1; i <= n ;i++)
        scanf("%d",&mid[i]);
    for(int i = 1; i <= n ;i++)
        scanf("%d",&pre[i]);
    root = build(1,n,1,n);
    order();
    printf("\n");
    return 0;
}