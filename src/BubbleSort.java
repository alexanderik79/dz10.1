public class BubbleSort {
    public void bubbleSort (int[] numbers){

        boolean isSwp = true;
        while (isSwp) {
            isSwp = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    isSwp = true;
                }
            }
        }
        System.out.println("\nBubble sort");
        PrintArray.printArray(numbers);
    }
    public void swap (int[] numbers, int index1, int index2){
        int tmp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = tmp;
    }
}
