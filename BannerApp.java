public class BannerApp {

    public static void main(String[] args) {

        // Create array to store banner lines
        String[] banner = new String[7];

        // Populate banner lines using String.join()

        banner[0] = String.join("",
                "  *****   ",
                "  *****   ",
                "  ******  ",
                "  ******  ");

        banner[1] = String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *        ");

        banner[2] = String.join("",
                "*       * ",
                "*       * ",
                "*       * ",
                "*        ");

        banner[3] = String.join("",
                "*       * ",
                "*       * ",
                " ******   ",
                "  *****   ");

        banner[4] = String.join("",
                "*       * ",
                "*       * ",
                "*         ",
                "       *  ");

        banner[5] = String.join("",
                " *     *  ",
                " *     *  ",
                "*         ",
                " *     *  ");

        banner[6] = String.join("",
                "  *****   ",
                "  *****   ",
                "*         ",
                "  *****   ");

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}