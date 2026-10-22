class Solution {
    public boolean isAnagram(String s, String t) {

        char[] charsArray = s.toCharArray(); 
        char[] charsArray2 = t.toCharArray(); 

        Arrays.sort(charsArray);
        Arrays.sort(charsArray2);

        if ( Arrays.equals(charsArray, charsArray2)){
            return true;
        }
        else{
            return false;
        }
    }
}
