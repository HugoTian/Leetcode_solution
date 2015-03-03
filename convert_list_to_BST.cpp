/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
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
    TreeNode *sortedListToBST(ListNode *head) {
        if(head == NULL)
            return NULL;
        int size = 0;
        ListNode *tmp = head;
        while(tmp!= NULL ){
            size++;
            tmp = tmp->next;
        }
        return BuildBST(head,0,size-1);
    }
    
    TreeNode *BuildBST(ListNode * &head,int start, int end) {
        if(start > end )
            return NULL;
        int mid = (start+end)/2;
        TreeNode* leftChild = BuildBST(head,start, mid-1);
        TreeNode* root = new TreeNode(head->val);
        root ->left = leftChild;
        
        head = head->next;
        root ->right = BuildBST(head,mid+1,end);
        return root;
        
    }
};