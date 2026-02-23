import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****   ",
                " *     *  ",
                "*       * ",
                "*       * ",
                "*       * ",
                " *     *  ",
                "  *****   "
        });

        map.put('P', new String[]{
                "  ******  ",
                " *     *  ",
                "*       * ",
                " ******   ",
                "*         ",
                "*         ",
                "*         "
        });

        map.put('S', new String[]{
                "  ******  ",
                " *        ",
                "*         ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        });

        return map;
    }

    static void printBanner(String text, Map<Character, String[]> patterns) {
        text = text.toUpperCase();

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = patterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]);
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = createPatternMap();

        printBanner("OOPS", patterns);
    }
}