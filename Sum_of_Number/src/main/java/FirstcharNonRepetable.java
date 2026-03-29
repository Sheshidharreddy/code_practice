import java.util.Scanner;

public class FirstcharNonRepetable {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    for (int i = 0; i < str.length();  i++){
        int count = 0;
      char ch = str.charAt(i);
            for(int  j = 0; j < str.length(); j++){
                if(str.charAt(j) == ch){
                    count ++;
                }
            }
        if(count == 1){
            System.out.println("First non repetable char is: " + ch);
            return;
        }
    }
    System.out.println("First non repetable char is: " +str);

    }
}

