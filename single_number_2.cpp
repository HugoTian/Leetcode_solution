class Solution {
public:
    int singleNumber(int A[], int n) {
        int oneNum = 0;
        int twoNum = 0;
        int threeNum = 0;
        for(int i = 0 ; i < n ;i++){
            threeNum = twoNum & A[i];
            twoNum = oneNum & A[i] | twoNum;
            oneNum = oneNum | A[i];
            oneNum = oneNum &(~threeNum);
            twoNum = twoNum & (~threeNum);
            threeNum = 0;
        }
        return oneNum;
    }
};