package main.java.com.makkkkkkkks.executer;

public class StartProgram {
    public static void start() {
        Executer executer = new Executer("one", "two", "three");
        executer.getInfo();

        Executer executer1 = new Executer(1L, 2L, 3L, 45L);
        executer1.getInfo();
    }
}
