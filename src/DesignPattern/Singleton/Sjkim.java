package src.DesignPattern.Singleton;

public class Sjkim {
    private Sjkim(){}

    private static class SjkimHolder{
        private static final Sjkim INSTANCE = new Sjkim();
    }

    public static Sjkim getInstance(){
        return SjkimHolder.INSTANCE;
    }

}
