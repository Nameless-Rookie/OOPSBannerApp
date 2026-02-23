public class BannerApp {

    public static void main(String[] args) {

        String[] banner = {
                getOPattern(0) + getOPattern(0) + getPPattern(0) + getSPattern(0),
                getOPattern(1) + getOPattern(1) + getPPattern(1) + getSPattern(1),
                getOPattern(2) + getOPattern(2) + getPPattern(2) + getSPattern(2),
                getOPattern(3) + getOPattern(3) + getPPattern(3) + getSPattern(3),
                getOPattern(4) + getOPattern(4) + getPPattern(4) + getSPattern(4),
                getOPattern(5) + getOPattern(5) + getPPattern(5) + getSPattern(5),
                getOPattern(6) + getOPattern(6) + getPPattern(6) + getSPattern(6)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static String getOPattern(int row) {
        String[] O = {
                "  *****   ",
                " *     *  ",
                "*       * ",
                "*       * ",
                "*       * ",
                " *     *  ",
                "  *****   "
        };
        return O[row];
    }

    static String getPPattern(int row) {
        String[] P = {
                "  ******  ",
                " *     *  ",
                "*       * ",
                " ******   ",
                "*         ",
                "*         ",
                "*         "
        };
        return P[row];
    }

    static String getSPattern(int row) {
        String[] S = {
                "  ******  ",
                " *        ",
                "*         ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        };
        return S[row];
    }
}