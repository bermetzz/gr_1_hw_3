package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] digits={1.1, 2.0, 3.2, 3.3, -5.3, -8.34, 0.1, -0.5, 7.0, 9.9, -4.0, -5.5, 2.1, 3.21, -4.4};
        boolean negativeFirst=false;
        double sum=0;
        double average=0;
        int count=0;
        for (double num:digits){
            if (num<0){
                negativeFirst=true;
                continue;
            }
            if (negativeFirst){
                count++;
                sum+=num;
                average=sum/count;
            }
        }
        System.out.println(sum);
        System.out.println(average);


        // 2 task
        double[] numbers={5.5, 2.1, 0.2, 0.1};
        for (int i = 0; i < numbers.length; i++) {
            double min = numbers[i];
            int indexOfMin = i;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            double place = numbers[i];
            numbers[i] = min;
            numbers[indexOfMin] = place;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
