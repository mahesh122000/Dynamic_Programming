class Solution {
    public String validIPAddress(String IP) {
        if(IP.contains("."))
            return check4(IP);
        else
            return check6(IP);
    }
    public String check4(String IP)
    {
        if(IP.startsWith(".") || IP.endsWith(".")){
            return "Neither";
        }
        String[] a = IP.split("\\.");
        if (a.length != 4) {
            return "Neither";
        }
        for (String s : a) {
            if (s.startsWith("0") && s.length()>1) {
                return "Neither";
            }
            if (s.contains("-") || s.contains("+")) {
                return "Neither";
            }
            try {
                int i = Integer.parseInt(s);
                if (i < 0 || i > 255) {
                    return "Neither";
                }
            } catch (Exception e) {
                return "Neither";
            }
        }
        return "IPv4";
    }
    public String check6(String IP)
    {
        if(IP.startsWith(":") || IP.endsWith(":")){
            return "Neither";
        }
        String[] a = IP.split(":");
        if (a.length != 8) {
            return "Neither";
        }
        for (String s : a) {
            if (s.contains("-") || s.contains("+")) {
                return "Neither";
            }
            if(s.length()==0 || s.length()>4){
                return "Neither";
            }
            try{
                Integer.parseInt(s,16);
                } catch (Exception e) {
                    return "Neither";
                }
        }
        return "IPv6";
    }
}