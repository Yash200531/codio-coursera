public class ProblemSolvingOP {

    public static int search(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left ) / 2;
            int result = target.compareTo(array[mid]);
            // int result = target.compareToIgnoreCase(array[mid].toUpperCase());
            /* Java provides us with the compareToIgnoreCase() method that compares the values of two strings while ignoring the case. As long as the spelling matches, the algorithm should return the index of the search target.*/

            if (result == 0) {
                return mid;
            }
            if (result > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"ape", "bat", "cat", "dog", "eagle"};
        String target = "dog";
        
        int result = search(array, target);

        if (result == -1) {
            System.out.println("Element not found in the array");
        }
        else {
            System.out.println("Element found at index: " + result);
        }
    }
}