class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        for (int j = s.length - 1; j >= s.length/2; j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
        }
    }
}