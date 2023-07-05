import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numbers = randomArray(10000, 1000000);
        System.out.println("\n__________________________________");
        PrintArray.printArray(numbers);

        System.out.println("\n__________________________________");
        BubbleSort bubbleSort = new BubbleSort();
        long startTime = System.currentTimeMillis();
        bubbleSort.bubbleSort(numbers);
        System.out.println("\nspeed is: "+(System.currentTimeMillis() - startTime));
        System.out.println("__________________________________");
        QuickSort quickSort = new QuickSort();
        startTime = System.currentTimeMillis();
        quickSort.quickSort(numbers);
        System.out.println("\nspeed is: "+(System.currentTimeMillis() - startTime));
        System.out.println("__________________________________");
        MergeSort mergeSort = new MergeSort();
        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(numbers);
        System.out.println("\nspeed is: "+(System.currentTimeMillis() - startTime));
        System.out.println("__________________________________");


        BinarySearch binarySearch = new BinarySearch();
        int [] numbers2 = {12,22,33,100,110,222,333,444,566,666,777,888};
        int searchNum = 100;
        System.out.println("\nBinarySearch");
        PrintArray.printArray(numbers2);
        System.out.println("\nNumber "+searchNum+" at index #: "+
                binarySearch.binarySearch(numbers2, searchNum)+
                "\n__________________________________");


        Tree tree = new Tree(8,
        new Tree(6,new Tree(3, new Tree(1), new Tree(4)),new Tree(7)),

        new Tree(13, new Tree(10), new Tree(14)));


        System.out.println("\nDetour of tree: "+tree.summ());
        System.out.println("\nSumm of tree by deep detour: "+tree.summDeep(tree));
        System.out.println("\nSumm of tree by wide detour: "+tree.summWide(tree));
    }

    public static int[] randomArray (int length, int bound){
        Random rand = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(bound);
        }
        return numbers;
    }
}