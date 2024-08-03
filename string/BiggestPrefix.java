class BiggestPrefix {
    /*
     * O(m x n) Considering that m is the length of the first word and n is the
     * length of the array of words.
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(); // O(1)
        String firstWord = strs[0]; // O(1)

        for (int i = 0; i < firstWord.length(); i++) { // O(m)
            char c = strs[0].toLowerCase().charAt(i); // O(1)
            for (int j = 1; j < strs.length; j++) { // O(n)
                if (strs[j].length() == i) { // O(1)
                    return sb.toString(); // O(1)
                }

                if (c != strs[j].toLowerCase().charAt(i)) { // O(1)
                    return sb.toString(); // O(1)
                }
            }
            sb.append(c); // O(1)
        }

        // Edge case for first word with only 1 char.
        if (firstWord.length() == 1) {
            return firstWord; // O(1)
        }

        return sb.toString(); // O(1)
    }

    public static void main(String[] args) {
        String[] words = { "a", "b" };
        BiggestPrefix s = new BiggestPrefix();
        String r = s.longestCommonPrefix(words);
        System.out.println(r);
    }
}