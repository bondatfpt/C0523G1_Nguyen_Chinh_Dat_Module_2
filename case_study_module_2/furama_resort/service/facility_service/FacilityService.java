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
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner input = new Scanner(System.in);
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap = facilityRepository.getAllFacility();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + "\n " + " ---------------------------------------------------------" +
                    "Number of bookings: "
                    + entry.getValue() + " ----------------------------------------------------------");
        }
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

                        System.out.println("Enter a name of villa");
                        String nameVilla = "";
                        boolean checkNameVilla = false;
                        do {
                            nameVilla = input.nextLine();
                            checkNameVilla = ValidateFacility.validateNameService(nameVilla);
                        } while (!checkNameVilla);

                        System.out.println("Enter usable area");
                        double usableAreaVilla = 0;
                        boolean checkUsableAreaVilla = false;
                        do {
                            try {
                                usableAreaVilla = Double.parseDouble(input.nextLine());
                                checkUsableAreaVilla = ValidateFacility.validateUsableArea(usableAreaVilla);
                            } catch (NumberFormatException numberFormatException) {
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
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("The rental cost must be a real number");
                            }
                        } while (!checkRentalCostVilla);

                        System.out.println("Enter capacity");
                        int capacityVilla = 0;
                        boolean checkCapacityVilla = false;
                        do {
                            try {
                                capacityVilla = Integer.parseInt(input.nextLine());
                                checkCapacityVilla = ValidateFacility.validateCapacity(capacityVilla);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("The capacity must be a integer");
                            }
                        } while (!checkCapacityVilla);

                        System.out.println("Choose rental type Villa:");
                        System.out.println("1.Day");
                        System.out.println("2.Week");
                        System.out.println("3.Month");
                        System.out.println("4.Year");
                        String rentalTypeVilla = "";
                        int choiceRentalTypeVilla = 0;
                        do {
                            try {
                                choiceRentalTypeVilla = Integer.parseInt(input.nextLine());
                                switch (choiceRentalTypeVilla) {
                                    case 1:
                                        rentalTypeVilla = "Day";
                                        break;
                                    case 2:
                                        rentalTypeVilla = "Week";
                                        break;
                                    case 3:
                                        rentalTypeVilla = "Month";
                                        break;
                                    case 4:
                                        rentalTypeVilla = "Year";
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Enter a number to choice");
                            }
                        } while (rentalTypeVilla.equals(""));

                        System.out.println("Choose standard room villa:");
                        System.out.println("1.Super Vip");
                        System.out.println("2.Vip");
                        System.out.println("3.Normal");
                        String roomStandardVilla = "";
                        int choiceRoomStandardVilla = 0;
                        do {
                            try {
                                choiceRoomStandardVilla = Integer.parseInt(input.nextLine());
                                switch (choiceRoomStandardVilla) {
                                    case 1:
                                        roomStandardVilla = "Super Vip";
                                        break;
                                    case 2:
                                        roomStandardVilla = "Vip";
                                        break;
                                    case 3:
                                        roomStandardVilla = "Normal";
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Enter a number to choice");
                            }
                        } while (roomStandardVilla.equals(""));


                        System.out.println("Enter pool area");
                        double poolAreaVilla = 0;
                        boolean checkPoolAreaVilla = false;
                        do {
                            try {
                                poolAreaVilla = Double.parseDouble(input.nextLine());
                                checkPoolAreaVilla = ValidateFacility.validateUsableArea(poolAreaVilla);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Pool area must be a integer");
                            }
                        } while (!checkPoolAreaVilla);

                        System.out.println("Enter number floors");
                        int numberFloorVilla = 0;
                        do {
                            try {
                                numberFloorVilla = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Number floor must be a integer.");
                            }
                            if (numberFloorVilla <= 0) {
                                System.out.println("Number floor must be greater than 0");
                            }
                        } while (numberFloorVilla <= 0);

                        villa = new Villa(idVilla, nameVilla, usableAreaVilla, rentalCostVilla,
                                capacityVilla, rentalTypeVilla, roomStandardVilla, poolAreaVilla, numberFloorVilla);
                        facilityRepository.add(villa);
                        System.out.println("Successfully added a new villa have id : " + idVilla);
                        this.display();
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
                        } while (!checkIdHouse);

                        System.out.println("Enter a name");
                        String nameHouse = "";
                        boolean checkNameHouse = false;
                        do {
                            nameHouse = input.nextLine();
                            checkNameHouse = ValidateFacility.validateNameService(nameHouse);
                        } while (!checkNameHouse);

                        System.out.println("Enter usable are");
                        double usableAreHouse = 0;
                        boolean checkUsableAreHouse = false;
                        do {
                            try {
                                usableAreHouse = Double.parseDouble(input.nextLine());
                                checkUsableAreHouse = ValidateFacility.validateUsableArea(usableAreHouse);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Usable Are must be a real number");
                            }
                        } while (!checkUsableAreHouse);

                        System.out.println("Enter rental cost");
                        int rentalCostHouse = 0;
                        boolean checkRentalCostHouse = false;
                        do {
                            try {
                                rentalCostHouse = Integer.parseInt(input.nextLine());
                                checkRentalCostHouse = ValidateFacility.validateRentalCost(rentalCostHouse);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Rental cost must be a integer.");
                            }
                        } while (!checkRentalCostHouse);

                        System.out.println("Enter capacity");
                        int capacityHouse = 0;
                        boolean checkCapacityHouse = false;
                        do {
                            try {
                                capacityHouse = Integer.parseInt(input.nextLine());
                                checkCapacityHouse = ValidateFacility.validateCapacity(capacityHouse);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Capacity must be a integer");
                            }
                        } while (!checkCapacityHouse);

                        System.out.println("Choose rental type house");
                        System.out.println("1.Day");
                        System.out.println("2.Week");
                        System.out.println("3.Month");
                        System.out.println("4.Year");
                        String rentalTypeHouse = "";
                        int choiceRentalTypeHouse = 0;
                        do {
                            try {
                                choiceRentalTypeHouse = Integer.parseInt(input.nextLine());
                                switch (choiceRentalTypeHouse) {
                                    case 1:
                                        rentalTypeHouse = "Day";
                                        break;
                                    case 2:
                                        rentalTypeHouse = "Week";
                                        break;
                                    case 3:
                                        rentalTypeHouse = "Month";
                                        break;
                                    case 4:
                                        rentalTypeHouse = "Year";
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Enter a number to choice");
                            }
                        } while (rentalTypeHouse.equals(""));

                        System.out.println("Choose room standard house");
                        System.out.println("1.Super Vip");
                        System.out.println("2.Vip");
                        System.out.println("3.Normal");
                        String roomStandardHouse = "";
                        int choiceRoomStandardHouse = 0;
                        do {
                            try {
                                choiceRoomStandardHouse = Integer.parseInt(input.nextLine());
                                switch (choiceRoomStandardHouse) {
                                    case 1:
                                        roomStandardHouse = "Super Vip";
                                        break;
                                    case 2:
                                        roomStandardHouse = "Vip";
                                        break;
                                    case 3:
                                        roomStandardHouse = "Normal";
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Enter a number to choice");
                            }
                        } while (roomStandardHouse.equals(""));

                        System.out.println("Enter number floor");
                        int numberFloorHouse = 0;
                        do {
                            try {
                                numberFloorHouse = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Number floor must be a integer");
                            }
                        } while (numberFloorHouse <= 0);
                        house = new House(idHouse, nameHouse, usableAreHouse, rentalCostHouse,
                                capacityHouse, rentalTypeHouse, roomStandardHouse, numberFloorHouse);
                        facilityRepository.add(house);
                        System.out.println("Successfully added a new house have id : " + idHouse);
                        this.display();
                        break;
                    case 3:
                        System.out.println("Enter an id in the format SVRO-XXXX(X is number 0-9)");
                        String idRoom = "";
                        Facility room = new Room(idRoom);
                        boolean checkIdRoom = false;
                        do {
                            idRoom = input.nextLine();
                            try {
                                checkIdRoom = ValidateIdRoom.validateIDRoom(idRoom);
                            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                                System.out.println(idAlreadyExistsException.getMessage());
                            }
                        } while (!checkIdRoom);

                        System.out.println("Enter a name");
                        String nameRoom = "";
                        boolean checkNameRoom = false;
                        do {
                            nameRoom = input.nextLine();
                            checkNameRoom = ValidateFacility.validateNameService(nameRoom);
                        } while (!checkNameRoom);

                        System.out.println("Enter usable area");
                        double usableAreaRoom = 0;
                        boolean checkUsableAreaRoom = false;
                        do {
                            try {
                                usableAreaRoom = Double.parseDouble(input.nextLine());
                                checkUsableAreaRoom = ValidateFacility.validateUsableArea(usableAreaRoom);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Usable area must be a real number");
                            }
                        } while (!checkUsableAreaRoom);

                        System.out.println("Enter rental cost");
                        double rentalCostRoom = 0;
                        boolean checkRentalCostRoom = false;
                        do {
                            try {
                                rentalCostRoom = Double.parseDouble(input.nextLine());
                                checkRentalCostRoom = ValidateFacility.validateRentalCost(rentalCostRoom);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Rental cost must be a real number");
                            }
                        } while (!checkRentalCostRoom);

                        System.out.println("Enter capacity");
                        int capacityRoom = 0;
                        boolean checkCapacityRoom = false;
                        do {
                            try {
                                capacityRoom = Integer.parseInt(input.nextLine());
                                checkCapacityRoom = ValidateFacility.validateCapacity(capacityRoom);
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Capacity must be a integer");
                            }
                        } while (!checkCapacityRoom);

                        System.out.println("Enter rental type");
                        System.out.println("1.Day");
                        System.out.println("2.Week");
                        System.out.println("3.Month");
                        System.out.println("4.Year");
                        String rentalTypeRoom = "";
                        int choiceRentalTypeRoom = 0;
                        do {
                            try {
                                choiceRentalTypeRoom = Integer.parseInt(input.nextLine());
                                switch (choiceRentalTypeRoom) {
                                    case 1:
                                        rentalTypeRoom = "Day";
                                        break;
                                    case 2:
                                        rentalTypeRoom = "Week";
                                        break;
                                    case 3:
                                        rentalTypeRoom = "Month";
                                        break;
                                    case 4:
                                        rentalTypeRoom = "Year";
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Enter a number to choice");
                            }

                        } while (rentalTypeRoom.equals(""));

                        System.out.println("Choose free service");
                        System.out.println("1. Massage Thai");
                        System.out.println("2. Take A Hot Bath");
                        System.out.println("3. Eat Seafood");
                        String freeService = "";
                        int choiceFreeService = 0;
                        do {
                            try {
                                choiceFreeService = Integer.parseInt(input.nextLine());
                                switch (choiceFreeService) {
                                    case 1:
                                        freeService = "Massage Thai";
                                        break;
                                    case 2:
                                        freeService = "Take A Hot Bath";
                                        break;
                                    case 3:
                                        freeService = "Eat Seafood";
                                        break;
                                }
                            } catch (NumberFormatException numberFormatException) {
                                System.out.println("Enter a number to choice");
                            }
                        } while (freeService.equals(""));

                        room = new Room(idRoom, nameRoom, usableAreaRoom, rentalCostRoom,
                                capacityRoom, rentalTypeRoom, freeService);
                        facilityRepository.add(room);
                        System.out.println("Successfully added a new room have id : " + idRoom);
                        this.display();
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
        System.out.println("Enter an id in the format SV(VL|RO|HO)-XXXX(X is number 0-9)");
        boolean checkId = false;
        do {
            try {
                String id = input.nextLine();
                Facility facility = facilityRepository.getFacilityById(id);
                checkId = ValidateFacility.validateIdToRemove(id);
                if (checkId) {
                    int choiceDelete = 0;
                    do {
                        System.out.println("Do you really want to delete this facility?");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        try {
                            choiceDelete = Integer.parseInt(input.nextLine());
                            switch (choiceDelete) {
                                case 1:
                                    facilityRepository.delete(facility);
                                    System.out.println("Successful delete facility have name: " + facility.getName());
                                    display();
                                    break;
                                case 2:
                                    break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Enter a number to choice");
                        }
                    } while (choiceDelete != 1 && choiceDelete != 2);
                }
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        } while (!checkId);
    }

    public void displayFacilityNeedMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilityRepository.getFacilityNeedMaintenance().entrySet()) {
            System.out.println(entry.getKey() + "\n"+ "--------------------------------------------------------- " +
                    "Number of bookings: "
                    + entry.getValue() + "----------------------------------------------------------");
        }
    }
}
