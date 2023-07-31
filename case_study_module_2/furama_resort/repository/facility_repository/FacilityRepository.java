package case_study_module_2.furama_resort.repository.facility_repository;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.House;
import case_study_module_2.furama_resort.model.facility.Room;
import case_study_module_2.furama_resort.model.facility.Villa;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {

    private static Map <Facility,Integer> facilityList = new LinkedHashMap<>();

    static {
        House house = new House("SVHO-0001","family",100,1000,10,"day","VIP",1);
        Room room = new Room("SVRO-0001","single",50,500,4,"hour","soft drink");
        Villa villa = new Villa("SVVL-0001","DatVilla",1000,5000,10,"month","VIP",100,3);
        facilityList.put(house,1);
        facilityList.put(room,1);
        facilityList.put(villa,1);
    }

    @Override
    public Map<Facility, Integer> getAllFacility() {
        return facilityList;
    }
    @Override
    public void add(Facility facility) {
        facilityList.put(facility,0);
    }
    @Override
    public void delete(Facility facility) {
        facilityList.remove(facility);
    }

    @Override
    public Facility getFacilityById(String id) {
        return null;
    }
}
