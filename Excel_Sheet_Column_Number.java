public class Solution {
    public int titleToNumber(String s) {
        if(s.isEmpty())
            return 0;
        int result = 0;
        for(int i = s.length()-1 ; i >=0; i--){
            int j = s.length()-1-i;
            switch (s.charAt(i)){
                case 'A' : result+=1*Math.pow(26,j);break;
                case 'B' : result+=2*Math.pow(26,j);break;
                case 'C' : result+=3*Math.pow(26,j);break;
                case 'D' : result+=4*Math.pow(26,j);break;
                case 'E' : result+=5*Math.pow(26,j);break;
                case 'F' : result+=6*Math.pow(26,j);break;
                case 'G' : result+=7*Math.pow(26,j);break;
                case 'H' : result+=8*Math.pow(26,j);break;
                case 'I' : result+=9*Math.pow(26,j);break;
                case 'J' : result+=10*Math.pow(26,j);break;
                case 'K' : result+=11*Math.pow(26,j);break;
                case 'L' : result+=12*Math.pow(26,j);break;
                case 'M' : result+=13*Math.pow(26,j);break;
                case 'N' : result+=14*Math.pow(26,j);break;
                case 'O' : result+=15*Math.pow(26,j);break;
                case 'P' : result+=16*Math.pow(26,j);break;
                case 'Q' : result+=17*Math.pow(26,j);break;
                case 'R' : result+=18*Math.pow(26,j);break;
                case 'S' : result+=19*Math.pow(26,j);;break;
                case 'T' : result+=20*Math.pow(26,j);;break;
                case 'U' : result+=21*Math.pow(26,j);;break;
                case 'V' : result+=22*Math.pow(26,j);;break;
                case 'W' : result+=23*Math.pow(26,j);;break;
                case 'X' : result+=24*Math.pow(26,j);;break;
                case 'Y' : result+=25*Math.pow(26,j);;break;
                case 'Z' : result+=26*Math.pow(26,j);;break;
            }
        }
        return result;
    }
}