package Strings.Easy;

// Easy
public class DefangingIpAddress {
    public static String defangIPaddr(String validIP) {
        return validIP.replaceAll("\\.", "[.]");
    }
}
