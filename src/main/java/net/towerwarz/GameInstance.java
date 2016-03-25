package net.towerwarz;

import net.towerwarz.exception.UnknownObjectException;
import net.towerwarz.Maps;

import java.util.Arrays;

/**
 * TowerWarZ
 * Created by xiurobert on 2/14/2016.
 */


/**
 * This file is the init file and contains functions to set and retrieve certain game properties
 */
public class GameInstance {
    private int waveNumber;
    private Difficulty difficulty;
    private Maps mapName;

    public GameInstance() {

    }

    public GameInstance(Difficulty diff, Maps map) {
        difficulty = diff;
        mapName = map;
        waveNumber = 0; // Subject to change
    }

    public Difficulty setDifficulty(Difficulty diff) throws UnknownObjectException {
        if (diff != null) { // Check if the difficulty is valid
            difficulty = diff; // Set difficulty
        } else {
            throw new UnknownObjectException("Invalid difficulty");
        }
        return difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Maps setMap(Maps map) throws UnknownObjectException {
        if (map != null) {
            mapName = map;
        } else {
            throw new UnknownObjectException("Invalid map");
        }
        return mapName;
    }

    public Maps getMapName() {
        return mapName;
    }

    public int getWaveNumber() {
        return waveNumber;
    }
}
