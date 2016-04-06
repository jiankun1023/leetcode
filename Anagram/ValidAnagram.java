/*
HashMap to solve Valid Anagram
*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        
        int slen = s.length();
        int tlen = t.length();
        HashMap<Character, Integer> shashmap = new HashMap<>();
        HashMap<Character, Integer> thashmap = new HashMap<>();
        
        for (int i = 0;  i < slen; ++i) {
            if (shashmap.containsKey(s.charAt(i))) {
                shashmap.put(s.charAt(i), shashmap.get(s.charAt(i)) + 1);
            } else {
                 shashmap.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0;  i < tlen; ++i) {
            if (thashmap.containsKey(t.charAt(i))) {
                thashmap.put(t.charAt(i), thashmap.get(t.charAt(i)) + 1);
            } else {
                 thashmap.put(t.charAt(i), 1);
            }
        }
        
        Iterator<Character> it = thashmap.keySet().iterator();
        while (it.hasNext()) {
            char c = it.next();
            if (!shashmap.containsKey(c)) {
                return false;
            } else {
                int a = shashmap.get(c);
                int b = thashmap.get(c);
                if (a != b) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

/*
    Array as HashMap to be faster
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        
        int[] alphabetA = new int[26];
        int[] alphabetB = new int[26];
        int len = s.length();
        
        for (int i = 0; i < len; ++i) {
            alphabetA[(int)s.charAt(i) - 'a']++;
            alphabetB[(int)t.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; ++i) {
            if (alphabetA[i] != alphabetB[i]){
                return false;
            }
        }
        
        return true;
    }
}