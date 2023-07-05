public class BinarySearch {

    public int binarySearch (int[] numbers, int num){
        int first = 0;
        int last = numbers.length - 1;

        while (first<=last) {
            int middlePoint = (first + last) / 2;
            int middleNumber = numbers[middlePoint];
            if (num == middleNumber) {
                return middlePoint;
            }
            else if (num < middleNumber) {
                last = middlePoint;
            }
            else if (num > middleNumber) {
                first = middlePoint;
            }
        }
        return -1;
    }

}
