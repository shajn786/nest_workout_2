package tile;

import java.math.*;
public class Floor {

    float length,width;

    Floor(float length, float width)
    {
       this.length = length;
       this.width = width;
    }

    int totalTiles(Tile t)
    {

       float areaOfFloor = this.length * this.width;
       float areaOfTile = t.tile_lenght * t.tile_lenght;

       int no_of_tiles = (int) Math.ceil(areaOfFloor/areaOfTile);



        return no_of_tiles;


    }
}
