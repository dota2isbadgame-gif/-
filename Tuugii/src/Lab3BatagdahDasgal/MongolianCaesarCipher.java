package Lab3BatagdahDasgal;

public class MongolianCaesarCipher {

    private static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОӨПРСТУҮФХЦЧШЩЪЫЬЭЮЯ";
    private char[] encoder = new char[35];
    private char[] decoder = new char[35];

    public MongolianCaesarCipher(int rotation) {
        for (int k = 0; k < 35; k++) {

            encoder[k] = ALPHABET.charAt((k + rotation) % 35);
         
            decoder[k] = ALPHABET.charAt((k - rotation + 35) % 35);
        }
    }

    public String encrypt(String message) {
        return transform(message, encoder);
    }

    public String decrypt(String secret) {
        return transform(secret, decoder);
    }

    
    private String transform(String original, char[] code) {
        char[] msg = original.toCharArray();
        for (int k = 0; k < msg.length; k++) {
          
            int j = ALPHABET.indexOf(Character.toUpperCase(msg[k]));
            if (j != -1) { 
                msg[k] = code[j];
            }
        }
        return new String(msg);
    }

    public static void main(String[] args) {
        MongolianCaesarCipher cipher = new MongolianCaesarCipher(3);
        String message = "САЙН БАЙНА УУ";
        String coded = cipher.encrypt(message);
        System.out.println("Нууцалсан нь: " + coded);
        System.out.println("Тайлсан нь: " + cipher.decrypt(coded));
    }
}
