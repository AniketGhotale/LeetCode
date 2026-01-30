class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for(int i=0; i<operations.length; i++){

            // if(operations[i].length() > 1 || Character.isDigit(operations[i].charAt(0))){
            //     s.push(Integer.parseInt(operations[i]));
            // }else{
                if(operations[i].equals("C")){
                    s.pop();
                }else if(operations[i].equals("D")){
                    s.push(s.peek() * 2);
                }else if(operations[i].equals("+")){
                    int f = s.pop();
                    int sec = s.peek();
                    s.push(f);
                    s.push(f + sec);
                }else{
                    s.push(Integer.parseInt(operations[i]));
                }
            }
        //}
        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
    }
}