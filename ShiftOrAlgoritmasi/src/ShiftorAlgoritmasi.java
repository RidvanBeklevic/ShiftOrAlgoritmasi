import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ShiftorAlgoritmasi {
    public static void main(String[] args) {
        // Dosya yolu ,, Burayı Kendinize göre güncellemeniz gerekmektedir
        String filePath = "C:\\Users\\EXCALIBUR\\Desktop\\alice_in_wonderland.txt";

        // Aranacak kelimeler
        String[] searchWords = {"upon", "sigh", "Dormouse", "jury-box", "swim"};

        // Dosyayı oku ve her kelimenin kaç kez geçtiğini say
        HashMap<String, Integer> wordCounts = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String searchWord : searchWords) {
                    int count = TekrarSayisi(line, searchWord);
                    if (count > 0) {
                        wordCounts.put(searchWord, wordCounts.getOrDefault(searchWord, 0) + count);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kullanıcının girdiği kelimeleri de dosyada ara
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Aranacak kelime (çıkmak için q): ");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            int sayma= wordCounts.getOrDefault(input, 0);
            System.out.println("'" + input + "' kelimesi " + sayma + " kez geçiyor.");
        }
    }

    // Shift-Or algoritması ile kelimenin bir metin içinde kaç kez geçtiğini sayar
    private static int TekrarSayisi(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int mask[] = new int[Character.MAX_VALUE];
        int sayma = 0;
        int j = 0;

        // Maske oluştur
        for (int i = 0; i < m; i++) {
            mask[pattern.charAt(i)] |= 1 << i;
        }

        // Metni tara
        for (int i = 0; i < n; i++) {
            j = (j << 1 | 1) & mask[text.charAt(i)];
            if (j == 1 << m - 1) {
                sayma++;
            }
        }

        return sayma;
    }
}
