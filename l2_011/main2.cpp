/* 分析：1.知二叉树中序遍历、前序遍历，生成二叉树  
 *  2.二叉树层次遍历（镜面反转即递归时 先操作右子树，在操作左子树）
 * 思路：用链表建树。
 * 因为知道了前序遍历和中序遍历，那么可以知道前序遍历的第一个数就是根，
 * 然后可以在中序遍历中找到该根的位置，然后可以分开左子树和右子树，然后重复这种做法，知道建树结束。
 */ 
#include<iostream>
#include<cstring>
#include<queue>
#include<cstdio>
using namespace std;
bool fist;
const int maxn=40;
struct tree_node
{
  int value;
  tree_node* leftchild;
  tree_node* rightchild;
  tree_node()
  {
    leftchild=NULL;
    rightchild=NULL;
  }
};
tree_node* build_tree(int pre[],int in[],int length)
{
  if(length==0)return NULL; //终止条件   
  tree_node* temp = new tree_node;
  int pos;  
  for(pos=0;pos<length;pos++) /找到根节点->然后根据中序遍历把左子树和右子树分开 
  {
    if(in[pos]==pre[0])break;
  }  
  temp->value=pre[0];
  temp->leftchild=build_tree(pre+1,in,pos);
  temp->rightchild=build_tree(pre+pos+1,in+pos+1,length-pos-1);
  return temp;
}
void dfs(tree_node* tree)
{
  queue<tree_node*>Q;
  while(!Q.empty())Q.pop();
  Q.push(tree);
  tree_node* root;
  while(!Q.empty())
  {
    root=Q.front();
    Q.pop();
    if(!fist)
    {
      cout<<root->value;
      fist=true;
    }
    else cout<<" "<<root->value;  
    if(root->rightchild!=NULL)
    {
      tree_node* rchild=root->rightchild;
      Q.push(rchild);
    }  
    if(root->leftchild!=NULL)
    {
      tree_node* lchild=root->leftchild;
      Q.push(lchild);
    }    
  }
  cout<<endl;
}

int main()
{
  int n;
  int pre[maxn],in[maxn];
  while(scanf("%d",&n)==1)
  {
    fist=false;
    //input
    for(int i=0;i<n;i++)scanf("%d",&in[i]);
    for(int i=0;i<n;i++)scanf("%d",&pre[i]);
    //solve
    tree_node* tree=build_tree(pre,in,n);
    dfs(tree);
  }
}

