public class Solution {
    public String largestNumber(int[] num) {
       if (num == null || num.length == 0) {
    		return "";
    	}
    	
    	String[] array = new String[num.length];
    	for (int i = 0; i < num.length; i++) {
    		array[i] = String.valueOf(num[i]);
    	}
    	
    	Arrays.sort(array, comparator);
    	
    	String result = "";
    	
    	for (String str: array) {
    		result = str + result;
    	}
    	
    	int i = 0; 
    	while (i < result.length() - 1) {
    		if (result.charAt(i) != '0') {
    			break;
    		}
    		i++;
    	}
    	
    	return result.substring(i);
    }
 
    public static Comparator<String> comparator = new Comparator<String>() {
 
		@Override
		public int compare(String o1, String o2) {
			String comb1 = o1 + o2; 
			String comb2 = o2 + o1;
			
			return comb1.compareTo(comb2);
		}
	};
}