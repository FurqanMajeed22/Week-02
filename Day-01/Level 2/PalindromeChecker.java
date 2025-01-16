class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleanedText = text.toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString(); 
        return cleanedText.equals(reversedText); // Check if the orignal text is equal to its reversed version
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("abbbabbba");
        checker1.displayResult(); // Should display palindrome

        PalindromeChecker checker2 = new PalindromeChecker("HelloWorld");
        checker2.displayResult(); // Should display not a palindrome
    }
}
