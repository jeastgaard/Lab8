package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class LabUnitTest {

    private CustomList cities;

    public City mockCity(String cityName, String province ) {
        return new City( cityName, province );
    }

    @BeforeEach
    public void createList() {
        cities = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void testAddCity() {
        City testCity = mockCity("Edmonton","Alberta");
        cities.addCity( testCity);
        assertEquals( 1, cities.getCount() );
    }

    @Test
    public void deleteCityTest() {
        City testCity = mockCity("Edmonton", "Alberta" );
        cities.addCity( testCity );
        assertEquals( true, cities.hasCity( testCity ) );
        cities.deleteCity( testCity );
        assertEquals( false, cities.hasCity( testCity ) );
    }

    @Test
    public void countCitiesTest() {
        City testCity = mockCity("Edmonton", "Alberta" );
        assertEquals( 0, cities.getCount() );
        cities.add( testCity );
        assertEquals( 1, cities.getCount() );
    }

    @Test
    public void hasCityTest() {
        City testCity = mockCity("Edmonton", "Alberta" );
        assertEquals( false, cities.hasCity( testCity ) );
        cities.addCity( testCity );
        assertEquals( true, cities.hasCity( testCity ) );
    }
}
