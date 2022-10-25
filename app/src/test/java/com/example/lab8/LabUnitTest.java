package com.example.lab8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LabUnitTest {

    private CustomList cities;

    public City mockCity(String cityName, String province ) {
        return new City( cityName, province );
    }

    @Before
    public void createList() {
        cities = new CustomList(null, new ArrayList<>());
    }
    @Test
    public void testAddCity() {
        City testCity = mockCity("Edmonton","Alberta");
        cities.addCity( testCity);
        assertEquals( 1, cities.getCount() );
    }
}
