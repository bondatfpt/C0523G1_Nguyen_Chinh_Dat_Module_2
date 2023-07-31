package case_study_module_2.furama_resort.utils.validate.validate_input_facility;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.House;
import case_study_module_2.furama_resort.model.facility.Villa;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;

import java.util.Map;
import java.util.Scanner;

public class ValidateIdVilla {
    private static final String REGEX_ID_VILLA = "^SVVL-[0-9]{4}$";
    private static final String REGEX_ID_HOUSE = "^SVHO-[0-9]{4}$";
    private static final String REGEX_ID_ROOM = "^SVRO-[0-9]{4}$";
    private static Scanner input = new Scanner(System.in);
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    public static boolean validateIdFacility(Facility facility, String id) throws IdAlreadyExistsException {
        boolean flag = false;
        do {
            if (facility == new Villa(id)) {
                if (id.matches(REGEX_ID_VILLA)) {
                    Facility facility1 = facilityRepository.getFacilityById(id);
                    if (facility1 == null) {
                        return true;
                    } else {
                        throw new IdAlreadyExistsException("Id already exits. Re-enter id, please.");
                    }
                } else {
                        flag = true;
                }
            }
        }while (flag);
        return false;
    }
}
