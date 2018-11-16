public class Runner {

    public static void main (String[] args){
        String[] stringArr = randomStringArr(100,2);
        long start = System.nanoTime();
        InPlaceSorts.bubbleSort(stringArr);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double) elapsedTime / 1_000_000_000.0;
        System.out.println(seconds);
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
}
