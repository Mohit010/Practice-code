class Solution {
    public double average(int[] salary) {
        double min = Double. MAX_VALUE;
        double max = 0;
        double sum = 0;

        for(int i=0;i<salary.length;i++){
            if(salary[i] > max){
                max = salary[i];
            }
        }

        for(int i=0;i<salary.length;i++){
            sum = sum + salary[i];
        }

        for(int i=0;i<salary.length;i++){
               if(salary[i] < min){
                min = salary[i];
            }

        }
        double msum = min + max;
        double fsum = sum - msum;

        double n = salary.length - 2;

        double ans = fsum / n;

        return ans;
    }
}