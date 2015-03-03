public class Solution {
    public int findPeakElement(int[] num) {
        if (num==null)
            return 0;
        if(num.length==1)
            return 0;
        for(int i = 0 ; i < num.length ; i++){
            if(i==0){
                    if(num[0]>num[1])
                        return 0;
            }else if(i==num.length-1){
                if(num[num.length-1]>num[num.length-2])
                        return num.length-1;
            }
            else{
                if(num[i] > num[i+1] && num[i]>num[i-1])
                    return i;
            }
            
        }
        return 0;
    }
}