public class StringManipulator{
    public String trimAndConcat(String x, String y){
        String a = x.trim();
        String b = y.trim();
        return a + b;
    }

    public Integer getIndexOrNull(String x, char c){
        if (x.indexOf(c) != -1) {
            return x.indexOf(c);
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String a, String b){
        if (a.indexOf(b) != -1) {
            return a.indexOf(b);
        } else {
            return null;
        }
    }

    public String concatSubstring(String a, int x, int y, String b){
        String subString = a.substring(x, y);
        // return newStr + b;
        String output = subString.concat(b);
        return output;
    }
}