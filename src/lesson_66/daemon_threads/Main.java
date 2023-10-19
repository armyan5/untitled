package lesson_66.daemon_threads;

public class Main {

    // Daemon thread
    // void setDaemon(boolean status) - dlya prevrashenya potoka v daemon i naoborot
    // boolean isDaemon() - proveryayet status

    public static void main(String[] args) {


        DaemonThreadExample example1 = new DaemonThreadExample();
        DaemonThreadExample example2 = new DaemonThreadExample();
        example1.setDaemon(true);
        example1.start();
        example2.start();

    }
}
