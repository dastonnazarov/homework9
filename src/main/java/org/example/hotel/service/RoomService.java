package org.example.hotel.service;

import org.example.hotel.controller.AdminController;
import org.example.hotel.controller.RoomController;
import org.example.hotel.dtoEntity.Room;
import org.example.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    AdminController adminController;

    public void addRoom(Room room) {
        Room exist = roomRepository.getByNumber(room.getNumber());
        if (exist != null) {
            System.out.println("sorry, room has already created!!!");
          //  adminController.roomSectionMenu();
        } else {
            roomRepository.addRoom(room);
            System.out.println("room is create successfully");
          //  adminController.roomSectionMenu();
        }
    }
}
