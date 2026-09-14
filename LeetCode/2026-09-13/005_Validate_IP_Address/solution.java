class Solution {
    public String validIPAddress(String IP) {
        if(IP.length()==0) return "Neither";
        
        if(IP.indexOf(".")>=0) return validateIPV4(IP);
        
        if(IP.indexOf(":")>=0) return validateIPV6(IP);
        
        return "Neither";
    }
    private String validateIPV4(String ip){
        if(ip.charAt(0)=='.' || ip.charAt(ip.length()-1)=='.') return "Neither";
           
        String[] component=ip.split("\\.");
          
        if(component.length!=4) return "Neither";
