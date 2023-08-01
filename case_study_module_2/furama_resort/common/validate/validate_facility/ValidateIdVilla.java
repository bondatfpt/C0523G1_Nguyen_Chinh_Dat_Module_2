package case_study_module_2.furama_resort.common.validate.validate_facility;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.Villa;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;

public class ValidateIdVilla {
    private static final String REGEX_ID_VILLA = "^SVVL-\\d{4}$";
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    public static boolean validateIdVilla(String id) throws IdAlreadyExistsException {
       Facility villa = new Villa(id);
        if (id.matches(REGEX_ID_VILLA)) {
            villa = facilityRepository.getFacilityById(id);
            if (villa != null) {
                throw new IdAlreadyExistsException("Id already exits. Re-enter id, please.");
            } else {
                return true;
            }
        } else {
            System.out.println("Wrong format, Re-enter id, please.");
            return false;
        }
    }
}

