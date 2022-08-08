public class reveseArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3};

        int start = 0, end = arr.length - 1;

        while (true) {
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (start > end) {
                break;
            }
            else{
                break;
            }

        }
        System.out.println(arr[0]+" " + arr[1] +" "+ arr[2]+" " );
    }
}
