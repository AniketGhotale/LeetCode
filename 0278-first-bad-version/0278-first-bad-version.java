/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bad = -1;
        int l = 0;
        int h = n;
        while(l <= h){
            int mid = l+((h-l)/2);
            if(isBadVersion(mid)){
                bad = mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return bad;
    }
}