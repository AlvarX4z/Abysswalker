package com.alvarodf.abysswalker.db;

/**
 * Custom interface created for providing an answer to use DataBase functions in both Desktop and Android modules.
 * @since February 25th, 2020.
 * @author Alvaro de Francisco
 */
public interface DataBase {

    /**
     * Loads the user's statistics for its Vanyr character: Current health points, damage, armor, experience points and level.
     * @return An int array which holds the values in the specified order from above.
     * @since February 25th, 2020.
     */
    int loadInfo();

    /**
     * Saves the user's statistics for its Vanyr character: Current health points, damage, armor, experience points and level.
     * @param lvl The current level points.
     * @since February 25th, 2020.
     */
    void saveInfo(int lvl);

}
