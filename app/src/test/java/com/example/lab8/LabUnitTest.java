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
}
