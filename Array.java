import java.util.Scanner;

// import array.Q1;

// import array.Q2;

// import array.Q3;

// import array.Q4;

// import array.Q5;

// import array.Q6;

// import array.Q7;

// import array.Q8;

// import array.Q9;

// import array.Q10;

// import array.Q11;

// import array.Q12;

// import array.Q13;

// import array.Q15;

import array.Q16;
import array.Q17;
import array.Q19;

/**
 * Array
 */
public class Array {

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static int[] createArray(Scanner scanner) {
        System.out.print("Enter the array length: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Q1 q1 = new Q1();
        // int[] arr = createArray(scanner);
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();
        // arr = q1.push(arr, num);
        // printArray(arr);

        // Q2 q2 = new Q2();
        // int[] arr = new int[]{1, 2, 3, 4, 5};
        // System.out.println(q2.avg(arr));

        int[] arr = new int[] { 12, 34, 23, 67, 77 };
        // System.out.print("Enter target: ");
        // int target = scanner.nextInt();

        // Q3 q3 = new Q3();
        // q3.indexOf(arr, target);

        // Q4 q4 = new Q4();
        // System.out.println(q4.contains(arr, target));

        // Q5 q5 = new Q5();
        // int[] nums = new int[] { 123, 145, 345, 55, 99, 33, 233, 2787 };
        // System.out.println("Before deletion");
        // printArray(nums);
        // nums = q5.delete(nums, target);
        // System.out.println("After deletion");
        // printArray(nums);

        // Q6 q6 = new Q6();
        // int[] copied_arr = q6.arrayCopy(arr);
        // printArray(copied_arr);

        // Q7 q7 = new Q7();
        // System.out.println("Before deletion");
        // printArray(arr);
        // arr = q7.insert(arr, 4, 1000);
        // System.out.println("Before deletion");
        // printArray(arr);

        // Q8 q8 = new Q8();
        // int[] arr1 = createArray(scanner);
        // q8.findMinAndMax(arr1);

        // Q9 q9 = new Q9();
        // int[] arr2 = createArray(scanner);
        // printArray(q9.reverse(arr2));

        // Q10 q10 = new Q10();
        // q10.findDuplicates(new int[] { 1, 2, 1, 3, 4, 7, 7, 9, 1, 3, 10 });

        // Q11 q11 = new Q11();
        // q11.findMatchingElements(new int[] { 2, 4, 5, 77 }, new int[] { 12, 3, 2, 5,
        // 77, 10 });

        // Q12 q12 = new Q12();
        // printArray(q12.removeDuplicate(new int[] { 1, 0, 1, 3, 4, 5, 5, 2, 1, 0, 0,
        // 0, 5 }));

        // Q13 q13 = new Q13();
        // System.out.println(q13.secondLargestElement(new int[] { 123, 56, -67, 0, 688,
        // 88, 999 }));

        // Q15 q15 = new Q15();
        // System.out.println("Even numbers count: " + q15.evenCount(arr));
        // System.out.println("Odd numbers count: " + q15.oddCount(arr));

        // Q16 q16 = new Q16();
        // System.out.println(q16.findDifference(arr));

        // Q17 q17 = new Q17();
        // System.out.println(q17.doesContain12And23(new int[]{12, 0, 6, 889, 99, 23}));

        Q19 q19 = new Q19();
        q19.findMissingNums(new int[]{12, 34, 78, 100, 4, 1, 45, 67});

        scanner.close();
    }
}