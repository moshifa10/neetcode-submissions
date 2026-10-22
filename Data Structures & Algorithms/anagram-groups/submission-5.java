class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);

            }else{
                ArrayList<String> newArrayList = new ArrayList<>();
                newArrayList.add(s);
                map.put(sorted, newArrayList);
            }
        }

        for(String s : map.keySet()){
            group.add(map.get(s));
        }


        return group;
    }
}
