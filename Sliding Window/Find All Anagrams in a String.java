class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> pmap = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            smap.put(c, smap.getOrDefault(c, 0) + 1);
            right++;

            if(pmap.equals(smap)){
                ans.add(left);
            }

            if(right - left == p.length()){
                char leftChar = s.charAt(left);
                if(smap.containsKey(leftChar)){
                    smap.put(leftChar, smap.get(leftChar) - 1);
                    if(smap.get(leftChar) == 0){
                        smap.remove(leftChar);
                    }
                }
                left++;
            }
        }
        return ans;
    }
}
