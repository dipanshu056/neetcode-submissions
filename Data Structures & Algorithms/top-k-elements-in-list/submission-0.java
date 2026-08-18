class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        PriorityQueue<Integer> minhp = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int a : map.keySet()){
            minhp.offer(a);
            if(minhp.size()>k){
                minhp.poll();
            }
        }

        int arr[] = new int[k];
        int i = 0;
        while(!minhp.isEmpty()){
            arr[i++] = minhp.poll();
        }
        return arr;
    }
}
