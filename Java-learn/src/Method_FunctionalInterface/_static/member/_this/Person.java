package Method_FunctionalInterface._static.member._this;

public class Person {

    public void takePhoto(String name){
        System.out.println("给" + name + "拍照");
    }

    public void travel(String name){
//        Camera c = new Camera() {
//            @Override
//            public void takePhoto(String name) {
//                Person.this.takePhoto(name);
//            }
//        };
//        Camera c = (String str) -> {
//            Person.this.takePhoto(str);
//        };
//        Camera c = str -> Person.this.takePhoto(str);
        Camera c = this::takePhoto;
        c.takePhoto(name);
    }

}
