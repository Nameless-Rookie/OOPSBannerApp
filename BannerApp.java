public class BannerApp {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getPatternLine(int row) {
            return pattern[row];
        }

        public char getCharacter() {
            return character;
        }
    }

    static String buildLine(CharacterPattern[] patterns, int row) {
        StringBuilder sb = new StringBuilder();

        for (CharacterPattern cp : patterns) {
            sb.append(cp.getPatternLine(row));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                "  *****   ",
                " *     *  ",
                "*       * ",
                "*       * ",
                "*       * ",
                " *     *  ",
                "  *****   "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "  ******  ",
                " *     *  ",
                "*       * ",
                " ******   ",
                "*         ",
                "*         ",
                "*         "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "  ******  ",
                " *        ",
                "*         ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            System.out.println(buildLine(word, i));
        }
    }
}