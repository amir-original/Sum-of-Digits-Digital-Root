public class DigitalRoot {

    private static final int ONE_DIGIT = 1;

    public int sumDigitalRoot(int number) {
        String root = intToString(number);
        int sum = sumRoots(root);

        if (hasOneDigit(root)) return sum;

        return sumDigitalRoot(sum);
    }

    private boolean hasOneDigit(String root) {
        return root.length() == ONE_DIGIT;
    }

    private int sumRoots(String number) {
        int result = 0;
        for (int index = 0; index < number.length(); index++)
            result += getDigitalRoot(number, index);

        return result;
    }

    private int getDigitalRoot(String number, int index) {
        return toInteger(charToString(number.charAt(index)));
    }

    private int toInteger(String number) {
        return Integer.parseInt(number);
    }

    private String charToString(char number) {
        return String.valueOf(number);
    }

    private String intToString(int number) {
        return String.valueOf(number);
    }
}
