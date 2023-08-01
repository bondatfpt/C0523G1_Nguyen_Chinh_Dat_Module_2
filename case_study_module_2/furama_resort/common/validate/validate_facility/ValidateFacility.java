package case_study_module_2.furama_resort.common.validate.validate_facility;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.Villa;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;

import java.util.Scanner;

public class ValidateFacility {

    private static Scanner input = new Scanner(System.in);
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    private static final String REGEX_NAME = "^[A-Z][a-z]+\\s[A-Z][a-z]+$";
    private static final String REGEX_ID_TO_REMOVE = "^SV(VL|RO|HO)-\\d{4}$";


    public static boolean validateNameService (String name){
        if(name.matches(REGEX_NAME)){
            return true;
        }
        else {
            System.out.println("Service name,rental type, room standard must capitalize the first character, the following characters are normal characters.");
            return false;
        }
    }

    public static boolean validateUsableArea (double usableArea){
        if(usableArea <= 30 ){
            System.out.println("Usable area and pool area must be real numbers greater than 30m2");
            return false;
        }else {
            return true;
        }
    }

    public static boolean validateRentalCost (double rentalCost){
        if(rentalCost <= 0 ){
            System.out.println("Rental cost must be real numbers greater than 0");
            return false;
        }else {
            return true;
        }
    }

    public static boolean validateCapacity (int capacity){
        if(capacity <= 0 || capacity > 20){
            System.out.println("The maximum number of people must be greater than 0 and less than 20");
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean validateIdToRemove(String id) throws IdNotFoundException {
        Facility facility = new Villa(id);
        if (id.matches(REGEX_ID_TO_REMOVE)) {
            facility = facilityRepository.getFacilityById(id);
            if (facility == null) {
                throw new IdNotFoundException("Id not found. Re-enter id, please.");
            } else {
                return true;
            }
        } else {
            System.out.println("Wrong format, Re-enter id, please.");
            return false;
        }
    }
}

