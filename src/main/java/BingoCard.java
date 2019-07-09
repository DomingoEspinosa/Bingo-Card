import java.util.*;

public class BingoCard {
    public String[] getCard() {
        LinkedHashSet<String> generated = new LinkedHashSet<>();
        while (generated.size() < 5){
            generated.add(getRandomNumberInRange(1, 15, "B"));
        }
        while (generated.size() < 10){
            generated.add(getRandomNumberInRange(16, 30, "I"));
        }
        while (generated.size() < 14){
            generated.add(getRandomNumberInRange(31, 45, "N"));
        }
        while (generated.size() < 19){
            generated.add(getRandomNumberInRange(46, 60, "G"));
        }
        while (generated.size() < 24){
            generated.add(getRandomNumberInRange(61, 75, "O"));
        }
        return generated.stream().toArray(value -> new String[value]);
    }

    private String getRandomNumberInRange(int min, int max, String letter) {
        Random r = new Random();
        return letter + r.ints(min, (max + 1)).findFirst().getAsInt();
    }
}
