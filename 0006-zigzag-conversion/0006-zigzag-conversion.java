class Solution {
    public String convert(String s, int numRows) {
        char[][] convertedCharacters = new char[numRows][s.length()];

        int horizontalIndex = 0;
        int verticalIndex = 0;
        boolean flip = false;

        for (Character character : s.toCharArray()) {
            convertedCharacters[verticalIndex][horizontalIndex] = character;

            if(!flip) {
                verticalIndex++;

                // at end
                if(verticalIndex == numRows) {
                    flip = true;
                    verticalIndex -= 2; // 2 because we increment above
                    if(verticalIndex < 0) verticalIndex = 0;
                    horizontalIndex++;
                }
            } else {
                verticalIndex--;
                horizontalIndex++;

                // at beginning
                if(verticalIndex <= 0) {
                    // this was added after test cases failed
                    if(convertedCharacters.length == 2) {
                        verticalIndex = 1;
                    } else {
                        verticalIndex = 0;
                    }
                    flip = false;
                }
            }

        }
        
        StringBuilder answer = new StringBuilder();
        for (char[] convertedCharacter : convertedCharacters) {
            for (char c : convertedCharacter) {
                if (c != Character.MIN_VALUE) { // MIN_VALUE is == '', empty character literal
                    answer.append(c);
                }
            }
        }
        return answer.toString();
    }
}