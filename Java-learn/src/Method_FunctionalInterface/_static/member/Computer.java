package Method_FunctionalInterface._static.member;

public class Computer {

    private Printer printer;

    public Computer(Printer printer) {
        this.printer = printer;
    }

    public void print(String msg){
//        Printable printable = new Printable() {
//            @Override
//            public void print(String msg) {
//                printer.print(msg);
//            }
//        };
//        Printable printable = (String message) -> {
//                printer.print(message);
//            };
//        Printable printable = message -> printer.print(message);
        Printable printable = printer::print;
        printable.print(msg);
    }
}
