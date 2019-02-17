package pl.sda.creational.singleton;


public class SingletonLogger {
    private static SingletonLogger instance;

    private SingletonLogger(){

    }

    public static SingletonLogger getInstance(){
        if(instance == null){
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void log (String Logtext){
        System.out.println(Logtext);
    }


}
