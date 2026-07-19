class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for(char ele: ch){
            set.add(ele);
        }
        return set.size();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(26) = O(1)