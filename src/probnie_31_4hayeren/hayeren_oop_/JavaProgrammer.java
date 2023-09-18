package probnie_31_4hayeren.hayeren_oop_;

public class JavaProgrammer  extends Human implements Programmer, ChessPlayer{
    @Override
    public void writeCode(String requirement) {
        System.out.println("Java writing code" + requirement);
    }

    @Override
    public String languages() {
        return "Java,C++";
    }

    @Override
    public void readCode() {
        System.out.println("reading Java code");
    }

    @Override
    public void speakEnglish() {

    }

    @Override
    public void playChess() {

    }
}
