package Test2;
public class Test2 {
    public static void main(String[] args) {
        TextAnalyzer[] analyzers = {
                new SpamAnalyzer(new String[]{"spam"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(10)
        };
        
        String[] comments = {
                "This is a spam comment!",
                "This comment is negative :( ",
                "This comment is too long"
        };
        
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