public class InPlaceSorts {

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
        int pos = 0;
        double min = 0;
        for(int i = 0; i < list1.length; i++){
            pos = i;
            min = list1[i];
            for(int j = i; j < list1.length; j++){
                if(list1[j] < min) {
                    pos = j;
                    min = list1[j];
                }
            }
            swap(list1, i, pos);
        }

    }

    public static void bubbleSort(String[] list1){
        int swaps = 1;
        int x = 0;
        while(swaps != 0){
            swaps = 0;
            for(int i = 0; i < list1.length-1; i++){
                if(list1[i].length() > list1[i+1].length()){
                    swap(list1, i, i+1);
                    swaps++;
                }
            }
        }
    }

    public static void swap(int[] arr, int val1, int val2){
        int x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }

    public static void swap(double[] arr, int val1, int val2){
        double x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }
    public static void swap(String[] arr, int val1, int val2){
        String x = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = x;
    }


}
