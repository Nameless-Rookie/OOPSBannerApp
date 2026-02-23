public class BannerApp {

    public static void main(String[] args) {

        // Declare & initialize banner lines in one statement
        String[] banner = {

            String.join("", "  *****   ", "  *****   ", "  ******  ", "  ******  "),
            String.join("", " *     *  ", " *     *  ", " *     *  ", " *        "),
            String.join("", "*       * ", "*       * ", "*       * ", "*        "),
            String.join("", "*       * ", "*       * ", " ******   ", "  *****   "),
            String.join("", "*       * ", "*       * ", "*         ", "       *  "),
            String.join("", " *     *  ", " *     *  ", "*         ", " *     *  "),
            String.join("", "  *****   ", "  *****   ", "*         ", "  *****   ")

        };

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}