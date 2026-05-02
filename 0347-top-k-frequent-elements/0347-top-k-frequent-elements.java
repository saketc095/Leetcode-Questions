class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int num : hm.keySet()){
            int frequency = hm.get(num);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(num);
        }

        int res[] = new int[k];
        int index = 0;
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[index] = num;
                    index++;
                    if(index==k)
                        return res;
                }
            }
        }
        return res;
    }
}