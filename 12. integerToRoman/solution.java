class Solution {
    public String intToRoman(int num) {
        String roman = "";
        String temp = "";
        // numbers only up to 3999 so just do each
        temp = Integer.toString(num % 10);
        num = num / 10;
        if (temp.equals("1")) {
            temp = "I";
        } else if (temp.equals("2")) {
            temp = "II";
        } else if (temp.equals("3")) {
            temp = "III";
        } else if (temp.equals("4")) {
            temp = "IV";
        } else if (temp.equals("5")) {
            temp = "V";
        } else if (temp.equals("6")) {
            temp = "VI";
        } else if (temp.equals("7")) {
            temp = "VII";
        } else if (temp.equals("8")) {
            temp = "VIII";
        } else if (temp.equals("9")) {
            temp = "IX";
        } else {
            temp = "";
        }
        roman = temp;
        
        temp = Integer.toString(num % 10);
        num = num / 10;
        
        if (temp.equals("1")) {
            temp = "X";
        } else if (temp.equals("2")) {
            temp = "XX";
        } else if (temp.equals("3")) {
            temp = "XXX";
        } else if (temp.equals("4")) {
            temp = "XL";
        } else if (temp.equals("5")) {
            temp = "L";
        } else if (temp.equals("6")) {
            temp = "LX";
        } else if (temp.equals("7")) {
            temp = "LXX";
        } else if (temp.equals("8")) {
            temp = "LXXX";
        } else if (temp.equals("9")) {
            temp = "XC";
        } else {
            temp = "";
        }
        temp += roman;
        roman = temp;
        
        temp = Integer.toString(num % 10);
        num = num / 10;
        
        if (temp.equals("1")) {
            temp = "C";
        } else if (temp.equals("2")) {
            temp = "CC";
        } else if (temp.equals("3")) {
            temp = "CCC";
        } else if (temp.equals("4")) {
            temp = "CD";
        } else if (temp.equals("5")) {
            temp = "D";
        } else if (temp.equals("6")) {
            temp = "DC";
        } else if (temp.equals("7")) {
            temp = "DCC";
        } else if (temp.equals("8")) {
            temp = "DCCC";
        } else if (temp.equals("9")) {
            temp = "CM";
        } else {
            temp = "";
        }
        temp += roman;
        roman = temp;
        
        
        temp = Integer.toString(num % 10);
        num = num / 10;
        
        if (temp.equals("1")) {
            temp = "M";
        } else if (temp.equals("2")) {
            temp = "MM";
        } else if (temp.equals("3")) {
            temp = "MMM";
        } else {
            temp = "";
        }
        temp += roman;
        roman = temp;
        
        return roman;
    }
}
