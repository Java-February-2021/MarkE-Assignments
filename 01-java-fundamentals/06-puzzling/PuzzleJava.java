import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class PuzzleJava {

    public void sumArr(int[] arrSum) {
        ArrayList<Integer> ten = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arrSum.length; i++) {
            sum = sum + arrSum[i];
            if (arrSum[i] > 10) {
                ten.add(arrSum[i]);
            }
        }
        System.out.println(sum);
        System.out.println(ten);
    }
    public void nameRandom(String[] nameArr) {
        List<String> nameList = Arrays.asList(nameArr);
        Collections.shuffle(nameList);
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < nameArr.length; i++) {
            String currentName = nameArr[i];
            if (currentName.length() > 5) {
                names.add(currentName);
            }
        }
        System.out.println(nameList);
        System.out.println(names);
    }
    public void alphaShuffle() {
        ArrayList<Character> letter = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            letter.add(ch);
        }
        System.out.println(letter);
        Collections.shuffle(letter);
        System.out.println(letter.get(25));
        System.out.println(letter.get(0));
    }
    public void randomInt(int lower, int upper) {
        int[] list = new int[10];
        int bounds = upper - lower;
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(bounds) +lower;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
    public void randomStr(int length) {
        String[] strArr = new String[10];
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < strArr.length; i++) {
            for (int x = 0; x < length; x++){
                int randInt = random.nextInt(chars.length());
                sb.append(chars.charAt(randInt));
            }
            String newStr = sb.toString();
            strArr[i] = newStr;
            sb.setLength(0);
        }
        System.out.println(Arrays.toString(strArr));
    }
}