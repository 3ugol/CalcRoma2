package com.company;

public class RomeNumbers {

    static String romeArr [] [] = {{"I","1"},{"V","5"},{"X","10"},{"L","50"},{"C","100"},{"D","500"},{"M","1000"}};

    public static int convertRA (String rom){
        int sum=0;
        for (int i = 0; i < rom.length(); i++) {
            for (int j = 0; j < romeArr.length; j++) {
                if (String.valueOf(rom.charAt(i)).equals(romeArr[j][0])) { // просто сумирует римские знаки без 4, 9 и т д
                    if (sum > Integer.parseInt(romeArr[j][1])){
                        sum -= Integer.parseInt(romeArr[j][1]);
                    }
                    if (sum < Integer.parseInt(romeArr[j][1])) {
                        sum += Integer.parseInt(romeArr[j][1]);
                    }
                }
            }
        }
        return sum;
    }
}
