package src.DesignPattern.Singleton;

public class Settings {
    private static volatile Settings INSTANCE;

    public Settings() {
    }

    public static Settings getInstance(){
        if (INSTANCE==null){
            synchronized (Settings.getInstance()){
                if (INSTANCE == null){
                    INSTANCE = new Settings();
                }
            }
        }
        return INSTANCE;
    }
}
