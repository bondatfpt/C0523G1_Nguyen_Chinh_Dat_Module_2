package case_study_module_2.furama_resort.common.validate.validate_facility;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.House;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;
import case_study_module_2.furama_resort.utils.exceptions.IdentityNumberAlreadyExistException;

public class ValidateIdHouse {
    private static final String REGEX_ID_HOUSE = "^SVHO-\\d{4}$";
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    public static boolean validateIdHouse (String id) throws IdAlreadyExistsException {
        Facility house = new House(id);
        if(id.matches(REGEX_ID_HOUSE)){
            house = facilityRepository.getFacilityById(id);
            if(house == null){
                return true;
            }else {
                throw new IdAlreadyExistsException("Id already exist. Re-enter id, please.");
            }
        }else {
            System.out.println("Wrong format. Re-enter id, please.");
            return false;
        }
    }

}
