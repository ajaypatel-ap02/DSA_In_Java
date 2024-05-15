
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean[] check = new boolean[sentence.length()];
        int i = 0;
        char[] alphabet = sentence.toCharArray();
        do {

            if (alphabet[i] >= 'a' && alphabet[i] <= 'z') {

                int index = alphabet[i] - 'a';
                check[index] = !(check[index]);
            }
            i++;
        } while (i < sentence.length());
        boolean isPangram = true;
        for (boolean c : check) {
            if (!c) {
                isPangram = false;
                break;
            }
        }
        System.out.println(isPangram);
    }
    }
