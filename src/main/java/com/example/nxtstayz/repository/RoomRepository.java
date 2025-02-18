
package com.example.nxtstayz.repository;


import com.example.nxtstayz.model.Room;
import com.example.nxtstayz.model.Hotel;


import java.util.List;


public interface RoomRepository {
    List<Room> getRooms();


    Room getRoomById(int roomId);


    Room addRoom(Room room);


    Room updateRoom(int roomId, Room room);


    void deleteRoom(int roomId);


    Hotel getRoomHotel(int roomId);
}