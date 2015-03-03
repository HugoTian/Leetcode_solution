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
    bool isSymmetric(TreeNode *root) {
        if(root==NULL)
            return true;
        else
            return isSymmetric(root->left,root->right);
    }
    bool isSymmetric(TreeNode *lt,TreeNode *rt) {
        if(lt==NULL && rt==NULL)
            return true;
        else if(lt==NULL && rt!=NULL)
            return false;
        else if(lt!=NULL && rt==NULL)
            return false;
        else if(lt!=NULL && rt!=NULL && rt->val !=lt->val )
            return false;
        else
            return isSymmetric(lt->left,rt->right) && isSymmetric(lt->right,rt->left);
    }
};