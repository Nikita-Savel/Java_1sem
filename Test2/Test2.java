package Test2;
public class Test2 {
    public static void main(String[] args) {
        TextAnalyzer[] analyzers = {
                new SpamAnalyzer(new String[]{"купи"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(20)
        };
        
        String[] comments = {"Быстро купи эту машину", "Много негатива :( ", "Это очень длинный комментарий"};
        
        for (String comment : comments) {
            Label label = checkLabels(analyzers, comment);
            System.out.println(comment + " - " + label);
        }
    }
    
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }
}