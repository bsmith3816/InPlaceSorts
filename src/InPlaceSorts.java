public class InPlaceSorts {

    public InPlaceSorts(int[] list){
        list1 = list;
    }
    public InPlaceSorts(double[] list){
        list1 = list;
    }
    public InPlaceSorts(String[] list){
        list1 = list;
    }

    public static void insertionSort(int[] list1){
        int pos = -1;
        int j = 0;
        int[] arr = list1.clone();
        for(int i = 1; i < list1.length; i++){ // For every value in the array
            j = i - 1;
            for(j = i - 1; j >= 0; j--){ //For every value below the given one
                if(list1[i] < list1[j]){ // If it is lower than the given one
                    swap(list1, i, j);; //Copy that position
                }
            }
        }
    }
    public static void selectionSort(double[] list1){

    }
    public static void bubbleSort(String[] list1){

    }
    public static void swap(int[] arr, int val1, int val2){
        int x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }
}
