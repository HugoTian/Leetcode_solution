class Solution {
public:
    int reverse(int x) {
        int sign = 1;;
        if(x<0){
            x=x*(-1);
            sign = -1;
        }
        
        int length=0;
        long long result = 0;
        int tmp = x;
        while(tmp>0){
            tmp=tmp/10;
            length++;
        }
        int y;
        while(x>0){
            length--;
            y= x%10;
            result += pow(10.0,length) *y ;
            x=x/10;
        }
        result *= sign;
        if( result > 2147483647 || result < -2147483647)
            return 0;
        else
            return result ;
    }
};