package com.company.LC;

public class MaximumGap_164 {
    public static void main(String[] args) {

    }
    public int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2) return 0;
        int maxGap = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if(min == max) return maxGap;

        int noOfBuckets = nums.length - 1;
        int bucketSize = (int) Math.ceil((double) (max - min) / noOfBuckets);

        // Initialize buckets
        Bucket[] buckets = new Bucket[noOfBuckets+1];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new Bucket();
        }

        // fill in the nums into their respective buckets
        for(int num : nums){
            int index = (num - min)/bucketSize;
            buckets[index].update(num);
        }

        // get the maxGap with the formula prevMax - current's bucket min
        int prevMax = min;
        for(Bucket bucket : buckets){
            if(bucket.min != Integer.MAX_VALUE){
                maxGap = Math.max(maxGap, (bucket.min - prevMax));
                prevMax = bucket.max;
            }
        }

        return maxGap;
    }

    private class Bucket{
        private int min;
        private int max;

        public Bucket(){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }

        private void update(int val){
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
    }
}
