package DSA.Patterns.Arrays.Level1;

public class Pattern3_Min_MaxValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        maxElement(arr);
        minElement(arr);
        findSecondMaxElement(arr);
        diffMaxMinValue(arr);
        arraySortInAscendingOrder(arr);
    }
    public static void maxElement(int[] arr){
        int max =arr[0];
        for(int i: arr){
            if(i>max){
                max =i;
            }
        }
        System.out.println("Max Element is: "+max);
    }
    public static void minElement(int[] arr){
        int min =arr[0];
        for(int i: arr){
            if(i<min){
                min =i;
            }
        }
        System.out.println("Min Element is: "+min);
    }
    public static void findSecondMaxElement(int[] arr){
        int firstMax =arr[0];
        int secondMax = arr[0];
        for(int i: arr){
            if(i>firstMax){
                secondMax =firstMax;
                firstMax=i;
            } else if(i>secondMax && i<firstMax){
                secondMax=i;
            }
        }
        System.out.println("SecondMax is: "+secondMax);
    }
    public static void diffMaxMinValue(int[] arr){
        int min =arr[0];
        int max = arr[0];
        for (int i: arr){
            if(i>max){
                max = i;
            } else if(i<min){
                min =i;
            }
        }
        System.out.println("Min and Max Diff is :"+(max-min));}
        public static void arraySortInAscendingOrder(int[] arr){
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted =false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Arrays is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
        }
    }
