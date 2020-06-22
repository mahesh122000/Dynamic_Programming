import java.util.regex.*;
class Solution {
    public boolean isNumber(String s) {
        String regex="(\\+|-)?(([0-9]+(\\.([0-9]+)?)?)|(\\.[0-9]+))(e(\\+|-)?[0-9]+)?";
        s=s.trim();
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        return m.matches();
    }
}