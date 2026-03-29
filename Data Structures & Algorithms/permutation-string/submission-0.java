class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] sumToComp = new int[26];
        int l = 0, r = 0;
        int [] currSum = new int [26];
        
        if(s1.length()>s2.length()) {
            return false;
        }

        for (char c: s1.toCharArray())    {
            sumToComp [c - 'a']++;
        }

        while (r < s2.length()) {
            currSum[s2.charAt(r) - 'a']++;
            if((r-l+1) == s1.length())  {
                if (Arrays.equals(sumToComp,currSum))   {
                    return true;
                }
                else    {
                    currSum[s2.charAt(l)-'a']--;
                    l++;
                }
            } 
            r++;
        }

      return false;  
        
    }
}