public class Solution {
    public int majorityElement(int[] num) {
        ArrayList<Integer> myArray= new ArrayList<>();
	      ArrayList<Integer> countArray= new ArrayList<>();
	     
	       int size = num.length;
	       
	       myArray.add(num[0]);
	       countArray.add(1);
	       for(int i = 1 ; i < size;i++){
	           
	                if(myArray.contains(num[i])){
	                  for(int j = 0 ; j < myArray.size();j++){
	                    if(num[i]==myArray.get(j))
	                        countArray.set(j,countArray.get(j)+1);
	                  }
	                }
	                else{
	                      myArray.add(num[i]);
	                      countArray.add(1);
	                }
	            
	        }

	            
	      for(int k = 0 ; k < countArray.size();k++){
	          if(countArray.get(k)>(num.length/2))
	                return myArray.get(k);
	      }
	    return 0;
    }
}