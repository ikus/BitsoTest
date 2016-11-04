package com.bradcorp.bitsotest;

import java.util.HashMap;

/**
 * Created by Emisael Calderon on 10/23/2016.
 */

public class TesCase {
    private int NumberOfPoints;
    private HashMap<Integer, Island> setOfIslands;
    private HashMap<Integer, Lineas> setOfLines;


    public void addIslands(Island isla) {
        setOfIslands.put(isla.hashCode(), isla);
    }

    public HashMap<Integer, Island> getSetOfIslands() {
        return setOfIslands;
    }

    public void setSetOfIslands(HashMap<Integer, Island> setOfIslands) {
        this.setOfIslands = setOfIslands;
    }

    public TesCase(int numberOfPoints) {
        NumberOfPoints = numberOfPoints;
        setOfIslands = new HashMap<>();

    }
}
