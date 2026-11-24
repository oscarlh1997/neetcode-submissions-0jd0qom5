class Solution {
    public long numberOfSubstrings(String s) {
        Map<Character, Long> values =  new HashMap<>();
        long total = 0;

        for(int i =0; i < s.length(); i++)  {
            values.merge(s.charAt(i), 1L, Long::sum);
        }

        for(Map.Entry<Character,Long> entry: values.entrySet()) {
            long current = entry.getValue();
            while(current > 0)  {
                total+=current;
                current--;
            }

        }

        return total;




    }
}
