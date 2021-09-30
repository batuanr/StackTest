import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class StackTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Stack<Integer> newNumber = new Stack<>();
       for (int e: arr){
           newNumber.push(e);
       }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newNumber.pop();
        }
        System.out.println(Arrays.toString(arr));

        Stack<String> wstack = new Stack<>();
        String test = "xin chao java";
        String[] word = test.split(" ");

        System.out.println(Arrays.toString(word));
        for (String e: word){
            wstack.push(e);
        }
        System.out.println(wstack);
        System.out.println(wstack.size());
        int bound = wstack.size();
        for (int i = 0; i < bound; i++) {
            word[i] = wstack.pop();
        }
        System.out.println(word[2]);
        test = String.join(" ",word);
        System.out.println(test);

    }


}
