/*
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 */

public class OOPSBannerApp {
    public static void main(String[] args) {
        // Letter O pattern (7 lines, 5 characters each)
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        // Letter P pattern
        String[] P = {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };

        // Letter S pattern
        String[] S = {
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            "**** "
        };

        // Array to hold the 7 lines of the complete OOPS banner
        String[] bannerLines = new String[7];

        // Build each line by joining the corresponding rows of O, O, P, S
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        // Print the banner using an enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}