package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */
    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] value = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){

                    int rain = array[j];
                    array[j] = array[i];
                    array[i] = rain;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] value = array;
        //implement here
        int rain;
        for(int i=0;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    rain=array[j];
                    array[j]=array[j-1];
                    array[j-1]=rain;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    public int[] bubbleSort(int [] array){
        int [] value = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int rain=array[j];
                    array[j]=array[j+1];
                    array[j+1]=rain;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    private int [] rainMergArr;
    public int [] mergeSort(int [] array){
        int [] value = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        this.arr = value;
        this.length = value.length;
        this.rainMergArr = new int[length];
        doMergeSort(0, length - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            rainMergArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (rainMergArr[i] <= rainMergArr[j]) {
                arr[k] = rainMergArr[i];
                i++;
            } else {
                arr[k] = rainMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = rainMergArr[i];
            k++;
            i++;
        }

    }

    private int arr[];
    private  int length;

    public int [] quickSort(int [] array){
        int [] value = array;
        //implement here

        final long startTime = System.currentTimeMillis();//
        this.arr = value;
        length = value.length;
        quickSort(0,length-1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = arr[lowerIndex+(higherIndex-lowerIndex)/2];

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int rain = arr[i];
        arr[i] = arr[j];
        arr[j] = rain;
    }


    public int [] heapSort(int [] array){
        int [] value = array;
        //implement here
        final long startTime = System.currentTimeMillis();

        int n = value.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heavy(array, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int rain = array[0];
            array[0] = array[i];
            array[i] = rain;

            heavy(array, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    void heavy(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heavy(arr, n, largest);
        }
    }

    public int [] bucketSort(int [] array){
        int [] value = array;
        //implement here
        final long startTime = System.currentTimeMillis();


        int maxVal = getMax(array);
        int[] bucket = new int[maxVal+1];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = 0;
        }
        for(int i=0; i<array.length; i++){
            bucket[array[i]]++;
        }
        int outPos = 0;
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i]; j++){
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return value;
    }

    public int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        //implement here
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }



    public int [] shellSort(int [] array){
        int [] value = array;
        //implement here


        final long startTime = System.currentTimeMillis();
        int inner, outer;
        int rain;
        int h = 1;
        while(h <= array.length/3)
            h = h*3 + 1;
        while(h>0)
        {
            for(outer=h; outer<array.length; outer++)
            {
                rain = value[outer];
                inner = outer;
                while(inner > h-1 && value[inner-h] >= rain)
                {
                    value[inner] = value[inner-h];
                    inner -= h;
                }
                value[inner] = rain;
            }
            h = (h-1) / 3;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return value;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}