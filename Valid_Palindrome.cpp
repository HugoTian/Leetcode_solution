class Solution {
public:
    bool isPalindrome(string s) {
        if (s=="")
           return true;
        else{
        int i= 0 ,j=s.length()-1;
        while(i<j){
            while(!isalpha(s.at(i))&&!isdigit(s.at(i))&&(i<j))
                i++;
            while(!isalpha(s.at(j))&&!isdigit(s.at(j))&&(j>i))
                j--; 
            if(tolower(s.at(i))!=tolower(s.at(j)))
                return false;
                i++;
                j--;
        }
        return true;
      }
    }
};