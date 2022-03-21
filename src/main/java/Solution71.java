import java.util.LinkedList;
import java.util.Stack;

class Solution71 {

    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String dir : dirs) {
            if (dir.equals(".") || dir.equals("")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/");
            sb.append(dir);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }

//    public String simplifyPath(String path) {
//        String s = path.replaceAll("//+", "/");
//        if (s.charAt(s.length() - 1) == '/') s = s.substring(0, s.length() - 1);
//        if (s.length() == 0) return "/";
//        String[] arr = s.substring(1).split("/");
//        LinkedList<String> stack = new LinkedList<>();
//        for (String ss : arr) {
//            if (ss.equals("..")) {
//                if (!stack.isEmpty()) stack.removeLast();
//            } else if (!ss.equals(".")) {
//                stack.addLast(ss);
//            }
//        }
//        StringBuilder res = new StringBuilder();
//        while (!stack.isEmpty()) {
//            res.append("/").append(stack.pollFirst());
//        }
//        return res.length() == 0 ? "/" : res.toString();
//    }
}