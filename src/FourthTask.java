import java.util.*;

public class FourthTask {
    public void removeDuplicateLetters() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String inputText = scanner.nextLine();

        // Розділяємо введений текст на слова, використовуючи пробіли та розділові знаки як роздільники
        String[] words = inputText.split("[\\s\\p{Punct}]+");

        // Створюємо множину для зберігання унікальних слів без повторених літер
        Set<String> uniqueWords = new HashSet<>();

        // Фільтруємо слова та додаємо їх до множини
        for (String word : words) {
            if (!DuplicateLetters(word)) {
                uniqueWords.add(word);
            }
        }

        // Виводимо унікальні слова без повторених літер
        System.out.println("Words without repeated letters:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }

    // Метод для перевірки наявності повторених літер у слові
    private static boolean DuplicateLetters(String word) {
        Set<Character> letters = new HashSet<>();
        for (char letter : word.toCharArray()) {
            if (!letters.add(letter)) {
                return true; // Якщо літера вже була додана до множини, повертаємо true
            }
        }
        return false;
    }
}
