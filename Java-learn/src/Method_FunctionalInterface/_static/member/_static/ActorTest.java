package Method_FunctionalInterface._static.member._static;

public class ActorTest {

    public static void main(String[] args) {
//        Actor a = new Actor() {
//            @Override
//            public void perform(Person p) {
//                p.dance();
//            }
//        };

//        Actor a = (Person p) -> {
//            p.dance();
//        };
//        Actor a = p -> p.dance();
        Actor a = Person::dance;
        a.perform(new Person());

        Actor actor = Person::sing;
        actor.perform(new Person());
    }
}
