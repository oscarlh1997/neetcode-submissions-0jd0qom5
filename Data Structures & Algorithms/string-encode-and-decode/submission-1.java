class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str: strs)  {
            encoded.append(str.length()).append('#').append(str);
        }

        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> response = new ArrayList<>();
        int i = 0;

    while (i < str.length()) {
        StringBuilder digits = new StringBuilder();

        while (str.charAt(i) != '#') {
            digits.append(str.charAt(i));
            i++;
        }

        int length = Integer.parseInt(digits.toString());
        i++; // Saltar '#'

        StringBuilder word = new StringBuilder();
        for (int read = 0; read < length; read++) {
            word.append(str.charAt(i));
            i++;
        }

        response.add(word.toString());
    }

    return response;

    }
    
}
