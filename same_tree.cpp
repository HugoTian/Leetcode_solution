/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode *p, TreeNode *q) {
        if(p==NULL && q==NULL)
            return true;
        else if( (p!=NULL && q==NULL) || (p==NULL && q!=NULL) )
            return false;
        else if(p->left==NULL && p->right==NULL && q->left==NULL && q->right==NULL)
            return (p->val==q->val);
        else if(p->left!=NULL && p->right!=NULL && q->left!=NULL && q->right!=NULL)
            return isSameTree(p->left,q->left) && isSameTree(p->right,q->right);
        else if(p->left!=NULL && p->right==NULL && q->left!=NULL && q->right==NULL)
            return isSameTree(p->left,q->left) && (p->val==q->val);
        else if(p->left==NULL && p->right!=NULL && q->left==NULL && q->right!=NULL)
            return isSameTree(p->right,q->right) && (p->val==q->val);
        else 
            return false;
    }
};