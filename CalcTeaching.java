package com.laptop.calc;

//boring game
public class CalcTeaching {
    
    public static long COUNT = 0;
    
    public static int MAX = 100;
    
    public static int MIN = 0;
    
    public static int A1 = 0;
    
    public static int A2 = 0;
    
    public static int B1 = 0;
    
    public static int B2 = 0;
    
    public static void main(String[] args) {
        for (int i = MIN; i < MAX; i++) {
            A1 = i;
            for (int j = MIN; j < MAX; j++) {
                A2 = j;
                for (int k = MIN; k < MAX; k++) {
                    B1 = k;
                    for (int p = MIN; p < MAX; p++) {
                        B2 = p;
                        // 条件
                        boolean row1 = (A1 + A2 == 80);
                        boolean row2 = (B1 - B2 == 60);
                        boolean column1 = (A1 + B1 == 130);
                        boolean column2 = (A2 + B2 == 80);
                        // 如果满足,结果数+1
                        if (row1 && row2 && column1 && column2) {
                            ++COUNT;
                            System.out.println(A1 + " + " + A2 + " = 80");
                            System.out.println("+     +");
                            System.out.println(B1 + " - " + B2 + " = 60");
                            System.out.println("=     =");
                            System.out.println("130  " + (A2 + B2));
                            System.out.println("----------------------");
                        }
                    }
                }
            }
        }
        System.out.println(COUNT);
    }
    
}
