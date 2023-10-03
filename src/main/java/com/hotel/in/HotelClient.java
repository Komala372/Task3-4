package com.hotel.in;

public class HotelClient {

    public static void main(String[] args) {

            HotelService hotelService = new HotelService();
            hotelService.assignRoomToGuest(new Room(1,1,new Guest(1,"Rohan","Raj","rohan@gmail.com"),"deluxe",3000));
            hotelService.assignRoomToGuest(new Room(2,1,new Guest(2,"Somya","Jai","somya@gmail.com"),"deluxe",3500));
            hotelService.assignRoomToGuest(new Room(3,1,new Guest(3,"Ragav","More","ragav@gmail.com"),"regular",1200));
            hotelService.assignRoomToGuest(new Room(5,2,new Guest(4,"Dev","Kumar","dev@gmail.com"),"regular",1300));
            hotelService.assignRoomToGuest(new Room(6,2,new Guest(5,"Surya","Roy","surya@gmail.com"),"deluxe",4000));

            Guest guest = hotelService.findGuestCheckedInRoom(5);
            System.out.println("Guest who checked in is::"+guest.getFirstName()+" "+guest.getLastName());

            int totalNoOfGuest = hotelService.guestCount();
            System.out.println("Total number of Guest::"+totalNoOfGuest);

            double earned = hotelService.earningToday();
            System.out.println("Total earnings of today::"+earned);

            Guest[] guests = hotelService.findAllGuests();
            for (Guest guest1:guests) {
            System.out.println("Guests in Hotel::"+guest1.getFirstName()+" "+guest1.getLastName());
        }

    }



}
