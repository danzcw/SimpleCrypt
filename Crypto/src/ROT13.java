import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {

    protected String alphaUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    protected String alphaLow = "abcdefghijklmnopqrstuvwxyz";


    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder simple = new StringBuilder();
        for (int x = 0; x < text.length(); x++) {
            char letter = text.charAt(x);
            if (letter >= 'A' && letter <= 'M')
                simple.append(letter += 13);
            else if (letter >= 'N' && letter <= 'Z')
                simple.append(letter -= 13);
            else if (letter >= 'a' && letter <= 'm')
                simple.append(letter += 13);
            else if (letter >= 'n' && letter <= 'z')
                simple.append(letter -= 13);
            else
                simple.append(letter);
        }

        return simple.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }


    public static String rotate(String s, Character c) {
        StringBuilder rotated = new StringBuilder();
        int startIndex = s.indexOf(c);
        rotated.append(s.substring(startIndex, s.length()));
        rotated.append(s.substring(0, startIndex));
        return rotated.toString();
    }

    public String createCipher(String upper, Character chooseUp, String lower, Character chooseLow, String input) {
        String rotateUp = rotate(alphaUp, D);
        String rotateLow = rotate(alphaLow, d);

        StringBuilder ciphered = new StringBuilder();
        for (int x = 0; x < input.length(); i++) {
            char letter = input.charAt(0);
            if (letter >= 'A' && letter <= 'Z')
                ciphered.append(rotateUp.indexOf(letter));
            else if (letter >= 'a' && letter <= 'z')
                ciphered.append(rotateLow.indexOf(letter));
            else return letter;


        }

        return ciphered.toString();

    }
}