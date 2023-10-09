package practic_56;

// 2rd zadanya

public class Transformer1 {

    public static String transformstring1 (String input,WordsTransformer t){

        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (t.check(words[i])){
                words[i] = t.transform(words[i]);
            }

        }
        return String.join(" ",words);

    }

    public static void main(String[] args) {
        String input = "aaa BBB def vbghr bbb";
        System.out.println(transformstring1(input,new WordsTransformerUpperCase()));

    }

}
