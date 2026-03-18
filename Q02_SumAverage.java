package workshop;

// Question 2: Sum and average of float array elements

public class Q02_SumAverage {
    public static void main(String[] args) {
        float[] numbers = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float sum = 0;
        for (float num : numbers) {
            sum += num;
        }
        float average = sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
