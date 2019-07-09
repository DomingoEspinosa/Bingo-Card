import java.util.*;

public class BingoCard {
    public  String[] getCard() {
        LinkedHashSet<String> generated = new LinkedHashSet<>();
        generatedElement(generated, 5, 1, 15, "B");
        generatedElement(generated, 10, 16, 30, "I");
        generatedElement(generated, 14, 31, 45, "N");
        generatedElement(generated, 19, 46, 60, "G");
        generatedElement(generated, 24, 61, 75, "O");
        return generated.stream().toArray(value -> new String[value]);
    }

    private void generatedElement(LinkedHashSet<String> generated, int size, int min, int max, String letter) {
        while (generated.size() < size) {
            generated.add(getRandomNumberInRange(min, max, letter));
        }
    }

    private String getRandomNumberInRange(int min, int max, String letter) {
        Random r = new Random();
        return letter + r.ints(min, (max + 1)).findFirst().getAsInt();
    }
}
