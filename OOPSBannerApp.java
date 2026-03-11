public class OOPSBannerApp {

    // Inner class to map a character to its 7-line pattern
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Helper method to look up the pattern for a specific character
    public static String[] getCharacterPattern(CharacterPatternMap[] maps, char c) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == c) {
                return map.getPattern();
            }
        }
        // Return blank spaces if character is not found
        return new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "};
    }

    public static void main(String[] args) {
        
        // Define 7-line patterns for O, P, and S
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

        // Create instances to map the characters
        CharacterPatternMap mapO = new CharacterPatternMap('O', patternO);
        CharacterPatternMap mapP = new CharacterPatternMap('P', patternP);
        CharacterPatternMap mapS = new CharacterPatternMap('S', patternS);

        // Store mappings in an array
        CharacterPatternMap[] patternMaps = {mapO, mapP, mapS};

        String word = "OOPS";

        // Print the banner line by line (7 lines total)
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                String[] charPattern = getCharacterPattern(patternMaps, currentChar);
                lineBuilder.append(charPattern[i]).append("  "); // space between letters
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
}