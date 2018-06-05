package pl.sda.tdd2;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class InputReaderTest {

    InputReader inputReader = new InputReader();

    @Mock
    public InputReader test01;

    @Test
    public void testMockReadFile() throws IOException {
        //given
        String path = "C:\\SDA\\test.csv";
        String expected = "Adam Mialczynski 34 101";
        List<String> lines = new ArrayList<String>();
        lines.add(expected);

        //when
        Mockito.when(test01.readLines(path)).thenReturn(lines);

        //then
        Assertions.assertThat(test01.readLines(path)).isEqualTo(lines);
    }

    @Mock
    public InputReader test02;

    @Test
    public void testConvertToPersonWithMock()throws IOException{
        //given
        String path = "C:\\SDA\\test.csv";
        String expectedLines = "Adam Mialczynski 34 101";
        List<String> expectedList = new ArrayList<String>();
        expectedList.add(expectedLines);

        Map<Integer, Person> expectedMap = new HashMap<Integer, Person>();
        Person expectedPerson = new Person("Adam", "Mialczynski", 34, 101);
        expectedMap.put(expectedPerson.getId(), expectedPerson);
        Map<Integer,Person> actualMap = new HashMap<Integer, Person>();

        List<String> actualList = new ArrayList<String>();

        //when
        Mockito.when(test02.readLines(path)).thenReturn(expectedList);
        actualMap = inputReader.convertToPerson(test02.readLines(path));

        //then
        Assertions.assertThat(actualMap).isEqualTo(expectedMap);
    }

    @Test
    public void testReadFile() throws IOException {
        //given
        List<String> lines = new ArrayList<String>();
        String path = "C:\\SDA\\test.csv";
        String expected = "Adam Mialczynski 34 101";

        //when
        lines = inputReader.readLines(path);

        //then
        Assertions.assertThat(lines.get(0)).isEqualToIgnoringCase(expected);
    }

    @Test
    public void testConvertToPerson() {
        //given
        Map<Integer, Person> expectedMap = new HashMap<Integer, Person>();
        Person expectedPerson = new Person("Adam", "Mialczynski", 34, 101);
        expectedMap.put(expectedPerson.getId(), expectedPerson);
        String testPerson = "Adam Mialczynski 34 101";
        List<String> lines = new ArrayList<String>();
        lines.add(testPerson);

        //when
        Map<Integer, Person> actualMap = inputReader.convertToPerson(lines);

        //then
        Assertions.assertThat(actualMap).isEqualTo(expectedMap);
    }
}
