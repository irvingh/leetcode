public class RomanToInteger013 {
    RomanToInteger013() {
        System.out.println(romanToInteger("MDCCCLXXXIV"));
    }

    public int romanToInteger(String s) {
        int res = 0;
        int i = 0;
        while (i<s.length() && s.charAt(i)=='M') { res += 1000; i++; }
        if (i<s.length()-1 && s.substring(i, i+2).equals("CM")) { res += 900; i += 2; }
        while (i<s.length() && s.charAt(i)=='D') { res += 500; i++; }
        if (i<s.length()-1 && s.substring(i, i+2).equals("CD")) { res += 400; i += 2; }
        while (i<s.length() && s.charAt(i)=='C') { res += 100; i++; }
        if (i<s.length()-1 && s.substring(i, i+2).equals("XC")) { res += 90; i += 2; }
        while (i<s.length() && s.charAt(i)=='L') { res += 50; i++; }
        if (i<s.length()-1 && s.substring(i, i+2).equals("XL")) { res += 40; i += 2; }
        while (i<s.length() && s.charAt(i)=='X') { res += 10; i++; }
        if (i<s.length()-1 && s.substring(i, i+2).equals("IX")) { res += 9; i += 2; }
        if (i<s.length()-1 && s.substring(i, i+2).equals("IV")) { res += 4; i += 2; }
        while (i<s.length() && s.charAt(i)=='V') { res += 5; i++; }
        while (i<s.length() && s.charAt(i)=='I') { res += 1; i++; }
        return res;
    }
}
