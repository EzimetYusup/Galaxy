package collection;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yyakup on 8/24/16.
 */
public class SortTest {


    public static void main(String[] args) {
        testBubbleSort();

    }

    public static void testBubbleSort() {

        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable
        int[] num = {23, 12, 10, 7, 12, 34, 89, 76};

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1])   // change to > for ascending sort
                {
                    temp = num[j];                //swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
       }
        int i =0;
        while (i < 8) {
            System.out.println(num[i]);
            i++;
        }
    }
}