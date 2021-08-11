package hw14.testarr;

import org.example.MainApp;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestArr {

    @BeforeAll
    public static void init() {
        System.out.println("Start test");
    }

    @AfterAll
    public static void finish() {
        System.out.println("Finish test");
    }


    public static Stream<Arguments> dataForGetArr() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 4, 2, 3, 4, 1, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 3, 1, 7));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 4));

        ArrayList<Integer> listResult = new ArrayList<>(Arrays.asList(1, 7));
        ArrayList<Integer> list2Result = new ArrayList<>(Arrays.asList(2, 3, 1, 7));
        ArrayList<Integer> list3Result = new ArrayList<>();

        List<Arguments> listStream = new ArrayList<>();
        listStream.add(Arguments.arguments(listResult, list));
        listStream.add(Arguments.arguments(list2Result, list2));
        listStream.add(Arguments.arguments(list3Result, list3));
        return listStream.stream();
    }


    public static Stream<Arguments> dataForCheckArr() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 4, 4, 1, 4, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(4, 4, 4, 4));
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 4, 4, 1, 1, 4, 3));
        ArrayList<Integer> arr5 = new ArrayList<>(Arrays.asList(14, 41, 11, 44));

        List<Arguments> listStream = new ArrayList<>();
        listStream.add(Arguments.arguments(true, arr));
        listStream.add(Arguments.arguments(false, arr2));
        listStream.add(Arguments.arguments(false, arr3));
        listStream.add(Arguments.arguments(false, arr4));
        listStream.add(Arguments.arguments(false, arr5));

        return listStream.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForGetArr")
    public void testGetArr(List expected, ArrayList<Integer> actual) {
        assertEquals(expected, MainApp.getArr(actual));
    }

    @Test
    public void testgetArrException() {
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        assertThrows(RuntimeException.class, () -> MainApp.getArr(list4));
    }

    @ParameterizedTest
    @MethodSource("dataForCheckArr")
    public void testCheckArr(boolean expected, ArrayList<Integer> actual) {
        assertEquals(expected, MainApp.checkArray(actual, 1, 4));
    }

}
