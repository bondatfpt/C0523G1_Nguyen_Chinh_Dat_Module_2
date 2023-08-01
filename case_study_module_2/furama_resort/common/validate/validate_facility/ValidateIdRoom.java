package case_study_module_2.furama_resort.common.validate.validate_facility;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.Room;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;

public class ValidateIdRoom {
    private static final String REGEX_ID_ROOM = "^SVRO-\\d{4}$";
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    public static boolean validateIDRoom(String id) throws IdAlreadyExistsException {
        Facility room = new Room(id);
        if(id.matches(REGEX_ID_ROOM)){
            room = facilityRepository.getFacilityById(id);
            if(room == null){
                return true;
            }
            else {
                throw  new IdAlreadyExistsException("Id already exist. Re-enter id, please.");
            }
        }
        else {
            System.out.println("Wrong format. Re-enter id, please.");
            return false;
        }
    }

    public static boolean validateIDRoomToRemove (String id) throws IdNotFoundException{
        Facility room = new Room(id);
        if(id.matches(REGEX_ID_ROOM)){
            room = facilityRepository.getFacilityById(id);
            if(room != null){
                return true;
            }
            else {
                throw  new IdNotFoundException("Id not found. Re-enter id, please.");
            }
        }
        else {
            System.out.println("Wrong format. Re-enter id, please.");
            return false;
        }
    }
}
