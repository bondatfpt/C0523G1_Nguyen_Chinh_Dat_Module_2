package case_study_module_2.furama_resort.service.facility_service;

import case_study_module_2.furama_resort.common.validate.validate_facility.ValidateFacility;
import case_study_module_2.furama_resort.common.validate.validate_facility.ValidateIdHouse;
import case_study_module_2.furama_resort.common.validate.validate_facility.ValidateIdRoom;
import case_study_module_2.furama_resort.common.validate.validate_facility.ValidateIdVilla;
import case_study_module_2.furama_resort.model.facility.Facility;
import case_study_module_2.furama_resort.model.facility.House;
import case_study_module_2.furama_resort.model.facility.Room;
import case_study_module_2.furama_resort.model.facility.Villa;
import case_study_module_2.furama_resort.repository.facility_repository.FacilityRepository;
import case_study_module_2.furama_resort.repository.facility_repository.IFacilityRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner input = new Scanner(System.in);
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        facilityIntegerMap = facilityRepository.getAllFacility();
        System.out.println(facilityIntegerMap);
    }

    @Override
    public void add() {
        int choice = 0;
        do {
            System.out.println("1.Add new Villa");
            System.out.println("2.Add new House");
            System.out.println("3.Add new Room");
            System.out.println("4.Back to menu");
            try {
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter an id in the format SVVL-XXXX(X is number 0-9)");
                        String idVilla = "";
                        Facility villa = new Villa(idVilla);
                        boolean checkIdVilla = false;
                        do {
                            idVilla = input.nextLine();
                            try {
                                checkIdVilla = ValidateIdVilla.validateIdVilla(idVilla);
                            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                                System.out.println(idAlreadyExistsException.getMessage());
                            }

                        } while (!checkIdVilla);

                        System.out.println("Enter a name");
                        String nameVilla = "";
                        boolean checkNameVilla = false;
                        do {
                            nameVilla = input.nextLine();
                            checkNameVilla = ValidateFacility.validateNameService(nameVilla);
                        } while (!checkNameVilla);

                        System.out.println("Enter usable are");
                        double usableAreaVilla = 0;
                        boolean checkUsableAreaVilla = false;
                        do {
                            try {
                                usableAreaVilla = Double.parseDouble(input.nextLine());
                                checkUsableAreaVilla = ValidateFacility.validateUsableArea(usableAreaVilla);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("The usable area must be a real number");
                            }
                        } while (!checkUsableAreaVilla);

                        System.out.println("Enter rental cost");
                        double rentalCostVilla = 0;
                        boolean checkRentalCostVilla = false;
                        do {
                            try {
                            rentalCostVilla = Double.parseDouble(input.nextLine());
                            checkRentalCostVilla = ValidateFacility.validateRentalCost(rentalCostVilla);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("The rental cost must be a real number");
                            }
                        }while (!checkRentalCostVilla);

                        System.out.println("Enter capacity");
                        int capacityVilla = 0;
                        boolean checkCapacityVilla = false;
                        do {
                            try {
                            capacityVilla = Integer.parseInt(input.nextLine());
                            checkCapacityVilla = ValidateFacility.validateCapacity(capacityVilla);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("The capacity must be a integer");
                            }
                        }while (!checkCapacityVilla);

                        System.out.println("Enter rental type");
                        String rentalTypeVilla = "";
                        boolean checkRentalTypeVilla = false;
                        do {
                            rentalTypeVilla = input.nextLine();
                            checkRentalTypeVilla = ValidateFacility.validateNameService(rentalTypeVilla);
                        }while (!checkRentalTypeVilla);

                        System.out.println("Enter room standard");
                        String roomStandardVilla = "";
                        boolean checkRoomStandardVilla = false;
                        do {
                            roomStandardVilla = input.nextLine();
                            checkRoomStandardVilla = ValidateFacility.validateNameService(roomStandardVilla);
                        }while (!checkRoomStandardVilla);

                        System.out.println("Enter pool area");
                        double poolAreaVilla = 0;
                        boolean checkPoolAreaVilla = false;
                        do {
                            try {
                            poolAreaVilla = Double.parseDouble(input.nextLine());
                            checkPoolAreaVilla = ValidateFacility.validateUsableArea(poolAreaVilla);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Pool area must be a integer");
                            }
                        }while (!checkPoolAreaVilla);

                        System.out.println("Enter number floors");
                        int numberFloorVilla = 0;
                        do {
                            try {
                            numberFloorVilla = Integer.parseInt(input.nextLine());
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Number floor must be a integer.");
                            }
                            if(numberFloorVilla <= 0){
                                System.out.println("Number floor must be greater than 0");
                            }
                        }while (numberFloorVilla <=0);

                        villa = new Villa(idVilla,nameVilla,usableAreaVilla,rentalCostVilla,capacityVilla,rentalTypeVilla,roomStandardVilla,poolAreaVilla,numberFloorVilla);
                        facilityRepository.add(villa);
                        break;
                    case 2:
                        System.out.println("Enter an id in the format SVHO-XXXX(X is number 0-9)");
                        String idHouse = "";
                        Facility house = new House(idHouse);
                        boolean checkIdHouse = false;
                        do {
                            idHouse = input.nextLine();
                            try {
                                checkIdHouse = ValidateIdHouse.validateIdHouse(idHouse);
                            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                                System.out.println(idAlreadyExistsException.getMessage());
                            }
                        }while (!checkIdHouse);

                        System.out.println("Enter a name");
                        String nameHouse = "";
                        boolean checkNameHouse = false;
                        do {
                            nameHouse = input.nextLine();
                            checkNameHouse = ValidateFacility.validateNameService(nameHouse);
                        }while (!checkNameHouse );

                        System.out.println("Enter usable are");
                        double usableAreHouse = 0;
                        boolean checkUsableAreHouse = false;
                        do {
                            try {
                                usableAreHouse = Double.parseDouble(input.nextLine());
                                checkUsableAreHouse = ValidateFacility.validateUsableArea(usableAreHouse);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Usable Are must be a real number");
                            }
                        }while (!checkUsableAreHouse);

                        System.out.println("Enter rental cost");
                        int rentalCostHouse = 0 ;
                        boolean checkRentalCostHouse = false;
                        do {
                            try {
                                rentalCostHouse = Integer.parseInt(input.nextLine());
                                checkRentalCostHouse = ValidateFacility.validateRentalCost(rentalCostHouse);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Rental cost must be a integer.");
                            }
                        }while (!checkRentalCostHouse);

                        System.out.println("Enter capacity");
                        int capacityHouse = 0;
                        boolean checkCapacityHouse = false;
                        do {
                            try {
                            capacityHouse = Integer.parseInt(input.nextLine());
                            checkCapacityHouse = ValidateFacility.validateCapacity(capacityHouse);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Capacity must be a integer");
                            }
                        }while (!checkCapacityHouse);

                        System.out.println("Enter rental type");
                        String rentalTypeHouse = "";
                        boolean checkRentalTypeHouse = false;
                        do {
                            rentalTypeHouse = input.nextLine();
                            checkRentalTypeHouse = ValidateFacility.validateNameService(rentalTypeHouse);
                        }while (!checkRentalTypeHouse);

                        System.out.println("Enter room standard");
                        String roomStandardHouse = "";
                        boolean checkRoomStandardHouse = false;
                        do {
                            roomStandardHouse = input.nextLine();
                            checkRoomStandardHouse = ValidateFacility.validateNameService(roomStandardHouse);
                        }while (!checkRoomStandardHouse);

                        System.out.println("Enter number floor");
                        int numberFloorHouse = 0;
                        do {
                            try {
                            numberFloorHouse = Integer.parseInt(input.nextLine());
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Number floor must be a integer");
                            }
                        }while (numberFloorHouse <= 0);
                        house = new House(idHouse,nameHouse,usableAreHouse,rentalCostHouse,capacityHouse,rentalTypeHouse,roomStandardHouse,numberFloorHouse);
                        facilityRepository.add(house);
                        break;
                    case 3:
                        System.out.println("Enter an id");
                        String idRoom ="";
                        Facility room = new Room(idRoom);
                        boolean checkIdRoom = false;
                        do {
                            idRoom = input.nextLine();
                            try {
                                checkIdRoom = ValidateIdRoom.validateIDRoom(idRoom);
                            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                                System.out.println(idAlreadyExistsException.getMessage());
                            }
                        }while (!checkIdRoom);

                        System.out.println("Enter a name");
                        String nameRoom = "";
                        boolean checkNameRoom = false;
                        do {
                            nameRoom = input.nextLine();
                            checkNameRoom = ValidateFacility.validateNameService(nameRoom);
                        }while (!checkNameRoom );

                        System.out.println("Enter usable area");
                        double usableAreaRoom = 0;
                        boolean checkUsableAreaRoom = false;
                        do {
                            try {
                            usableAreaRoom = Double.parseDouble(input.nextLine());
                            checkUsableAreaRoom = ValidateFacility.validateUsableArea(usableAreaRoom);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Usable area must be a real number");
                            }
                        }while (!checkUsableAreaRoom);

                        System.out.println("Enter rental cost");
                        double rentalCostRoom = 0;
                        boolean checkRentalCostRoom = false;
                        do {
                            try {
                            rentalCostRoom = Double.parseDouble(input.nextLine());
                            checkRentalCostRoom = ValidateFacility.validateRentalCost(rentalCostRoom);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Rental cost must be a real number");
                            }
                        }while (!checkRentalCostRoom);

                        System.out.println("Enter capacity");
                        int capacityRoom = 0;
                        boolean checkCapacityRoom = false;
                        do {
                            try {
                            capacityRoom = Integer.parseInt(input.nextLine());
                            checkCapacityRoom = ValidateFacility.validateCapacity(capacityRoom);
                            }catch (NumberFormatException numberFormatException){
                                System.out.println("Capacity must be a integer");
                            }
                        }while (!checkCapacityRoom);

                        System.out.println("Enter rental type");
                        String rentalTypeRoom = "";
                        boolean checkRentalTypeRoom = false;
                        do {
                            rentalTypeRoom = input.nextLine();
                            checkRentalTypeRoom = ValidateFacility.validateNameService(rentalTypeRoom);
                        }while (!checkRentalTypeRoom);

                        System.out.println("Enter free service");
                        String freeService = input.nextLine();

                        room = new Room(idRoom,nameRoom,usableAreaRoom,rentalCostRoom,capacityRoom,rentalTypeRoom,freeService);
                        facilityRepository.add(room);
                        break;
                    case 4:
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (choice != 4);
    }
    @Override
    public void delete() {


    }
}
