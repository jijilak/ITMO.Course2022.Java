package ITMO.Laboratory5;

public class Exersize1 {
    public static String getWord(String date){
        String array[] = date.split(" ");
        int l = 0;
        String word = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > l) {
                l = array[i].length();
                word = array[i];
            }
        }
        return word;
    }
    public static boolean isWordPaliandrom(String date){
        StringBuilder str = new StringBuilder(date);
        String strPaliandrom = str.reverse().toString();
        return date.equalsIgnoreCase(strPaliandrom);
    }
    public static String replacementBjaka (String date) {
        return date.toLowerCase().replace("бяку", "[вырезано цензурой]");
    }
    public static int numberOfOccurrences (String Occurrences, String str){
        int a = 0;
        for (int i = str.indexOf(Occurrences); i >= 0; i = str.indexOf(Occurrences, i + 1)) {
            a++;
        }
        return a;
    }
public static String strInversion(String str) {
        String [ ] strArray = str.split (" ");
        StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < strArray.length; i++) {
        String reversedStr = new StringBuilder(strArray[i]).reverse().toString();
        strBuilder.append(reversedStr)
                .append(" ");
        }
        return strBuilder.toString().trim();
}
}
