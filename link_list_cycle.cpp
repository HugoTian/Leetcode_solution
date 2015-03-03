/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if(head == NULL)
            return false;
        ListNode* fast = head;
        while(fast->next != NULL){
            head = head->next;
            fast = fast->next;
            if(fast->next !=NULL)
                fast = fast->next;
            else
                return false;
            if (fast == head)
                return true;
            
        }
        return false;
    }
};