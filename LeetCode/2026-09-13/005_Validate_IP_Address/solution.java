class Solution {
    public String validIPAddress(String IP) {
        if(IP.length()==0) return "Neither";
        
        if(IP.indexOf(".")>=0) return validateIPV4(IP);
        
        if(IP.indexOf(":")>=0) return validateIPV6(IP);
        
        return "Neither";
    }
