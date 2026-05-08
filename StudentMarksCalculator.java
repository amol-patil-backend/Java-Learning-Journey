package Java_Practice;

public class Demo {

    public static int findMaxMark(int[] marks) {
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public static int findMinMark(int[] marks) {
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public static int calculateSum(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public static int countBelowAverage(int[] marks, double average) {
        int count = 0;
        for (int mark : marks) {
            if (mark < average) {
                count++;
            }
        }
        return count;
    }

    public static void printMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d Student Mark : %d%n", i + 1, marks[i]);
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 92, 67, 88};

        printMarks(marks);

        int max = findMaxMark(marks);
        System.out.println("\nMaximum Mark : " + max);

        int min = findMinMark(marks);
        System.out.println("Minimum Mark : " + min);

        int sum = calculateSum(marks);
        double average = sum / (double) marks.length;
        System.out.printf("Total average : %.2f%n", average);

        int belowAvgCount = countBelowAverage(marks, average);
        System.out.println("Total students less than average : " + belowAvgCount);
    }
}
