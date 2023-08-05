package case_study_module_2.furama_resort.service.booking_service;

import algorithm.utils.exception.IdAlreadyExistException;
import algorithm.utils.exception.IdNotFoundException;
import case_study_module_2.furama_resort.common.validate.validate_booking.ValidateBooking;
import case_study_module_2.furama_resort.model.booking.Booking;
import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.repository.booking_repository.BookingRepository;
import case_study_module_2.furama_resort.repository.booking_repository.IBookingRepository;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.service.customer_service.CustomerService;
import case_study_module_2.furama_resort.service.customer_service.ICustomerService;
import case_study_module_2.furama_resort.service.facility_service.FacilityService;
import case_study_module_2.furama_resort.service.facility_service.IFacilityService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService {
    private static Scanner input = new Scanner(System.in);
    private IBookingRepository bookingRepository = new BookingRepository();

    private ICustomerService customerService = new CustomerService();
    private IFacilityService facilityService = new FacilityService();
    private IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void displayBooking() {
        Set<Booking> bookings = bookingRepository.getAllBooking();
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    @Override
    public void addBooking() {
        System.out.println("Enter a booking id");
        String bookingId;
        boolean checkId = false;
        do {
            bookingId = input.nextLine();
            try {
                checkId = ValidateBooking.validateBookingIdToAdd(bookingId);
            } catch (IdAlreadyExistException idAlreadyExistException) {
                System.out.println(idAlreadyExistException.getMessage());
            }
        } while (!checkId);

        customerService.display();
        System.out.println("Enter a customer id");
        String customerId;
        boolean checkCustomerId ;
        do {
            customerId = input.nextLine();
            checkCustomerId = ValidateBooking.validateIdCustomerToAdd(customerId);
        } while (!checkCustomerId);

        facilityService.display();
        System.out.println("Enter a facility id");
        String facilityId;
        boolean checkFacilityId;
        do {
            facilityId = input.nextLine();
            checkFacilityId = ValidateBooking.validateIdFacilityToAdd(facilityId);
        } while (!checkFacilityId);

        System.out.println("Enter start day in the format (YYYY-MM-DD)");
        String date1;
        boolean checkDate;
        do {
            date1 = input.nextLine();
            checkDate = ValidateBooking.validateDate(date1);
        }while (!checkDate);
        LocalDate startDate = LocalDate.parse(date1);

        System.out.println("Enter end day in the format (YYYY-MM-DD)");
        String date2;
        boolean checkDate2;
        do {
            date2 = input.nextLine();
            checkDate2 = ValidateBooking.validateDate(date2);
        }while (!checkDate2);
        LocalDate endDate = LocalDate.parse(date2);

        Booking booking = new Booking(bookingId,customerId,facilityId,startDate,endDate);
        bookingRepository.addBooking(booking);
        System.out.println("Successfully added booking have id: " +bookingId);
        displayBooking();
        Map <Facility,Integer> facilityIntegerMap = facilityRepository.getAllFacility();
        for (Map.Entry <Facility,Integer> entry:facilityIntegerMap.entrySet()) {
            if(entry.getKey().getId().equals(facilityId)){
                facilityIntegerMap.put(entry.getKey(),entry.getValue()+1);
                break;
            }
        }
    }

    @Override
    public void deleteBooking() {
        System.out.println("Enter a booking id you want to delete.");
        String bookingId;
        boolean checkId = false;
        do {
            bookingId = input.nextLine();
            try {
                checkId = ValidateBooking.validateBookingIdToUpdateOrRemove(bookingId);
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        }while (!checkId);
        bookingRepository.deleteBooking(bookingId);
        System.out.println("Successfully delete booking have id: " + bookingId);
        displayBooking();
    }

    @Override
    public void updateBooking() {
        System.out.println("Enter a booking id you want to edit");
        String bookingId;
        boolean checkId = false;
        do {
            bookingId = input.nextLine();
            try {
                checkId = ValidateBooking.validateBookingIdToUpdateOrRemove(bookingId);
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        }while (!checkId);

        customerService.display();
        System.out.println("Enter a customer id");
        String customerId;
        boolean checkCustomerId ;
        do {
            customerId = input.nextLine();
            checkCustomerId = ValidateBooking.validateIdCustomerToAdd(customerId);
        } while (!checkCustomerId);

        facilityService.display();
        System.out.println("Enter a facility id");
        String facilityId;
        boolean checkFacilityId;
        do {
            facilityId = input.nextLine();
            checkFacilityId = ValidateBooking.validateIdFacilityToAdd(facilityId);
        } while (!checkFacilityId);

        System.out.println("Enter start day in the format (YYYY-MM-DD)");
        String date1;
        boolean checkDate;
        do {
            date1 = input.nextLine();
            checkDate = ValidateBooking.validateDate(date1);
        }while (!checkDate);
        LocalDate startDate = LocalDate.parse(date1);

        System.out.println("Enter end day in the format (YYYY-MM-DD)");
        String date2;
        boolean checkDate2;
        do {
            date2 = input.nextLine();
            checkDate2 = ValidateBooking.validateDate(date2);
        }while (!checkDate2);
        LocalDate endDate = LocalDate.parse(date2);

        Booking booking = new Booking(bookingId,customerId,facilityId,startDate,endDate);
        bookingRepository.editBooking(booking,bookingId);
        System.out.println("Successfully updated booking have id: " + bookingId);
        displayBooking();
    }
}
