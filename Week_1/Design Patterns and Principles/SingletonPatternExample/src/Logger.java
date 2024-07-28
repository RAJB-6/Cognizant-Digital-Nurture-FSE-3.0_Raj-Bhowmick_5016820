public class Logger {

    private static Logger instance = null;
    public int val=10;
    private Logger(){}

    public static Logger getinstance(){
        if (instance==null){
            instance = new Logger();
        }
        return instance;
    }

}