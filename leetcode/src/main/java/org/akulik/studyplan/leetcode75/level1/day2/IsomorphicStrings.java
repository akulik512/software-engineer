package org.akulik.studyplan.leetcode75.level1.day2;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] mappingStoT = new int[256];
        int[] mappingTtoS = new int[256];

        for (int i = 0; i < s.length(); ++i) {
            char characterS = s.charAt(i);
            char characterT = t.charAt(i);

            if (mappingStoT[characterS] == 0 && mappingTtoS[characterT] == 0) {
                mappingStoT[characterS] = characterT;
                mappingTtoS[characterT] = characterS;
            } else if (!(mappingStoT[characterS] == characterT && mappingTtoS[characterT] == characterS)) {
                return false;
            }
        }

        return true;
    }
}
