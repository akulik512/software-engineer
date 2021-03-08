package com.akulik.ocp;

public class Field {

    public static final long F1 = 859_378_234;

    public static final float F2 = 12.34F;
    /** Wrong cases:
     * <pre>
     * public static final float F2_1 = _12.34F;
     * public static final float F2_2 = 12.34F_;
     * public static final float F2_3 = 12_.34F;
     * public static final float F2_4 = 12._34F;
     * public static final float F2_4 = 12.34_F;
     * </pre>
     */
    public static void main(String[] args) {
        System.out.println(F1);
        System.out.println(F2);
    }

}
