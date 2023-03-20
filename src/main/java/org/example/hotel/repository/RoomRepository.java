package org.example.hotel.repository;

import org.example.hotel.dtoEntity.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomRepository {
    @Autowired
    private SessionFactory sessionFactory;


    public void addRoom(Room room) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(room);
        transaction.commit();
        session.close();
    }

    public Room getByNumber(Integer number) {
        Session session = sessionFactory.openSession();
        Room room = session.find(Room.class, number);
        session.close();
        return room;
    }

    public List<Room> getRoomList(Integer number) {
        Session session = sessionFactory.openSession();
        Query<Room> query = session.createQuery("FROM Room ", Room.class);
        List<Room> resultList = query.getResultList();
        session.close();
        return resultList;
    }

    public void deleteRoom(Integer number){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete from room where number =: number");
        query.setParameter("number",number);
        query.executeUpdate();

        transaction.commit();
        session.close();
    }

    public void updateRoom(Room room){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(room);
        transaction.commit();
        session.close();
    }


}
