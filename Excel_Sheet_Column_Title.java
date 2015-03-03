public class Solution {
    public String convertToTitle(int n) {
        String result = new String();
        
        while(n>0){
            switch(n%26) {
              case 0: result = "Z" + result;
                    break;
              case 1: result = "A" + result;
                    break;
              case 2: result = "B" + result;
                    break;
              case 3: result = "C" + result;
                    break;
              case 4: result = "D" + result;
                    break;
              case 5: result = "E" + result;
                    break;
              case 6: result = "F" + result;
                    break;
              case 7: result = "G" + result;
                    break;
              case 8: result = "H" + result;
                    break;
              case 9: result = "I" + result;
                    break;
              case 10: result = "J" + result;
                    break;
              case 11: result = "K" + result;
                    break;
              case 12: result = "L" + result;
                    break;
              case 13: result = "M" + result;
                    break;
              case 14: result = "N"+ result;
                    break;
              case 15: result = "O" + result;
                    break;
              case 16: result = "P" + result;
                    break;
              case 17: result = "Q" + result;
                    break;
              case 18: result = "R" + result;
                    break;
              case 19: result = "S" + result;
                    break;
              case 20: result = "T" + result;
                    break;
              case 21: result = "U" + result;
                    break;
              case 22: result = "V" + result;
                    break;
              case 23: result = "W" + result;
                    break;
              case 24: result = "X" + result;
                    break;
              case 25: result = "Y" + result;
                    break;
            }
            if(n%26==0)
                n=n/26 -1;
            else
                n=n/26;
            
        }
        return result;
    }
}