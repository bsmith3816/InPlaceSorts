import java.util.Arrays;

public class Runner {

    public static void main (String[] args){
        String[] stringArr = randomStringArr(100,2);
        double[] doubleArr = randomDoubleArr(100,100);
        int[] intArr = randomIntArr(100,100);

        System.out.println(Arrays.toString(stringArr));
        long start = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(stringArr);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(Arrays.toString(stringArr));
        System.out.println("BubbleSort: " + elapsedTime + " ms.");

        System.out.println(Arrays.toString(intArr));
        start = System.currentTimeMillis();
        InPlaceSorts.insertionSort(intArr);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        System.out.println(Arrays.toString(intArr));
        System.out.println("InsertionSort: " + elapsedTime + " ms.");

        System.out.println(Arrays.toString(doubleArr));
        start = System.currentTimeMillis();
        InPlaceSorts.selectionSort(doubleArr);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        System.out.println(Arrays.toString(doubleArr));
        System.out.println("SelectionSort: " + elapsedTime + " ms.");

    }

    public static String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while(num > 0){
            int i = 0;
            String s = "";
            while (i < length){
                char c = (char)((Math.random()*26) + 97);
                s += c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static double[] randomDoubleArr(int num, int max){
        double[] arr = new double[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = getRandomDouble(0,max);
        }
        return arr;
    }

    public static int[] randomIntArr(int num, int max){
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = getRandomInteger(0,max);
        }
        return arr;
    }

    public static int getRandomInteger(int min, int max){
        return (int)(Math.random()*(max-min) + min);
    }

    public static double getRandomDouble(int min, int max){
        return (Math.random()*(max-min) + min);
    }
}
