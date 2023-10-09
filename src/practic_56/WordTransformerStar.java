package practic_56;

public class WordTransformerStar extends WordsTransformer{


    public boolean Tran(String input) {
        return input.length() == 5;
    }

    @Override
    public boolean check(String input) {
        return false;
    }

    public String transform(String string) {
        return "*****";
    }
}
