package case_study_module_2.furama_resort.service.facility_service;

import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner input = new Scanner(System.in);
    IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void display() {
        Map <Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        facilityIntegerMap = facilityRepository.getAllFacility();
        System.out.println(facilityIntegerMap);
    }

    @Override
    public void add() {
        int choice = 0;
        do{
            System.out.println("1.Add new Villa");
            System.out.println("2.Add new House");
            System.out.println("3.Add new Room");
            System.out.println("4.Back to menu");
            try {
                choice = Integer.parseInt(input.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Enter a id");
                        String id ;
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
            }catch (NumberFormatException numberFormatException){
                System.out.println("Enter a number to choice");
            }
        }while (choice != 4);

    }

    @Override
    public void delete() {

    }
}
