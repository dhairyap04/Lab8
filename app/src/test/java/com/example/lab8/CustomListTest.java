package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * Create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan","SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Montreal", "QB");
        list.addCity(city1);
        assertTrue(list.hasCity(city1));
        assertFalse(list.hasCity(city2));
    }

    @Test
    void testDeleteCity(){
        list = MockCityList();
        City city1 = new City("Edmonton", "AB");
        list.addCity(city1);
        assertEquals(1, list.getCount());
        list.delete(city1);
        assertEquals(0, list.getCount());
        assertFalse(list.hasCity(city1));
    }

    @Test
    void testCountCities() {
        list = MockCityList();
        City city1 = new City("Vancouver", "BC");
        City city2 = new City("Ottawa", "ON");
        City city3 = new City("Winnipeg", "MB");
        assertEquals(0, list.getCount());
        list.addCity(city1);
        assertEquals(1, list.getCount());
        list.addCity(city2);
        assertEquals(2, list.getCount());
        list.delete(city1);
        assertEquals(1, list.getCount());
        list.addCity(city3);
        list.add(city1);
        assertEquals(3, list.getCount());

    }

}
