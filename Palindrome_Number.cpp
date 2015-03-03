class Solution {
public:
    bool isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
         
        int length=0;
        int result = 0;
        int tmp = x;
        int compare =x;
        while(tmp>0){
            tmp=tmp/10;
            length++;
        }
        if(length==1)
            return true;
        int y;
        while(x>0){
            length--;
            y= x%10;
            result += pow(10.0,length) *y ;
            x=x/10;
        }
        
        if(compare==result)
            return true;
        else
            return false;
    }
};