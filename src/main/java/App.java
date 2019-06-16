import java.io.Console;
public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        boolean programRunning = true;
        System.out.println("Welcome To Caesar-Cipher :-)");
        while (programRunning) {
            System.out.println("Would you like to : 1.encrypt, 2.decrypt 3. Exit");
            System.out.println("Choose either '1', '2' or '3' ");
            String inputChoice = myConsole.readLine();
            if (inputChoice.equals("1")) {
                System.out.println("Enter the word you would like to encrypt: ");
                String inputtedName = myConsole.readLine();
                System.out.println("Enter the key you would like to use for your encryption!");
                int inputtedKey = Integer.parseInt(myConsole.readLine());
                CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedName, inputtedKey);
                String encrypted = createdCaesarCipher.encrypt();
                System.out.println("Your encryption for the word " + inputtedName + " using the key " + inputtedKey + " is: ");
                System.out.println(encrypted);
                System.out.println("------------------");
            }else if (inputChoice.equals("2")) {
                System.out.println("Enter the word you would like to decrypt: ");
                String inputtedName = myConsole.readLine();
                System.out.println("Enter the key to use for your decryption!");
                int inputtedKey = Integer.parseInt(myConsole.readLine());
                CaesarCipher createdCaesarCipher = new CaesarCipher(inputtedName, inputtedKey);
                String decrypted = createdCaesarCipher.decrypt();
                System.out.println("Your decryption for the word " + inputtedName + " using the key " + inputtedKey + " is: ");
                System.out.println(decrypted);
                System.out.println("-------------------");
            }else if (inputChoice.equals("3")) {
                System.out.println("Are you sure you want to exit?");
                System.out.println("Choose either 1 or 2: 1.Yes 2.No");
                String exitChoice = myConsole.readLine();
                if (exitChoice.equals("1")) {
                    programRunning = false;
                } else if (exitChoice.equals("2")) {
                    programRunning = true;
                } else {
                    System.out.println("Please enter a valid choice either '1' or '2'");
                    exitChoice = myConsole.readLine();
                    if (exitChoice.equals("1")) {
                        programRunning = false;
                    } else if (exitChoice.equals("2")) {
                        programRunning = true;
                    }
                }
            }else{
                System.out.println("Sorry your input is not recognised!! Please enter a number either 1, 2 or 3");
            }
        }
    }
}