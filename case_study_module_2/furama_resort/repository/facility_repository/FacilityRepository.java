package case_study_module_2.furama_resort.repository.facility_repository;

import algorithm.Main;
import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.House;
import case_study_module_2.furama_resort.model.facility.Room;
import case_study_module_2.furama_resort.model.facility.Villa;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {

    private final static Map<Facility, Integer> facilityList = new TreeMap<>();

    static {
        Facility house = new House("SVHO-0001", "White House", 100, 1000, 10, "Day", "Vip", 1);
        Facility room = new Room("SVRO-0001","Single Room",100,500,1,"Day","Eat Seafood");
        Facility villa = new Villa("SVVL-0001","High Way",500,50000,20,"Year","Super Vip",100,5);
        facilityList.put(house,1);
        facilityList.put(room,2);
        facilityList.put(villa,5);
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
        Map<Facility, Integer> facilityNeedMaintenance = new TreeMap<>();
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
                return facility;
            }
        }
        return null;
    }
}
