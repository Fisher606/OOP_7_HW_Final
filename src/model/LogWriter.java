package model;

import java.io.FileWriter;
import java.io.IOException;

public class LogWriter implements Logable {
    @Override
    public void writeLog(String message) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(message + "\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}