package homework_7;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Test5 {
    public static void main(String[] args) {
        String text = "This is a sample sentence demonstrating custom Spliterator implementation";
        Stream<String> wordStream = StreamSupport.stream(new WordSpliterator(text), false);
        wordStream.forEach(System.out::println);
    }
}

class WordSpliterator implements Spliterator<String> {

    private String text;
    private int currentPos;

    public WordSpliterator(String text) {
        this.text = text;
        this.currentPos = 0;
    }

    @Override
    public boolean tryAdvance(Consumer<? super String> action) {
        while (currentPos < text.length() && Character.isWhitespace(text.charAt(currentPos))) {
            currentPos++;
        }
        
        int start = currentPos;
        while (currentPos < text.length() && !Character.isWhitespace(text.charAt(currentPos))) {
            currentPos++;
        }
        
        if (start < currentPos) {
            action.accept(text.substring(start, currentPos));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<String> trySplit() {
        int currentSize = text.length() - currentPos;
        if (currentSize <= 1) {
            return null;
        }
        int splitPos = currentPos + currentSize / 2;
        WordSpliterator newSpliterator = new WordSpliterator(text.substring(0, splitPos));
        currentPos = splitPos;
        return newSpliterator;
    }

    @Override
    public long estimateSize() {
        return text.length() - currentPos;
    }

    @Override
    public int characteristics() {
        return SIZED | SUBSIZED | CONCURRENT | IMMUTABLE | ORDERED;
    }
}