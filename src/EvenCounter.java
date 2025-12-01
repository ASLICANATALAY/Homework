public class EvenCounter {

        int countEven(int[] arr, int index) {
            // Base Case: Stop Condition
            if (index == arr.length)
                return 0;

            // Recursive Case : Subproblem handling
            if (arr[index] % 2 == 0)
                return 1 + countEven(arr, index + 1);
            else
                return countEven(arr, index + 1);
        }

        public static void main(String[] args) {
            EvenCounter ec = new EvenCounter();
            int[] arr = {3, 6, 4, 7};
            System.out.println("Count of even numbers: " + ec.countEven(arr, 0));
        }
    }

