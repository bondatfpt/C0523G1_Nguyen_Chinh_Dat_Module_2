package case_study_module_2.furama_resort.repository.booking_repository;

import case_study_module_2.furama_resort.model.booking.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static final Set<Booking> bookingSet = new TreeSet<>();

    static {
        LocalDate startDate1 = LocalDate.parse("2023-07-01");
        LocalDate endDate1 = LocalDate.parse("2023-08-01");
        LocalDate startDate2 = LocalDate.parse("2023-05-01");
        LocalDate endDate2 = LocalDate.parse("2023-06-01");
        LocalDate startDate3 = LocalDate.parse("2023-04-01");
        LocalDate endDate3 = LocalDate.parse("2023-05-01");

        bookingSet.add(new Booking("BK-0001","KH-0001","SVVL-0001",startDate1,endDate1));
        bookingSet.add(new Booking("BK-0002","KH-0002","SVRO-0001",startDate2,endDate2));
        bookingSet.add(new Booking("BK-0003","KH-0003","SVHO-0001",startDate3,endDate3));
    }

    @Override
    public void addBooking(Booking booking) {
        bookingSet.add(booking);

    }

    @Override
    public Set<Booking> getAllBooking() {
        return bookingSet;
    }

    @Override
    public void deleteBooking(String bookingId) {
        for (Booking booking: bookingSet) {
            if(booking.getBookingId().equals(bookingId)){
                bookingSet.remove(booking);
                break;
            }
        }
    }

    @Override
    public Booking getBookingByIdBooking(String bookingId) {
        for (Booking booking: bookingSet) {
            if(booking.getBookingId().equals(bookingId)){
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking getBookingByIdCustomer(String customerId) {
        for (Booking booking: bookingSet) {
            if(booking.getCustomerId().equals(customerId)){
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking getBookingByIdFacility(String facilityId) {
        for (Booking booking:bookingSet) {
            if(booking.getFacilityId().equals(facilityId)){
                return booking;
            }
        }
        return null;
    }

    @Override
    public void editBooking(Booking booking, String id) {
        List <Booking> bookingList = new ArrayList<>();
        for (Booking booking1:bookingSet) {
            bookingList.add(booking1);
        }
        bookingSet.clear();
        for (int i = 0; i < bookingList.size(); i++) {
            if(bookingList.get(i).getBookingId().equals(id)){
                bookingList.set(i,booking);
            }
        }
        for (Booking booking2: bookingList) {
            bookingSet.add(booking2);
        }
    }
}
