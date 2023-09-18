package probnie_31_4hayeren.hayeren_oop_;

public class CSharpProgrammer extends Human implements Programmer,ChessPlayer{
    @Override
    public void writeCode(String requirement) {
        System.out.println("CSharp writing code" + requirement);
    }

    @Override
    public String languages() {
        return "C++,CSharp";
    }

    @Override
    public void readCode() {
        System.out.println("reading CSharp code");

    }

    @Override
    public void speakEnglish() {

    }

    @Override
    public void playChess() {

    }
}
