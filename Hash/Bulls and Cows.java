class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> s = new HashMap<>();
        HashMap<Character, Integer> g = new HashMap<>();
        int cows = 0;
        int bulls = 0;

        for(int i=0; i<secret.length(); i++){
            char sch = secret.charAt(i);
            char gch = guess.charAt(i);

            if(sch == gch){
                bulls++;
            }
            else{
                s.put(sch, s.getOrDefault(sch, 0) + 1);
                g.put(gch, g.getOrDefault(gch, 0) + 1);
            }
        }

        for(char ch : s.keySet()){
            if(g.containsKey(ch)){
                cows += Math.min(s.get(ch), g.get(ch));
            }
        }
        //return bulls+"A"+cows+"B";
        StringBuilder ans = new StringBuilder();
        ans.append(bulls).append("A").append(cows).append("B");
        return ans.toString();
    }
}
