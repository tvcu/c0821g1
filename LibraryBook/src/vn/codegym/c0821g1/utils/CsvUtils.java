package vn.codegym.c0821g1.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {
    public static List<String> read(String filePath) throws IOException {
        List<String> records = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists())
            throw new FileNotFoundException(String.format("File %s not found", filePath));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            records.add(line);
        }
        bufferedReader.close();
        return records;
    }

    public static <T> void write(String filePath, List<T> records) throws IOException {
        File file = new File(filePath);
        if (!file.exists() && !file.createNewFile())
            throw new IOException(String.format("Create new file %s error", filePath));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Object record : records) {
            bufferedWriter.write(record.toString());
            bufferedWriter.write(System.getProperty("line.separator"));
        }
        bufferedWriter.close();
    }
}
