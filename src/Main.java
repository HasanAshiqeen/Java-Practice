import java.util.Arrays;

public class Main {

    static void ascSort(int[] a){
        int l = a.length;
        int temp;
        for (int i = 0;i<l;i++){
            for (int j = i+1;j<l;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i]+" ");
        }
    }

    static void descSort(int[] a){
        int l = a.length;
        int temp;
        for (int i = 0;i<l;i++){
            for (int j = i+1;j<l;j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i]+" ");
        }
    }

    static int secondHighest(int[] a){
        int l = a.length , temp;

        for (int i = 0;i<l;i++){
            for(int j = i+1;j<l;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[l-2];
    }

    static int secondHighestwithmethod(int[] a){
        Arrays.sort(a);
        return  a[a.length-2];
    }

    public static void main(String[] args) {

        int[] array= new int[]{2,4,6,3,5,8};

        ascSort(array);
        System.out.println();
        descSort(array);
        System.out.println();
        System.out.println(secondHighest(array));
        System.out.println();
        System.out.println(secondHighestwithmethod(array));


    }

}