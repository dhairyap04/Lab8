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

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan","SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        // Initialize CityList with a few cities
        list = MockCityList();
        City city1 = new City("Calgary", "Alberta");
        City city2 = new City("Toronto", "Ontario");

        // Add city1 to the cityList
        list.addCity(city1);

        // Test if city1 is in the list (should be true)
        assertEquals(true,list.hasCity(city1), "CityList should contain Edmonton");

        // Test if city2 is not in the list (should be false)
        assertEquals(false, list.hasCity(city2), "CityList should not contain Toronto");
    }

}
