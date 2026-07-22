class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        // if(income == 0){
        //     return tax;
        // }
        double sa = brackets[0][0];
        double sp= brackets[0][1];
        if(income > 0){
            double diff = Math.min(income,sa);
            tax = (diff*sp)/100.0;
            income-=diff;
        }
        for(int i=1; i<brackets.length; i++){
            double a = brackets[i][0];
            double p = brackets[i][1];
            double diff = Math.min(income, a-sa);

            tax += (diff*p)/100.0;
            income-=diff;
            sa = a;
            sp = p;

        }
        return tax;
    }
}