package case_study_module_2.furama_resort.repository.booking_repository;


import case_study_module_2.furama_resort.model.booking.Booking;

import java.util.Set;

public interface IBookingRepository {
    void addBooking (Booking booking);
    Set <Booking> getAllBooking ();
    void deleteBooking (String bookingId);
    Booking getBookingByIdBooking(String bookingId);
    Booking getBookingByIdCustomer(String customerId);
    Booking getBookingByIdFacility (String facilityId);

    void editBooking(Booking booking,String id);
}
