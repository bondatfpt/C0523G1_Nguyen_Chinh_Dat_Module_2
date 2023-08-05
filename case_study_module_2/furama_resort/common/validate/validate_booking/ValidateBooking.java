package case_study_module_2.furama_resort.common.validate.validate_booking;

import algorithm.utils.exception.IdAlreadyExistException;
import algorithm.utils.exception.IdNotFoundException;
import case_study_module_2.furama_resort.common.validate.validate_facility.ValidateFacility;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateIdCustomer;
import case_study_module_2.furama_resort.model.booking.Booking;
import case_study_module_2.furama_resort.repository.booking_repository.BookingRepository;
import case_study_module_2.furama_resort.repository.booking_repository.IBookingRepository;

public class ValidateBooking {
    private  static IBookingRepository bookingRepository = new BookingRepository();
    private static final String REGEX_DATE = "^((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";

    private static final String REGEX_BOOKING_ID = "^BK-[0-9]{4}$";

    public static boolean validateBookingIdToAdd (String bookingId) throws IdAlreadyExistException{
        if (bookingId.matches(REGEX_BOOKING_ID)){
            Booking booking  = bookingRepository.getBookingByIdBooking(bookingId);
            if(booking == null){
                return true;
            }
            else {
                throw new IdAlreadyExistException("Booking id already exist. Re-enter booking id:");
            }
        }else {
            System.out.println("Wrong format. Re-enter booking id in the format (BK-XXXX, X is 0 - 9)");
            return false;
        }
    }

    public static boolean validateBookingIdToUpdateOrRemove (String bookingId) throws IdNotFoundException{
        if (bookingId.matches(REGEX_BOOKING_ID)){
            Booking booking  = bookingRepository.getBookingByIdBooking(bookingId);
            if(booking != null){
                return true;
            }
            else {
                throw new IdNotFoundException("Booking id not found. Re-enter booking id:");
            }
        }else {
            System.out.println("Wrong format. Re-enter booking id in the format (BK-XXXX, X is 0 - 9)");
            return false;
        }
    }

    public static boolean validateIdCustomerToAdd(String customerId){
        boolean flag = false;
        try {
            if(ValidateIdCustomer.validateIdCustomerToRemoveOrUpdate(customerId)){
                flag = true;
            }
        } catch (case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException idNotFoundException) {
            System.out.println(idNotFoundException.getMessage());
        }
        return flag;
    }

    public static boolean validateIdFacilityToAdd(String facilityId){
        boolean flag = false;
        try {
            if(ValidateFacility.validateIdToRemove(facilityId)){
                flag = true;
            }
        } catch (case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException idNotFoundException) {
            System.out.println(idNotFoundException.getMessage());
        }
        return flag;
    }

    public static boolean validateDate (String date){
        if(date.matches(REGEX_DATE)){
            return true;
        }
        else {
            System.out.println("Invalid date. Re-enter date please");
            return false;
        }
    }

}
