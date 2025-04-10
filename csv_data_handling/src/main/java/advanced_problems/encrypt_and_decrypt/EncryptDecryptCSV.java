package advanced_problems.encrypt_and_decrypt;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;

public class EncryptDecryptCSV {
    private static final String SECRET_KEY = "1234567890123456";

    public static String encrypt(String strToEncrypt) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(strToEncrypt.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String strToDecrypt) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decoded = Base64.getDecoder().decode(strToDecrypt);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }

    public static void writeEncryptedCSV(String outputFile) throws Exception{
        String[][] data = {
                {"1", "John", "john@example.com", "50000"},
                {"2", "Alice", "alice@example.com", "60000"}
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
            writer.write("Id,Name,Email,Salary");
            writer.newLine();
            for(String[] row : data){
                String encryptedEmail = encrypt(row[2]);
                String encryptedSalary = encrypt(row[3]);
                writer.write(row[0] + "," + row[1] + "," + encryptedEmail + "," + encryptedSalary);
                writer.newLine();
            }
        }
        System.out.println("Encrypted CSV written to: " + outputFile);
    }

    public static void readDecryptedCSV(String inputFile) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line = reader.readLine(); // header
            System.out.println(line); // print header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                String email = decrypt(parts[2]);
                String salary = decrypt(parts[3]);

                System.out.println(id + "," + name + "," + email + "," + salary);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String csvFile = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\encrypt_and_decrypt\\encrypted_data.csv";

        writeEncryptedCSV(csvFile);
        System.out.println("\nDecrypted Data:");
        readDecryptedCSV(csvFile);
    }
}
