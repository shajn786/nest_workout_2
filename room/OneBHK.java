package room;

import java.util.Scanner;

public class OneBHK {
    float roomArea;
    float hallArea;
    int price,roomId;

    OneBHK()
    {

    }

    OneBHK(int roomId,float roomArea,float hallArea,int price)
    {
        this.roomId = roomId;
        this.roomArea= roomArea;
        this.hallArea=hallArea;
        this.price = price;
    }

    public void show()
    {
        System.out.println("Room Id :"+roomId+"\n"+
               "Room Area :"+ roomArea+"\n"+
               "Hall Area :" +hallArea+"\n"+
                "Price :"+price);
    }

}


