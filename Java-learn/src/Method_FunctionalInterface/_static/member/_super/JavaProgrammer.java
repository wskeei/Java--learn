package Method_FunctionalInterface._static.member._super;

public class JavaProgrammer extends SoftEngineer{


    public void communicateWithCustomer(){
//        Customer c = new Customer() {
//            @Override
//            public void communicateBusyness() {
//                JavaProgrammer.super.analysisBusyness();
//            }
//        };
//        Customer c = () -> {
//            JavaProgrammer.super.analysisBusyness();
//        };
//        Customer c = () -> JavaProgrammer.super.analysisBusyness();
        Customer c = super::analysisBusyness;
        c.communicateBusyness();
    }

}
