import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Utility method to build and return the HashMap of character patterns
    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        // Define 9-line patterns for O, P, and S
        String[] patternO = {
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

        String[] patternP = {
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

        String[] patternS = {
            "  *****    ",
            "**     **  ",
            "**         ",
            "**         ",
            "  ***      ",
            "     **    ",
            "      **   ",
            "     **    ",
            "*****      "
        };

        // Populate the map with characters as keys and string arrays as values
        patternMap.put('O', patternO);
        patternMap.put('P', patternP);
        patternMap.put('S', patternS);

        return patternMap;
    }

    // Utility method to display the banner message
    public static void displayBanner(String word, Map<Character, String[]> patternMap) {
        // Fallback pattern in case a character isn't in our map (Updated to 9 lines)
        String[] blankPattern = {
            "         ", "         ", "         ", 
            "         ", "         ", "         ", 
            "         ", "         ", "         "
        };

        // Print the banner line by line (Updated to 9 lines total)
        for (int i = 0; i < 9; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                
                // Fetch pattern from map directly, default to blank if missing
                String[] charPattern = patternMap.getOrDefault(currentChar, blankPattern);
                
                lineBuilder.append(charPattern[i]).append("  "); // space between letters
            }
            
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        
        // Setup the character mappings
        Map<Character, String[]> patterns = buildPatternMap();

        String word = "OOPS";

        // Display the final banner
        displayBanner(word, patterns);
    }
}