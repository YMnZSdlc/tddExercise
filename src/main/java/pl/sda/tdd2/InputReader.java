package pl.sda.tdd2;

import com.google.common.io.Files;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputReader {


    public List<String> readLines(String path) throws IOException {
        List<String> lines = Files.readLines(new File(path), Charset.defaultCharset());
        return lines;
    }

    public Map<Integer,Person> convertToPerson(List<String> lines) {
        Map <Integer, Person> result = new HashMap<Integer, Person>();
        for (String line : lines) {
            String[] split = line.split(" ");
            Person person = new Person(split[0],split[1],Integer.parseInt(split[2]),Integer.parseInt(split[3]));
            result.put(person.getId(),person);
        }
        return result;
    }



}
