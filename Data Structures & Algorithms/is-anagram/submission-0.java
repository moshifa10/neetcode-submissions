class Solution {
    public boolean isAnagram(String s, String t) {

        char[] charsArray = s.toCharArray(); 
        char[] charsArray2 = t.toCharArray(); 

        Arrays.sort(charsArray);
        Arrays.sort(charsArray2);

        return Arrays.equals(charsArray, charsArray2);
    }
}
