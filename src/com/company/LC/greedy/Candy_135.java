package com.company.LC.greedy;

import java.util.Arrays;

public class Candy_135 {
    public static void main(String[] args) {
        int[] ratings1 = new int[]{10,12,8,4,40,42,6};
        int[] ratings2 = new int[]{1,0,2};
        int[] ratings3 = new int[]{1,2,2};
        int[] ratings4 = new int[]{1,3,2,2,1};
        int[] ratings5 = new int[]{357,287,248,96,22,295,-78,-239,-482,74,269,265,-269,-130,351,109,490,431,-171,335,321,-485,313,-475,-43,322,-132,42,-171,389,493,-444,-265,-458,-71,-395,134,-233,211,356,-330,-336,274,-193,-421,-163,29,329,-466,-60,96,432,171,-385,-52,120,-403,-325,-97,100,61,-80,-82,426,263,-256,476,-390,444,-148,414,376,-298,192,-183,-53,386,127,-329,125,-328,490,-12,132,40,414,347,439,255,-343,-84,256,38,-368,307,463,29,-428,-25,-51,-385,145,86,441,361,183,-407,-227,-404,-225,-279,-37,280,-13,-258,-393,164,361,146,-293,248,-320,-389,-337,341,-1,-445,-420,414,-63,328,120,-462,318,500,-358,233,-165,274,-388,-393,-48,312,-173,281,325,-167,383,353,125,-416,-179,-285,-449,418,288,62,-186,413,-500,199,281,-163,-99,193,-130,414,392,299,328,156,-247,-85,-455,-274,54,-161,82,-265,311,-129,-143,45,308,408,346,438,-441,-237,402,-428,-230,24,317,-189,-356,-53,419,426,-362,399,460,335,84,177,138,229,162,416,-284,-44,-423,-9,-271,425,-166,-482,-335,-357,6,-191,261,391,-68,224,402,-487,-45,312,233,-393,138,-95,-139,-239,234,227,-292,117,-131,-221,373,97,-456,-292,460,238,280,43,206,-8,-117,274,-10,182,-77,-421,-309,493,-355,-88,14,67,112,177,426,468,449,263,-208,198,378,-431,444,-383};

        System.out.println(candy(ratings5));
    }
    public static int candy(int[] ratings) {
        // every child needs to get min. 1 candy, init array with 1
        // 1st iteration: compare rating with left neighbour, if higher candy[++i]
        // 2nd iteration: compare rating with right neighbour, candy = get max of (candyFromStep1,candyFromRight)
        int sum = 0;
        int[] minCandies = new int[ratings.length];
        Arrays.fill(minCandies, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                minCandies[i] = minCandies[i - 1] + 1;
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            // sum can be done in this loop also
            if (ratings[i] > ratings[i + 1])
                minCandies[i] = Math.max(minCandies[i], minCandies[i + 1] + 1);
        }
        for (int i = 0; i < ratings.length; i++) {
            sum += minCandies[i];
        }
        return sum;
    }
}
