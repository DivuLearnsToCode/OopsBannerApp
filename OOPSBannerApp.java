/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * This use case implements a modular approach to generate a large-scale banner.
 */

public class OOPSBannerApp {

    // Method to generate the large pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
    }

    // Method to generate the large pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ******   ",
            " **    ** ",
            " **    ** ",
            " **    ** ",
            " ******   ",
            " **       ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    // Method to generate the large pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  ***** ",
            "**    **",
            "**      ",
            "**      ",
            "  ***   ",
            "     ** ",
            "      **",
            "     ** ",
            "*****   "
        };
    }

    public static void main(String[] args) {
        // Retrieve modular patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print the assembled banner row by row
        for (int i = 0; i < oPattern.length; i++) {
            // We print O, O, P, and S side-by-side with spacing
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}