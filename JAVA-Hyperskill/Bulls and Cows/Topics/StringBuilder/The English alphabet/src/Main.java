class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
            if (ch != 'Z') {
                sb.append(' ');
            }
        }
        return sb;
    }
}
