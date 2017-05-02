package io.ushi.olio;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by leibo on 2016/10/20.
 */
public class FileLineReader {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(?<=\"content\":)(.+)(?=,\"from\")");

        try (InputStreamReader input = new InputStreamReader(ClassLoader.getSystemResourceAsStream("test.test"));
             BufferedReader reader = new BufferedReader(input)) {

            String temp;

            while ((temp = reader.readLine()) != null) {

                Matcher matcher = pattern.matcher(temp);
                if (matcher.find()) {
                    System.out.println(matcher.group(1));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
