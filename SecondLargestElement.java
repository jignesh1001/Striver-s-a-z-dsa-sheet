public class SecondLargestElement {
    public static int secondLargestElementOptimalApproach(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largestElement) {
                secondLargest = largestElement;
                largestElement = arr[i];
            }

            else if (arr[i] < largestElement && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static int [] secondSmallestElementOptimalApproach(int [] arr){
        int smallestElement = arr[0];
        int secondSmallestElement = Integer.MAX_VALUE;
        for(int i = 1;i<= arr.length-1;i++){
            if(arr[i] < smallestElement){
                secondSmallestElement = smallestElement;
                smallestElement = arr[i];
            }
            else if(arr[i] != smallestElement && arr[i] < secondSmallestElement){
                secondSmallestElement = arr[i];
            }
        }
        int result[] = {secondSmallestElement,smallestElement};
        return result;
    }

    public static int SecondLargestElementInAnArray(int[] arr) {
        int largestElement = maxElement(arr);
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > secondLargest && arr[i] < largestElement) {

                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int maxElement(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr1[] = { 12, 3, 3, 2, 321, 333, 44 };
        for(int x: arr1){
            System.out.print(x + " ");
            
        }
        System.out.println();
        System.out.println("largest element is " + maxElement(arr1));
        System.out.println("second largest element is " + SecondLargestElementInAnArray(arr1));
        System.out.println("secondLargestElementUsingOptimalApproach is " + secondLargestElementOptimalApproach(arr1));

        System.out.println("secondSmallestElementUsingOptimalApproach is " + secondSmallestElementOptimalApproach(arr1)[0]);
        System.out.println("SmallestElementUsingOptimalApproach is " + secondSmallestElementOptimalApproach(arr1)[1]);
    }
}
