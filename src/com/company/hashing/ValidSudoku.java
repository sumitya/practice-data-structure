package com.company.hashing;


import java.util.HashSet;

public class ValidSudoku {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (A[i].charAt(j) != '.') {
                    if (!hs.add("row" + i + A[i].charAt(j)) || !hs.add("col" + j + A[i].charAt(j)))
                        return 0;
                    if (!hs.add("box" + ((i / 3) * 3 + (j / 3)) + A[i].charAt(j)))
                        return 0;
                }
            }
        }
        return 1;
    }
}