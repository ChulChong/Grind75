class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while (n != 1) {
            if (!hs.add(n))
                return false;
            n = getNext(n);
        }
        return true;

    }

    public int getNext(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit;
            temp /= 10;
        }
        return sum;
    }
}