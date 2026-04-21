public class TralingOfnNumbers {

    public  static  void main(String[] args){
        int n = 125;
        int currentPowerOfFive = 5;
        int count = 0;
        while(n >= currentPowerOfFive){
            count += n/currentPowerOfFive;
            currentPowerOfFive *= 5;
        }
        System.out.println(count);
    }
}
