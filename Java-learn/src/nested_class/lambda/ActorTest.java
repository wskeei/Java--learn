package nested_class.lambda;

public class ActorTest {

    public static void main(String[] args) {
//        Actor actor = new Actor() {
//            @Override
//            public void performance() {
//                System.out.println("演员表演节目");
//            }
//        };
//        Actor a1 = () -> {
//            System.out.println("演员表演节目");
//        };
        //Lambda表达式
//        Actor actor = () -> {
//            System.out.println("演员表演节目");
//        };
        Actor actor = () -> System.out.println("演员表演节目");
        actor.performance();
    }
}
