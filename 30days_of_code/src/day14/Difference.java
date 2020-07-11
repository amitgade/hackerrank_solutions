package day14;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : elements) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

        }
        maximumDifference = Math.abs(max - min);
    }
}
