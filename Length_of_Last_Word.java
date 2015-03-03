public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null)
            return 0;
        if(!s.contains(" "))
            return s.length();
        else {
            int i;
            for(i = 0;i< s.length();i++)
            {
                if(s.charAt(i)!=' ')
                    break;
            }
            if(i==s.length())
                return 0;
            while(s.charAt(0)==' ')
            {
                int length = s.length();
                s=s.substring(1,length);    
            }
            while(s.substring(s.length()-1)==" ")
            {
                int length =  s.length();
                s = s.substring(0, length-1);
            }
            
        String[] array = s.split("[ ]+");
        int k= array.length;
        return array[k-1].length();
        }
    }
}