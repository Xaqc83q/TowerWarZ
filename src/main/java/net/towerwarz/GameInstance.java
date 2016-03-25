package net.towerwarz;

import net.towerwarz.exception.UnknownObjectException;

import java.util.Arrays;

/**
 * TowerWarZ
 * Created by xiurobert on 2/14/2016.
 */


/**
 * This file is the init file and contains functions to set and retrieve certain game properties
 */
public class GameInstance {
    private int WaveNumber;
    private String difficulty;
    private String MapName;


    private String[] maps = {
            "GrassLands",
            "HellWorld",
            "IceLand",
            "DarkForest"

    };
    private String[] difficulties = {
            "Easy",
            "Normal",
            "Hard",
            "Sparta"
    };



    public String setDifficulty(String diff) throws UnknownObjectException {
        if (Arrays.asList(difficulties).contains(diff)) { // Check if the difficulty is valid
            difficulty = diff; // Set difficulty
        } else {
            throw new UnknownObjectException("Invalid difficulty");
        }
        return difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String setMap(String map) throws UnknownObjectException {
        if (Arrays.asList(maps).contains(map)) {
            MapName = map;
        } else {
            throw new UnknownObjectException("Invalid map");
        }
        return MapName;
    }

    public String getMapName() {
        return MapName;
    }

    public int getWaveNumber() {
        return WaveNumber;
    }
}
