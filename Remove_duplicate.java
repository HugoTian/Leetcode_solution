public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length < 2)
		    return A.length;
        int index = 0;
	    int i = 1;
 
        while (i < A.length) {
		    if (A[i] == A[index]) {
			    i++;
		    } else {
			    index++;
			    A[index] = A[i];
			    i++;
		    }
	    }
        return index+1;
    }
}