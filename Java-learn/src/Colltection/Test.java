package Colltection;

public class Test{
    public static void main(String[] args) {
        String a1 = "a";
        System.out.println((char) sum(54,44));

    }

    public static <T extends Number> int sum(T o,int a){
        return (Integer) o+a;
    }

}


//    static class Sum <T>{
//        public T sum(T o){
//            return o;
//        }
//    }
//}
