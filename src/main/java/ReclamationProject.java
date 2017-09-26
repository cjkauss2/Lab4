/**
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
public class ReclamationProject {
    /**
     * The following function compares two inputed strings
     * and returns the longest substring that appears in both strings.
     * @param str1 first inputed string
     * @param str2 second inputed string
     * @return longest common substring
     */
    static String findLongestSubstring(final String str1, final String str2) {
        String shortString = str1;
        String longString = str2;
        if (str1.length() > str2.length()) {
            shortString = str2;
            longString = str1;
        }
        String longestSubstring = "";

        for (int i = 0; i < longString.length(); i++) {
            for (int j = longString.length() - i; j > 0; j--) {
                for (int k = 0; k < shortString.length() - j; k++) {
                    if (longString.regionMatches(i, shortString, k, j)
                            && j > longestSubstring.length()) {
                        longestSubstring = longString.substring(i, i + j);
                    }
                }
            }
        }
        return longestSubstring;
    }
}
