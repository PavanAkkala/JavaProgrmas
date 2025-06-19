package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSum(int[] num, int target) {

        HashMap<Integer,Integer> newMap = new HashMap<>();

        for(int i = 0; i<num.length; i++) {

            int extra = target - num[i]; // 9-5 = 4, 9-2=7, 9-11=-2, 9-4=5
            if(newMap.containsKey(extra)) {

                return new int[] {newMap.get(extra),i};
            }

            newMap.put(num[i], i); // 5:0, 2:1, 11:2
        }

        return null;
    }
    public static void main(String[] args) {

        int[] num = {5,2,11,4};

        int target = 9;

        int[] result = findTwoSum(num,target);
        System.out.println(Arrays.toString(result));
    }
}
