class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length==0) return 0;
        HashSet<Integer> h = new HashSet<>();
        List<List<Integer>> formated = new ArrayList<>();
        for (int n : nums){
            h.add(n);
        }
        List<Integer> holder = new ArrayList<>();

        int[] good = new int[h.size()];

        int start=0;
        for(int i: h){
            good[start] = i;
            start++;
        }
        Arrays.sort(good);

        holder.add(good[0]);
        for (int i = 1; i< good.length; i++){
            boolean diff = good[i-1] + 1 == good[i];

            if (diff){
                holder.add(good[i]);
            }else{
                formated.add(holder);
                holder = new ArrayList<>();
                holder.add(good[i]);
            }
        }
        if(holder.size()>0){
            formated.add(holder);
        }

        if (formated.size()==0) return 0;

        int m = formated.get(0).size();

        for (int i=1; i<formated.size(); i++){
            m = Math.max(m, formated.get(i).size());
        }

        return m;



    }
}


