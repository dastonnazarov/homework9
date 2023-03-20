package org.example.hotel.controller;

import org.example.hotel.dtoEntity.Room;
import org.example.hotel.enums.RoomType;

import org.example.hotel.service.RoomService;
import org.example.hotel.util.Scan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;

    public void addRoom() {
        System.out.print("Enter room number: ");
        Integer number = Scan.scannerNum.nextInt();

        System.out.print("Enter floor: ");
        Integer floor = Scan.scannerNum.nextInt();

        System.out.print("Enter type: ");
        String type = Scan.scannerStr.nextLine();

        System.out.print("Enter price: ");
        Double price = Scan.scannerNum.nextDouble();

        System.out.print("Enter area: ");
        Double area = Scan.scannerNum.nextDouble();

        Room room = new Room();
        room.setNumber(number);
        room.setFloor(floor);
        room.setType(RoomType.valueOf(type));
        room.setPrice(price);
        room.setArea(area);
        roomService.addRoom(room);
    }

    public void roomList() {

    }

    public void deleteRoom() {
    }

    public void updateRoom() {
    }

    public void findRoom() {
    }

    public void roomConvenient() {
    }
}
