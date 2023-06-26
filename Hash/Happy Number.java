class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            set.add(n);
            int sum = 0;
            while(n != 0){
                int digit = n%10;
                sum += digit*digit;
                n = n/10;
            }
            n = sum;
        }

        return n==1;
    }
}
