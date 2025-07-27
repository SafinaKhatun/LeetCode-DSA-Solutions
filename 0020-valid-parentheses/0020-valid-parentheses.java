class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()]; // Stack to hold expected closing brackets
        int top = -1; // Initialize top of stack

        for (char ch : s.toCharArray()) { // Iterate through each character in the string
            if (ch == '(') {
                stack[++top] = ')'; // Push expected closing bracket for '('
            } else if (ch == '{') {
                stack[++top] = '}'; // Push expected closing bracket for '{'
            } else if (ch == '[') {
                stack[++top] = ']'; // Push expected closing bracket for '['
            } else {
                // Check if stack is empty or top of stack does not match current closing bracket
                if (top == -1 || stack[top--] != ch) {
                    return false; // Invalid bracket sequence
                }
            }
        }
        return top == -1; // Return true if all brackets are matched
    }
}
