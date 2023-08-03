package case_study_module_2.furama_resort.repository.facility_repository;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.House;
import case_study_module_2.furama_resort.model.facility.Room;
import case_study_module_2.furama_resort.model.facility.Villa;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {

    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        House house = new House("SVHO-0001", "White House", 100, 1000, 10, "Day", "Vip", 1);
        Room room = new Room("SVRO-0001", "Single Room", 50, 500, 4, "Week", "Massage Thai");
        Villa villa = new Villa("SVVL-0001", "Dat Villa", 1000, 5000, 10, "Month", "Vip", 50, 3);
        facilityList.put(house, 1);
        facilityList.put(room, 6);
        facilityList.put(villa, 1);
    }

    @Override
    public Map<Facility, Integer> getAllFacility() {
        return facilityList;
    }

    @Override
    public void add(Facility facility) {
        facilityList.put(facility, 0);
    }

    @Override
    public void delete(Facility facility) {
        facilityList.remove(facility);
    }

    public Map<Facility, Integer> getFacilityNeedMaintenance() {
        Map<Facility, Integer> facilityNeedMaintenance = new LinkedHashMap<>();
            facilityList.forEach((Facility,Integer) ->{
                if (Integer >= 5 ){
                    facilityNeedMaintenance.put(Facility,Integer);
                }
            });
        return facilityNeedMaintenance;
    }

    @Override
    public Facility getFacilityById(String id) {
        for (Facility facility : facilityList.keySet()) {
            if (facility.getId().equals(id)) {
                return facility;
            }
        }
        return null;
    }

    public Facility getFacilityByName(String name){
        for (Facility facility: facilityList.keySet()) {
            if(facility.getName().equals(name)){
                return  facility;
            }
        }
        return null;
    }
}
