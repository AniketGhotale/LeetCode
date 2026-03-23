class Solution {
    public int getLucky(String s, int k) {
        int num = 0;
        int n = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int number = s.charAt(i) - 'a' + 1;
            sb.append(number); 
        }
        String str = sb.toString();
        while(k > 0){
            str = result(str);
            k--;
        }
        return Integer.parseInt(str);
    }
    String result(String str){
        int num = 0;
        for(int i=0; i<str.length(); i++){
            int no = str.charAt(i) - '0';
            num += no;
        }
        return String.valueOf(num);
    }
}