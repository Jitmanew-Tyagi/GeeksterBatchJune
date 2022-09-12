class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr) hm.put(i, hm.getOrDefault(i, 0) + 1);
        for(int i : hm.keySet()) {
            if(hs.contains(hm.get(i))) return false;
            hs.add(hm.get(i));
        }
        return true;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)  {
            if(hs.contains(i)) return true;
            hs.add(i);
        }
        return false;
    }
}