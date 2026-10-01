class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str: strs)  {
            encoded.append(str.length()).append('#').append(str);
        }

        return encoded.toString();

    }

    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();
        int position = 0;

        while (position < encoded.length()) {
            int length = 0;

            while (encoded.charAt(position) != '#') {
                length = length * 10 + encoded.charAt(position) - '0';
                position++;
            }

            int start = position + 1;
            result.add(encoded.substring(start, start + length));
            position = start + length;
        }

        return result;
    }
    
}
