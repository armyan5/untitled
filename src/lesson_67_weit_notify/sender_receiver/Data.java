package lesson_67_weit_notify.sender_receiver;

public class Data {

    private String packet;

    private boolean transfer = true;// true - esli poluchatel doljen jdat

    public synchronized String receive() {

        try {
            wait();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }

        String returnPacket = packet;
        transfer = true;

        notifyAll();

        return returnPacket;

    }

    public synchronized void send(String packet) {

    }

}
