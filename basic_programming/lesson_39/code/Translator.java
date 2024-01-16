import java.util.HashMap;
import java.util.Map;

public class Translator {
    private HashMap<String, String> words = new HashMap<>();
    public void addWord(String word, String translation){
        this.words.put(word, translation);
    }
    public String getTranslate(String word){
        return this.words.get(word);
    }
    public void getWords(){
        for (Map.Entry<String, String> pair: this.words.entrySet()) {
            System.out.printf("%s: %s%n", pair.getKey(), pair.getValue());
        }
    }
}
