import java.util.ArrayList;
import java.util.Arrays;

class Basics {

    public void printAll(int min, int max) {
        for (int i = min; i <= max; i++){
            System.out.println(i);
        }
    }
    public void printOdd(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printSum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            int count = i;
            sum = count + i;
            System.out.println("New number: " + i + " " + "Sum: " + sum);
        }
    }
    public void iterate(int[] myArray) {
        for (int idx : myArray) {
            System.out.println(idx);
        }
    }
    public void maxValue(int[] newArray) {
        int max = newArray[0];
        for (int idx : newArray) {
            if (idx > max) {
                max = idx;
            }
        }
        System.out.println(max);
    }
    public void averageValue(int[] avArray) {
        int sum = 0;
        for (int idx : avArray) {
            int count = idx;
            sum = count + idx;
        }
        int average = sum / avArray.length;
        System.out.println(average);
    }
    public void arrOdd(int min, int max) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            if ( i % 2 !=0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }
    public void arrVal(int[] valArr, int val) {
        int count = 0;
        for (int idx : valArr) {
            if ( idx > val) {
                count ++;
            }
        }
        System.out.println(count);
    }
    public void arrSquare(int[] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i] = squareArray[i] * squareArray[i];
        }
        System.out.println(Arrays.toString(squareArray));
    }
    public void arrMaxMinAvr(int[] maxminavrArray) {
        ArrayList<Integer> arrValues = new ArrayList<Integer>();
        int max = maxminavrArray[0];
        int min = maxminavrArray[0];
        int sum = 0;
        for (int idx : maxminavrArray) {
            if (idx > max) {
                max = idx;
            } else if (idx < min) {
                min = idx;
            } else {
                int count = idx;
                sum = count + idx;
            }
        }
        int average = sum / maxminavrArray.length;
        arrValues.add(max);
        arrValues.add(min);
        arrValues.add(average);
        System.out.println(arrValues);
    }
    public void negElim(int[] negArr) {
        for (int i = 0; i < negArr.length; i++) {
            if (negArr[i] < 0) {
                negArr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(negArr));
    }
    public void arrShift(int[] shiftArr) {
        for (int i = 1; i <shiftArr.length; i++){
            shiftArr[i-1] = shiftArr[i];
        }
        shiftArr[shiftArr.length-1] = 0;
        System.out.println(Arrays.toString(shiftArr));
    }
    
}