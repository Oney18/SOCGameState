package edu.up.cs301.soc;

import android.graphics.Color;
import java.util.ArrayList;

/**
 * Created by goldey17 on 10/27/2015.
 * Class to create a building object which contains all the information relating to a building.
 */
public class Building {
    //Instance Variables
    private int number;
    private boolean isEmpty;
    private int player;
    private int typeOfBuilding;
    private int [] adjacentRoads;
    private int [] adjacentTiles;
    public static final int EMPTY = -1;
    public static final int SETTLEMENT = 0;
    public static final int CITY = 1;
    public static final int TOTAL_NUMBER_OF_BUILDING_SPOTS = 54;
    public static final int SMALLEST_NUMBER_OF_BUILDING_SPOTS = 0;
    public static final int TOTAL_NUMBER_OF_PLAYERS = 4;
    public static final int SMALLEST_NUMBER_OF_PLAYERS = 0;

    //Constructor
    public Building (int newNumber){
        setNumber(newNumber);
        isEmpty = true;
        player = EMPTY;
        typeOfBuilding = EMPTY;
    }

    //Method to return the building number
    public int getNumber(){
        return number;
    }

    //Method to return if the building spot is empty
    public boolean isEmpty(){
        return isEmpty;
    }

    //Method to return the number of the player who has a building built
    public int getPlayer(){
        return player;
    }

    //Method to return the type of building
    public int getTypeOfBuilding(){
        return typeOfBuilding;
    }

    //Method to set the number of the building
    public void setNumber( int newNumber){
        if (newNumber >= SMALLEST_NUMBER_OF_BUILDING_SPOTS && newNumber < TOTAL_NUMBER_OF_BUILDING_SPOTS){
            number = newNumber;
        }
    }

    //Method to set if the building is empty or full
    public void setIsEmpty( boolean empty){
        isEmpty = empty;
    }

    //Method to set the number of the player who owns the building
    public void setPlayer( int newPlayer){
        if (newPlayer < TOTAL_NUMBER_OF_PLAYERS && newPlayer >= SMALLEST_NUMBER_OF_PLAYERS){
            player = newPlayer;
        }
    }

    //Method to set the type of building
    public void setTypeOfBuilding (int type){
        if ( type == SETTLEMENT || type == CITY) {
            typeOfBuilding = type;
        }
    }
}