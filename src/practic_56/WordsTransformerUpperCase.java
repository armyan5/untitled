package practic_56;

public class WordsTransformerUpperCase extends WordsTransformer {


    public boolean check(String input) {
        return input.length() == 3;
    }

    public String transform(String string) {
        return string.toUpperCase();
    }
}
