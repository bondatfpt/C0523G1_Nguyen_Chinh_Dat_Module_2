package case_study_module_2.furama_resort.repository.facility_repository;

import case_study_module_2.furama_resort.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map <Facility, Integer> getAllFacility ();
    void add(Facility facility);
    void delete(Facility facility);
    Facility getFacilityById(String id);

}
