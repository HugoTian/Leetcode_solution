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
    bool isValidBST(TreeNode *root) {
       if(root == NULL)
        return true;
      
       return isValidBST(root,INT_MIN,INT_MAX,false,false);
    }
    bool isValidBST(TreeNode* root, int lo,int up,bool lo_show, bool up_show){
        if(root == NULL)
            return true;
        else if(root->val==INT_MIN){
        
            if(lo_show)
                    return false;
            else{
                if(root->right != NULL)
                    return (root->left == NULL) && isValidBST(root-> right,root->val,up, true,up_show);
                else if (root->left==NULL)
                     return (root->val < up) &&  (root->val >= lo) ;
                else
                    return false;
            }
        }
        else if (root->val == INT_MAX){
            
            if(up_show)
                    return false;
            else{
                if(root->left != NULL)
                    return (root->right == NULL)  && isValidBST(root-> left,lo,root->val,lo_show,true);
                else if (root->right == NULL)
                    return (root->val <= up) &&  (root->val > lo) ;
                else 
                    return false;
            }
        }
        else if(root->left == NULL && root->right == NULL){
            return (root->val < up) &&  (root->val > lo) ;
        }
        else if(root->left != NULL && root->right == NULL){
            
            return (root->val < up) &&  (root->val > lo) && isValidBST(root->left,lo,root->val,lo_show,up_show); 
        }
        else if(root->left == NULL && root->right != NULL){
            
            return (root->val < up) &&  (root->val > lo) && isValidBST(root-> right,root->val,up,lo_show,up_show); 
        }
        else if(root->left != NULL && root->right != NULL){
             return (root->val < up) &&  (root->val > lo) && isValidBST(root->left,lo,root->val,lo_show,up_show) && isValidBST(root-> right,root->val,up,lo_show,up_show); 
        }
    }
};