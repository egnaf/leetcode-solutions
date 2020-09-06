package solutions.problem1108;

class Solution {
    public static String defangIPaddr(String address) {
        return address.replaceAll("[.]", "[.]");
    }
}
