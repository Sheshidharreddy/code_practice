
//Need to remove the space if they have extra space between the words, then sentence need to be revered.
public class RemoveSpaceReversetheSentence {

    public static void main(String[] args){

        String s = " hellow words and how are  you";

        RemoveSpaceReversetheSentence remove = new RemoveSpaceReversetheSentence();

        System.out.println(remove.reverseWord(s));

    }

    public String reverseWord(String s){
        char[] ch = s.toCharArray();
        //step 1: reverse the entire string
       reverseSetence(ch,0,ch.length -1);
       // Step 2 : reverse each words
        reverseEachWors(ch);
        // Step 3 : clean space
        return cleanSpace(ch);
    }

    private String cleanSpace(char[] str){
        int left = 0;
        int right = 0;

        while (right < str.length){
            while (right < str.length && str[right] == ' ') right++;
            while (left< str.length && str[right] != ' '){
                str[left] = str[right];
                left++;
                right++;
            }
            while (right < str.length && str[right] == ' ') right++;
            if (right < str.length){
                str[left] = ' ';
                left ++;
            }
        }

        return new String(str).substring(0, left);

    }

    private void reverseEachWors(char[] str){
        int left = 0 ;
        int right = 0;

        while (left < str.length){
            while (left < str.length && str[left] == ' ') left++;
            right = left;
            while (right < str.length && str[right] != ' ') right++;
            reverseSetence(str, left, right - 1);
            left = right;
        }

    }

    private void reverseSetence(char[] str, int left, int right){

        while(left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left ++;
            right --;
        }

    }

}
