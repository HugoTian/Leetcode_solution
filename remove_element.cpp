class Solution {
public:
    int removeElement(int A[], int n, int elem) {
        int last = n-1;
        int i = 0;
        while(i < last+1){
            
            if(A[i]==elem){
                for(int j = i ; j<last; j++){
                    A[j]=A[j+1];
                }
                last--;
                i--;
            }
            i++;
            
        }
        return last+1;
       
        

    }
};