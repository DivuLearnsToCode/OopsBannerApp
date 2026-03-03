public class OOPSBannerApp {
    public static void main(String[] args) {
        // Each element uses String.join to combine line parts with spaces
        String[] lines = {
            String.join(" ", "   ***", "       ***", "    ******", "       ***** "),
            String.join(" ", " **   **", "   **   **", "  **    **", "   **"),
            String.join(" ", "**     **", " **     **", " **     **", "  **"),
            String.join(" ", "**     **", " **     **", " **    **", "   **     "),
            String.join(" ", "**     **", " **     **", " ******", "       *** "),
            String.join(" ", "**     **", " **     **", " **", "              ** "),
            String.join(" ", "**     **", " **     **", " **", "               **"),
            String.join(" ", " **   **", "   **   **", "  **.", "             **"),
            String.join(" ", "   ***", "       ***", "    **", "         *****  ")
        };

        // Print the banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
