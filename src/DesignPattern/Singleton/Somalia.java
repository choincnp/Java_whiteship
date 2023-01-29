package src.DesignPattern.Singleton;

public class Somalia {
    public static void main(String[] args) {
        Sjkim SjkimInstance1 = Sjkim.getInstance();
        Sjkim SjkimInstance2 = Sjkim.getInstance();
        System.out.println(SjkimInstance1 == SjkimInstance2);
    }
}
