public class IntegerToRoman {
    public static void main(String[] args){

        IntegerToRoman integerToRoman = new IntegerToRoman();
        String result = integerToRoman.intRoman(1994);
        System.out.println("Print the values Roman Number " + result);

    }

    public String intRoman(int number){
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanInteger = "";

        for(int i = 0; i < storeInt.length; i++){
            while(number >= storeInt[i]){
                String symbol = storeRoman[i];
                romanInteger += symbol;
                number -= storeInt[i];
            }
        }
        return romanInteger;
    }
}
