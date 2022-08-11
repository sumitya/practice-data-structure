package com.company.string;

public class ReverseStringScalerSoln {
    public static void main(String[] args) {
        String str = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(solve(str));
        System.out.println(solve(str).length());
    }

    public static String solve(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder buf = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' ') buf.append(c);
            else create(res, buf);
        }

        create(res, buf);
        return res.toString();
    }

    private static void create(StringBuilder res, StringBuilder buf)
    {
        int i = buf.length()-1;

        while(i>=0){
            if(i==buf.length()-1 && res.length()>0) res.append(' ');
            res.append(buf.charAt(i));
            i--;
        }
        buf.setLength(0);
    }
}

