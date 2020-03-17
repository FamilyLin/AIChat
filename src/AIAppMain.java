import java.util.Scanner;

public class AIAppMain {
    public static void main(String[] args) {
        System.out.println("你好，有什么想说的？");
        AI ai = new AI();
        Scanner in = new Scanner(System.in);
        while(true){
            String input = in.next();
            if ("exit".equals(input)){
                System.out.println("再见");
                break;
            }
            String  answer = ai.answer(input);
            System.out.println(answer);
        }
    }
}
