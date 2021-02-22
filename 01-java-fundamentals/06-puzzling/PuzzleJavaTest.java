class PuzzleJavaTest {
    public static void main(String[] args){

        PuzzleJava puzzle = new PuzzleJava();

        int[] arrSum = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        puzzle.sumArr(arrSum);
        String[] nameArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        puzzle.nameRandom(nameArr);
        puzzle.alphaShuffle();
        int lower = 11;
        int upper = 55;
        puzzle.randomInt(lower, upper);
        int length = 5;
        puzzle.randomStr(length);
    }
}