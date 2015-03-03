public class Solution {
    public int maxProduct(int[] A) {
        int curr_max_prod = A[0];
        int curr_min_prod = A[0];
        int prev_max_prod = A[0];
        int prev_min_prod = A[0];
        int ans = A[0];
        
        for (int i=1; i<A.length;i++){
            int tmp1 = Math.max( prev_max_prod*A[i],  prev_min_prod*A[i]);
            curr_max_prod = Math.max( tmp1, A[i] );

            int tmp2 = Math.min(prev_max_prod*A[i],  prev_min_prod*A[i]);
            curr_min_prod = Math.min(tmp2, A[i] );
            
            ans = Math.max(ans, curr_max_prod);
            
            prev_max_prod = curr_max_prod;
            
            prev_min_prod = curr_min_prod;
        }
        return ans;   
    }
}