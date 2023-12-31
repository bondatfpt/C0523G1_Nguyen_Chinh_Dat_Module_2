package case_study_module_2.furama_resort.model.booking;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingId;
    private String customerId;
    private String facilityId;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking() {
    }

    public Booking(String bookingId, String customerId, String facilityId, LocalDate startDate, LocalDate endDate) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public int compareTo(Booking booking) {
        return this.bookingId.compareTo(booking.bookingId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Booking booking = (Booking) obj;
        return Objects.equals(bookingId, booking.bookingId) && Objects.equals(customerId, booking.customerId) && Objects.equals(facilityId, booking.facilityId) && Objects.equals(startDate, booking.startDate) && Objects.equals(endDate, booking.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, customerId, facilityId, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", facilityId='" + facilityId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

