
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }
        }

        int[] sorted = new int[frequency.size()];

        int start = 0;
        for (Integer num : frequency.keySet()) {
            sorted[start] = frequency.get(num);
            start++;
        }

        Arrays.sort(sorted);

        int[] result = new int[k];
        Set<Integer> selected = new HashSet<>();

        start = sorted.length - 1;
        int begin = 0;

        while (begin < k) {

            for (Integer num : frequency.keySet()) {

                if (frequency.get(num) == sorted[start]
                        && !selected.contains(num)) {

                    result[begin] = num;
                    selected.add(num);
                    begin++;

                    if (begin == k) {
                        break;
                    }
                }
            }

            start--;
        }

        return result;
    }
}