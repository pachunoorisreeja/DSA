package DSA.Patterns.Arrays.Level1.Practice;
//⭐ Pattern 4: Min / Max – 10 Questions
public class Pattern4 {
    public static void main(String[] args) {
        // 31. Find second smallest element.
        secondSmallestElement(new int[]{1,34,453,2,45,5,54,453});
        // 32. Find second largest element.
        secondLargestElement(new int[]{1,34,453,2,45,5,54,453});
        // 33. Find the smallest element at even index.
        SmallestAtEvenIndex(new int[]{1,34,453,2,45,5,54,453});
        // 34. Find the largest element at odd index.
        largestAtOddIndex(new int[]{1,34,453,2,45,5,54,453});
        // 35. Find min and max in a single loop.
        maxAndMinInSingleLoop(new int[]{1,34,453,2,45,5,54,453});
        // 36. Count how many times the max element occurs.
        howManyTimesMaxOccurs(new int[]{1,34,453,2,45,5,54,453});
        // 37. Count how many times the min element occurs.
        howManyTimesMinOccurs(new int[]{1,34,453,2,45,5,54,453});
        // 38. Find the difference between max and min.
        diffBetweenMaxAndMin(new int[]{1,34,453,2,45,5,54,453});
        // 39. Find the smallest positive element.
        smallestPostiveNumber(new int[]{23,-23,-2,43,9,232,2,34,1,3});
        // 40. Find the largest negative element.
        largestNegavtiveNumber(new int[]{-43554,334,435,-34,-1,45,-453,-345});
    }
    public static void secondSmallestElement(int arr[]){
        int small = Integer.MAX_VALUE;;
        int secondSmall = Integer.MAX_VALUE;;
        for (int i: arr){
            if(i<small){
                secondSmall = small;
                small =i;
            } else if(i> small && i<secondSmall){
                secondSmall = i;
            }
        }
        System.out.println("Second Smallest "+secondSmall);

    }
    public static void secondLargestElement(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;
        for (int i: arr){
            if(i>largest){
                secondLargest = largest;
                largest =i;
            }
            else if (i!=largest && i>secondLargest){
                secondLargest =i;
            }
        }
        System.out.println("Second largest "+secondLargest);


    }
    public static void SmallestAtEvenIndex(int arr[]){
        int smallest = arr[0];
        for (int i=0;i<arr.length;i+=2){
            if (arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("SmallestAtEvenIndex "+smallest);

    }
    public static void largestAtOddIndex(int arr[]){
        int largest = arr[0];
        for (int i=1;i<arr.length;i+=2){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largestAtOddIndex "+largest);

    }
    public static void maxAndMinInSingleLoop(int arr[]){
    int min =arr[0], max =min;
    for (int i:arr){
        if (i<min){
            min =i;
        }else if (i>max){
            max =i;
        }
    }
        System.out.println("Min and Max are: "+min+" "+max);


    }
    public static void howManyTimesMaxOccurs(int arr[]){
        int max = arr[0], count =0;
        for (int i:arr){
            if(i>max)
                max =i;
        }
        for (int i:arr){
            if(i==max) {
                count++;
            }
        }
        System.out.println("Max "+max+"  occurs "+count);
        }
    public static void howManyTimesMinOccurs(int arr[]){
        int min = arr[0], count =0;
        for (int i:arr){
            if(i<min)
                min =i;
        }
        for (int i:arr){
            if(i==min) {
                count++;
            }
        }
        System.out.println("Min "+min+"  occurs "+count);

    }
    public static void diffBetweenMaxAndMin(int arr[]){
        int max = arr[0], count =0, min=arr[0];
        for (int i:arr){
            if(i>max) {
                max = i;
            }else if (i<min){
                min =i;
            }
        }

        System.out.println("Diff between max and min is: "+(max-min));

    }
    public static void smallestPostiveNumber(int arr[]){
        int min =1;
        for (int i:arr){
            if(i>0 && i<min){
                min =i;
            }
        }
        System.out.println("Smallest postive Number is "+min);
    }
    public static void largestNegavtiveNumber(int arr[]){
        int max = -12345;
        for (int i: arr){
            if(i<0 && i> max){
                max = i;
            }
        }
        System.out.println("Largest negavtive number "+max);
    }
}
