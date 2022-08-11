package com.company.advance.sorting;

public class InversionCountArray {
    public static void main(String[] args) {
        solve(new int[]{45, 10, 15, 25, 50});
    }
    public static int solve(int[] A) {
        return getIC(A,0,A.length-1);
    }
    public static int  getIC(int[] A,int s,int e) {
        if(s>e) return 0;
        if(s ==e) return 0;
        int MOD = 1000000007;
        int mid = s+e/2;
        int countIntraSeg1 = getIC(A,s,mid) % MOD;
        int countIntraSeg2 = getIC(A,mid+1,e) % MOD;
        int countInterSeg = mergeSortWithInterSegIC(A,s,mid,e) % MOD;
        return (countIntraSeg1+countIntraSeg2+countInterSeg) % MOD;
    }
    public static int mergeSortWithInterSegIC(int[] A,int s,int mid,int e) {
        int MOD = 1000000007;
        int count = 0;
        int[] temp = new int[e - s +1];
        int i = s;
        int j = mid+1;
        int index = 0;
        while(i <=mid && j <=e) {
            if(A[i] <=A[j]) {
                temp[index] = A[i];
                i++;
                index++;
            }
            else {
                temp[index] = A[j];
                j++;
                index++;
                count = count + (mid-i+1) % MOD;
            }
            //index++;
        }
        while( i <=mid) {
            temp[index] = A[i];
            i++;
            index++;
        }
        while( j <=mid) {
            temp[index] = A[j];
            j++;
            index++;
        }
        index = 0;
        for(int k = i ; k < e;k++) {
            A[k] = temp[index];
            index++;;
        }
        return count % MOD;
    }
}

