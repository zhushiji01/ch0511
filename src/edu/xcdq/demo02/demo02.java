package edu.xcdq.demo02;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/5/11 15:22
 */
public class demo02 {
    public static void main(String[] args) {
        Pair<Integer> pair1 = new Pair<>(1, 2);
        System.out.println(pair1);

        Pair<Double> pair2 = new Pair<>(1.1, 2.2);
        System.out.println(pair2);

        Pair<String> pair3 = new Pair<>("hahaha","hehehe");
        System.out.println(pair3);

    }
}
