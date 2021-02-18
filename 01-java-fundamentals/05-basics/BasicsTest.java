class BasicsTest {
    public static void main(String[] args){
        
        Basics test = new Basics();

        test.printAll(1, 255);
        test.printOdd(1, 255);
        test.printSum(0, 255);
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        test.iterate(myArray);
        int[] newArray = {4, 2, 7, 5, 10, 3, -2};
        test.maxValue(newArray);
        int[] avArray = {1, 2, 3};
        test.averageValue(avArray);
        test.arrOdd(1, 255);
        int[] valArr = {1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10};
        test.arrVal(valArr, 5);
        int[] squareArray = {2, 4, 6, 8};
        test.arrSquare(squareArray);
        int[] maxminavrArray = {10, -5, 7, 2, 15};
        test.arrMaxMinAvr(maxminavrArray);
        int[] negArr = {-4, 5, 3, -6, 10, -7, -3};
        test.negElim(negArr);
        int[] shiftArr = {5, 7, 2, -4, 8, 10, -12, 9};
        test.arrShift(shiftArr);
    }
}