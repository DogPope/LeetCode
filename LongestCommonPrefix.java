// Problem can be found at: https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix{

    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0)
            return "";

        // Start by assuming the whole first string is the common prefix
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the start of the next string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String a[]){
        String[] strs = {"flower", "flow", "flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.longestCommonPrefix(strs);
        System.out.println(result); // In this case, "fl"
    }
}