package com.mercandalli.learn_java.c_first_project;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private final int dimensionX;
    private final int dimensionY;
    private final Map<String, Unit> units = new HashMap<>();

    public Board(
            int dimensionX,
            int dimensionY
    ) {
        if (dimensionX <= 0) {
            throw new IllegalStateException("Game dimension should be position strict");
        }
        if (dimensionY <= 0) {
            throw new IllegalStateException("Game dimension should be position strict");
        }
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    public String convertToPlayString() {
        String result = "";
        for (int y = 0; y < dimensionY; y++) {
            for (int x = 0; x < dimensionX; x++) {
                String signature = new Coordinate(x, y).getSignature();
                if (units.containsKey(signature)) {
                    result += " A |";
                } else {
                    result += " _ |";
                }
            }
            result += "\n";
        }
        return result;
    }

    public void addUnit(Unit unit, int x, int y) {
        for (Unit currentUnit : units.values()) {
            if (currentUnit.getId().equals(unit.getId())) {
                // Already contains the unit
                return;
            }
        }
        units.put(new Coordinate(x, y).getSignature(), unit);
    }
}
