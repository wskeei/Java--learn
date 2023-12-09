package Method_FunctionalInterface.lambda.lazy;

public class PrintUtil {


    public static void print(boolean valid, String msg){
        if(valid){
            System.out.println(msg);
        }
    }

    private static String build(String...infos){
        StringBuilder builder = new StringBuilder();
        for(String info: infos){
            builder.append(info);
        }
        return builder.toString();
    }

    public static void print(boolean valid, String...infos){
        if(valid){
//            MsgBuilder builder = new MsgBuilder() {
//                @Override
//                public String buildMsg(String... infos) {
//                    return PrintUtil.build(infos);
//                }
//            };
//            MsgBuilder builder = (String... arr) -> {
//                return PrintUtil.build(arr);
//            };
//            MsgBuilder builder = arr -> PrintUtil.build(arr);
            MsgBuilder builder = PrintUtil::build;
            System.out.println(builder.buildMsg(infos));
        }
    }
}
