package nested_class.lambda;

import java.util.Random;

public class RandomNumberTest {

    public static void main(String[] args) {
//        RandomNumber r = new RandomNumber() {
//            @Override
//            public int getRandomNumber(int start, int end) {
////                int diff = end - start;
//                return (int)(Math.random() * (end - start)) + start;
//            }
//        };

//        RandomNumber r = (int start, int end) -> {
//            return (int)(Math.random() * (end - start)) + start;
//        };

//        RandomNumber r = (start, end) -> {
//            return (int)(Math.random() * (end - start)) + start;
//        };
        RandomNumber r = (start, end) ->  (int)(Math.random() * (end - start)) + start;
        System.out.println(r.getRandomNumber(10, 20));

//        Random random = new Random();
//       int result = random.nextInt(10) + 10;

        RandomNumber r1 = (start, end) ->  new Random().nextInt(end - start) + start;
        System.out.println(r1.getRandomNumber(10, 20));
    }
}
