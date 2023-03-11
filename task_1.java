/**
 Реализовать алгоритм сортировки слиянием
 */
public class task_1 {

    public static void main(String[] args) {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6};
        System.out.println(test(actual, expected));
        MergeSort(actual, actual.length);
        System.out.println(test(actual, expected));
    }

    public static boolean test(int [] actual, int [] expected){
        try {
            for (int i = 0; i < actual.length; i++) {
                if (actual[i] != expected[i]) return false;
            }
            return true;  
        } catch (Exception e) {
            return false;
        }
    }

    public static void MergeSort(int[] arrayToSort, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] l = new int[mid];
        int[] r = new int[length - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = arrayToSort[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = arrayToSort[i];
        }
        MergeSort(l, mid);
        MergeSort(r, length - mid);
    
        Merge(arrayToSort, l, r, mid, length - mid);
    }

    public static void Merge(int[] arrayToSort, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            arrayToSort[k++] = l[i++];
        }
        else {
            arrayToSort[k++] = r[j++];
        }
    }
    while (i < left) {
        arrayToSort[k++] = l[i++];
    }
    while (j < right) {
        arrayToSort[k++] = r[j++];
    }
}
}