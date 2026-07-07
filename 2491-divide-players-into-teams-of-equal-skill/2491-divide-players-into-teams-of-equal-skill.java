class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length-1;
        long skillNumber =skill[left] + skill[right];
        long chemistry = 0;
        while(left< right){
            if(skill[left] + skill[right] == skillNumber){
                chemistry += skill[left] * skill[right];
            }else{
                return -1;
            }
            left++;
            right--;
        }
        return chemistry;
    }
}