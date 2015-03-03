/**
这道题是动态规划的题目，所用到的方法跟是在Maximum Subarray中介绍的套路，
用“局部最优和全局最优解法”。我们维护一个到目前为止能跳到的最远距离，以及从当前一步出发能跳到的最远距离。
局部最优local=A[i]+i，而全局最优则是global=Math.max(global, local)。递推式出来了，代码就比较容易实现了。
因为只需要一次遍历时间复杂度是O(n)，而空间上是O(1)
**/
public class Solution {
    public boolean canJump(int[] A) {  
        if(A==null || A.length==0)  
            return false;  
        int reach = 0;  
        for(int i=0;i<=reach&&i<A.length;i++){  
            reach = Math.max(A[i]+i,reach);  
        }  
        if(reach<A.length-1)  
            return false;  
        return true;  
    }  
}