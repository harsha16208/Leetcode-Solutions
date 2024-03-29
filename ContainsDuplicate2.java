class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                if (Math.abs(map.get(num) - i) <= k) return true;
            } map.put(num, i);
        }
        System.out.println(map);
        return false;
    }
}
