package com.company.advance.modarthematic;

public class PrimeModInverse {
    public static void main(String[] args) {
        System.out.println(solve(12,55557209));
    }
    public static int solve(int A, int B) {
        //a^ m -2 % m;
        if(B<=2) return 1;
        //int mod = 1000000007;
        int C = B -2;
        int res = pow(A,C,B);
        return res;
    }
    public static int pow(int A,int B,int mod){
        long ans = 1;
        while(B > 0){
            if((B & 1) == 1) ans = (ans %mod * A % mod) % mod;
            A = (A %mod * A %mod ) % mod;
            B  = B >> 1;
        }
        return (int)(ans %mod);
    }
}
