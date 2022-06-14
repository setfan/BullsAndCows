class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet.append(ch);
            if (ch != 'Z') {
                alphabet.append(" ");
            }
        }

        return alphabet;
    }
}