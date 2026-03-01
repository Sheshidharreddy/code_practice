public class main {

    public static void main(String[] args) {
        int arr [] = {10, 20, 4, 45, 90, 99}
        int secondLargetNumber = 0 ;
        int largetNumber = 0 ;

        for (int i = 0; i < arr.length ; i++)

            if(arr[i]> largetNumber){
                secondLargetNumber = largetNumber;
                largetNumber = arr[i];
            }

        System.out.println("Second Larget number " + secondLargetNumber);
    }
}
