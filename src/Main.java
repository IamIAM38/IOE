import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ученик\\IdeaProjects\\IOE\\src\\Text.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);

        } catch (FileNotFoundException e) {

            System.out.println("Ошибка! Файл не найден!");
        }catch (IOException e){
            System.out.println("Ошибка! Не могу прочитать файл!");
        }

        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\Ученик\\IdeaProjects\\IOE\\src\\Text.txt"));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Что напишем?:");
            String text = scanner.nextLine();
//            String text = "Hello World 1! \n Hello world 2!";
            write.write(text);
            write.close();
        } catch (IOException e) {
            System.out.println("Ошибка! Не могу написать в файл!");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Конец программы.");
        }
    }
}