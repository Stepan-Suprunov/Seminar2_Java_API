// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void WriteInFile() {
        String str = GenStringTest();
        try(FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String GenStringTest() {
        StringBuilder BuilderStringTEST = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            BuilderStringTEST.append("TEST ");
        }
        return BuilderStringTEST.toString();
        // return "TEST ".repeat(100);  короткий запись.
    }
}
