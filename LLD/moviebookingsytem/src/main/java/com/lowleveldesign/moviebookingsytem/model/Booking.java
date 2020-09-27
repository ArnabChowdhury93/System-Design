package com.lowleveldesign.moviebookingsytem.model;

public class Booking {
    private int id;
    private BookingStatus status;
    private int seatCount;
    private Show show;
    private Payment paymentdetails;
    private List<ShowSeat> seats;
    private DateTime bookingDateTime;

    private boolean makePayment(Payment paymentDetails) {

    }

    private boolean cancel(int id) {

    }

    private boolean reserveSeats(List<ShowSeat> seats) {

    }

}
