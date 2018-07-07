public class IntegerToRoman012 {
    IntegerToRoman012() {
        System.out.println(intToRoman(1994));
    }

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while (num/1000>0) {
            res.append("M");
            num -= 1000;
        }
        if (900<=num && num<1000) {
            res.append("CM");
            num -= 900;
        }
        while (num/500>0) {
            res.append("D");
            num -= 500;
        }
        if (400<=num && num<500) {
            res.append("CD");
            num -= 400;
        }
        while (num/100>0) {
            res.append("C");
            num -= 100;
        }
        if (90<=num && num<100) {
            res.append("XC");
            num -= 90;
        }
        while (num/50>0) {
            res.append("L");
            num -= 50;
        }
        if (40<=num && num<50) {
            res.append("XL");
            num -= 40;
        }
        while (num/10>0) {
            res.append("X");
            num -= 10;
        }
        if (9<=num && num<10) {
            res.append("IX");
            num -= 9;
        }
        while (num/5>0) {
            res.append("V");
            num -= 5;
        }
        if (4<=num && num<5) {
            res.append("IV");
            num -= 4;
        }
        while (num-->0) {
            res.append("I");
        }
        return res.toString();
    }
}
