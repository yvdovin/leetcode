import java.util.Stack;

class Solution946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        int j = 0;
        int n = pushed.length;
        Stack<Integer> stack = new Stack<>();
        while (i < n && j < n) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
            i++;
        }
        return stack.isEmpty();
    }
}