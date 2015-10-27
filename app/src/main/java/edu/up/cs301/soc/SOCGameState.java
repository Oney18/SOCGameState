package edu.up.cs301.soc;

import java.util.ArrayList;
import java.util.Random;

import edu.up.cs301.game.infoMsg.GameState;

/**
 * Created by oney18 on 10/27/2015.
 */
public class SOCGameState extends GameState {
    private int playersID; //ID of the player whose turn it is
    private int score0; //player 0's score
    private int score1; //player 1's score
    private int score2; //player 2's score
    private int score3; //player 3's score
    private int die1; //the red die
    private int die2; //the yellow die
    private int robber; //where the robber is
    private Road[] roads; //all the road spots
    private Tile[] tiles; //all the tiles
    private Building[] buildings; //all the building spots
    private Hand[] hands; //the players' hands

    private Random rng = new Random();

    public SOCGameState()
    {
        playersID = 0;
        score0 = 0;
        score1 = 0;
        score2 = 0;
        score3 = 0;
        die1 = 1;
        die2 = 1;
        robber = 9;

        roads = new Road[72];
        for(int i = 0; i < roads.length; i++)
        {
            roads[i] = new Road();
        }

        tiles = new Tile[19];
        for(int i = 0; i < tiles.length; i++)
        {
            tiles[i] = new Tile();
        }

        buildings = new Building[54];
        for(int i = 0; i < buildings.length; i++)
        {
            buildings[i] = new Building();
        }

        hands = new Hand[4];
        for(int i = 0; i < hands.length; i++)
        {
            hands[i] = new Hand();
        }
    }

    public SOCGameState(int ID, int score0, int score1, int score2, int score3, int die1, int die2,
                        int robber, Road[] roads, Tile[] tiles, Building[] buildings, Hand[] hands)
    {
        this.playersID = ID;
        this.score0 = score0;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.die1 = die1;
        this.die2 = die2;
        this.roads = roads;
        this.tiles = tiles;
        this.buildings = buildings;
        this.hands = hands;
    }

    public SOCGameState(SOCGameState soc){
        this(soc.getPlayersID(), soc.getScore0(), soc.getScore1(), soc.getScore2(), soc.getScore3(),
                soc.getDie1(), soc.getDie2(), soc.getRobber(), soc.getRoads(), soc.getTiles(), soc.getBuildings(),
                soc.getHands());
    }

    public int getPlayersID()
    {
        return playersID;
    }

    public int getScore0()
    {
        return score0;
    }

    public int getScore1()
    {
        return score1;
    }

    public int getScore2()
    {
        return score2;
    }

    public int getScore3()
    {
        return score3;
    }

    public int getDie1()
    {
        return die1;
    }

    public int getDie2()
    {
        return die2;
    }

    public void roll()
    {
        die1 = rng.nextInt(6) + 1;
        die2 = rng.nextInt(6) + 1;

        if(die1 + die2 == 7)
        {
            //do robber stuff
        }
    }

    public int getRobber()
    {
        return robber;
    }

    public Road[] getRoads()
    {
        return roads;
    }

    public Tile[] getTiles()
    {
        return tiles;
    }

    public Building[] getBuildings()
    {
        return buildings;
    }

    public Hand[] getHands()
    {
        return hands;
    }

    public void buildRoad(int spot)
    {
        if(!roads[spot].isEmpty())
        {
            return; //something is there!
        }
        if(hands[playersID].getBricks() == 0 || hands[playersID].getWood() == 0)
        {
            return; //lacking resources!
        }
    }
}
