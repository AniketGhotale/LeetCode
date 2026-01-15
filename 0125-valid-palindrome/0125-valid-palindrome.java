class Solution {
    public boolean isPalindrome(String s) {

        int first=0;
        int last = s.length()-1;
      
        while(first <last){
            while(first < last && !Character.isLetterOrDigit(s.charAt(first))){
                first++;
            }
            while(first < last && !Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }
            if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
                return false;
            }else{
                first++;
                last--;
            }

        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {

//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {

//             // skip non-alphanumeric from left
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }

//             // skip non-alphanumeric from right
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }

//             // compare after converting to lowercase
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }
// }
