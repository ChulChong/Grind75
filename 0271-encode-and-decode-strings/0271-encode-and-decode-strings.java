public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            int len = str.length();
            sb.append(len).append('#').append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();
        while (s.length() > 0) {
            int index = s.indexOf('#');
            int len = Integer.parseInt(s.substring(0, index));
            String word = s.substring(index + 1, index + 1 + len);
            list.add(word);
            s = s.substring(index + 1 + len);
        }
        return list;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));