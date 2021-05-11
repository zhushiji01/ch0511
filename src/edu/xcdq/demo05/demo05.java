package edu.xcdq.demo05;

import java.util.List;
import java.util.ArrayList;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/5/11 16:27
 */
public class demo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List tempList = list;  //泛型的删除
        tempList.add(1213);
        System.out.println(tempList);

    }
}
