/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pie.ch8.sort;

import java.util.ArrayList;

/**
 *
 * @author huico
 */
public class SortUtils {

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list, int startPos) {
        int[] numbers = {1,1,2,3,4};
        int size = numbers.length;
        int minPos = startPos;
        for (int i = startPos + 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minPos)) {
                minPos = i;
            }
        }
        //Switch position startPos and position minPos
        Integer temp = list.get(startPos);
        list.set(startPos, list.get(minPos));
        list.set(minPos, temp);
        if (startPos < list.size() - 2) {
            selectionSort(list, startPos + 1);
        }
        return list;
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        int midPos = (list.size() - 1) / 2;
        ArrayList<Integer> left = new ArrayList();
        ArrayList<Integer> right = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i == midPos) {
                continue;
            }
            if (list.get(i) < list.get(midPos)) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        if (left.size() > 0) {
            leftList = quickSort(left);
        }
        if (right.size() > 0) {
            rightList = quickSort(right);
        }
        ArrayList<Integer> result = new ArrayList();
        result.addAll(leftList);
        result.add(list.get(midPos));
        result.addAll(rightList);
        return result;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        ArrayList<Integer> resultList = new ArrayList();
        if (list.size() < 2) {
            return list;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            leftList.add(list.get(i));
        }
        for (int i = list.size() / 2; i < list.size(); i++) {
            rightList.add(list.get(i));
        }
        ArrayList<Integer> leftListResult = mergeSort(leftList);
        ArrayList<Integer> rightListResult = mergeSort(rightList);
        int leftPos = 0;
        int rightPos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (leftPos < leftListResult.size() && rightPos < rightListResult.size()) {
                if (leftListResult.get(leftPos) < rightListResult.get(rightPos)) {
                    resultList.add(leftListResult.get(leftPos));
                    leftPos++;
                } else {
                    resultList.add(rightListResult.get(rightPos));
                    rightPos++;
                }
            } else if (leftPos >= leftListResult.size()) {
                resultList.add(rightListResult.get(rightPos));
                rightPos++;
            } else if (rightPos >= rightListResult.size()) {
                resultList.add(leftListResult.get(leftPos));
                leftPos++;
            }
        }
        return resultList;
    }
}
