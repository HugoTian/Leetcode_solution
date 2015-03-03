public class Solution {
    public int compareVersion(String version1, String version2) {
        String tmp1 = new String();
        String tmp2 = new String();
        
        if(version1.contains("."))
            tmp1 = version1;
        else
            tmp1 = version1.concat(".0");
        
        if(version2.contains("."))
            tmp2 = version2;
        else
            tmp2 = version2.concat(".0");
        
        
        String[] part1 = tmp1.split("[.]+");
        String[] part2 = tmp2.split("[.]+");
        int size1 = part1.length;
        int size2 = part2.length;
        
        for (int i = 0 ; i < size1; i++){
             String number1 = part1[i];
          if(number1.length()>1){
            int lastLeadZeroIndex = 0;
            int k;
            for ( k = 0; k < number1.length(); k++) {
                    char c = number1.charAt(k);
                    if (c == '0') {
                    lastLeadZeroIndex = k;
            } else {
                break;
            }
            }
           if(k==0)
            part1[i]=part1[i];  
           else if(k < number1.length())
            part1[i] = number1.substring(lastLeadZeroIndex+1, part1[i].length());
           else 
            part1[i]="0";
          }
        }
        
        for(int j = 0 ; j < size2;j++){
            String number2 = part2[j];
          if(number2.length()>1){
             int lastLeadZeroIndex2 = 0;
             int k;
            for (k= 0; k < number2.length(); k++) {
                    char c = number2.charAt(k);
                    if (c == '0') {
                    lastLeadZeroIndex2 = k;
            } else {
                break;
            }
            }
            if(k==0)
            part2[j]= part2[j];
            else if(k<number2.length())
            part2[j] = number2.substring(lastLeadZeroIndex2+1, part2[j].length());
            else
            part2[j]="0";
          }
        }
        
        
        int compare1,compare2;
        int i = 0;
        int j = 0;
        while((i<size1) && (j<size2)) {
           
            
            compare1 = Integer.parseInt(part1[i]);
            compare2 = Integer.parseInt(part2[j]);
            
            if(compare1 > compare2)
                return 1;
            
            else if (compare1 < compare2)
                return -1;
            else    {
                i++;
                j++;
            }
                
            
        }
        
      if(size1==i && size2>j){
         while(j<size2){
             if(Integer.parseInt(part2[j])==0)
                j++;
             else
                break;
         }
         if(size2>j)
            return -1;
         else 
            return 0;
      }else if(size1>i && size2==j){
         while(i<size1){
             if(Integer.parseInt(part1[i])==0)
                i++;
             else
                break;
         }
         if(size1>i)
            return 1;
         else 
            return 0;
      }else
      return 0;
        
        
    }
}n