public class StringManipulation {

    public String trimAndConcat(String string, String stringTwo){
        return string.trim().concat(stringTwo.trim());
    }
    public Integer getIndexOrNull(String str, char a) {
        if(str.indexOf(a) == -1) {
            return null;
        } else {
            return str.indexOf(a);
        }
    }
    public Integer getIndexOrNull(String input, String sub) {
        if(input.indexOf(sub) == -1) {
            return null;
        } else {
            return input.indexOf(sub);

        }
    }
    public String concatSubstring(String stringMain, int indexA, int indexB, String sString) {
        String newString = stringMain.substring(indexA, indexB);
        return newString.concat(sString);
    }
}