public class DigitalRoot {
    public int sumDigitalRoot(int number) {
        String root = String.valueOf(number);
        int sum = 0;
        while (root.length() != 1) {
            sum = sumRoots(root);
            root = String.valueOf(sum);
        }

        return sum;
    }

    private int sumRoots(String root) {
        int sum = 0;
        for (int i = 0; i < root.length(); i++) {
            sum += Integer.parseInt(String.valueOf(root.charAt(i)));
        }
        return sum;
    }
}
