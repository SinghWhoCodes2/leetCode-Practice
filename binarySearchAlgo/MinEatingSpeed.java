package binarySearchAlgo;

 public class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int h) {

        //best explaination https://youtu.be/Sp2sRLcLND0
           int left=1;
           int right=findMax(piles);
           while (left<right) {
               
               int mid=left+(right-left)/2;
               if (canEatInTime(piles,h,mid)) {
                   right=mid;
               }else {
                   left=mid+1;
               }
               
           }
           return right;
       }

   public boolean canEatInTime(int[] piles, int h, int mid) {
      int count = 0;
    
    for(int pile:piles){
        count += (pile - 1) / mid + 1; // rounded up integer division
        if(count>h) return false;    // exit earlier, if possible
    }
    
    return true;
       
   }

   public int findMax(int[] piles) {
       
       int max=Integer.MAX_VALUE;
       for (int i : piles) {
           max=Math.max(max, i);
       }
       return max;
       
       
   }
} 
