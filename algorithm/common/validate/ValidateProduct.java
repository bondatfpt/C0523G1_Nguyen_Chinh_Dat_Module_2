package algorithm.common.validate;

import algorithm.model.Product;
import algorithm.repo.IRepo;
import algorithm.repo.Repository;
import algorithm.utils.exception.IdAlreadyExistException;
import algorithm.utils.exception.IdNotFoundException;
import algorithm.utils.exception.NameProductAlreadyExistException;

public class ValidateProduct {
    private static final String REGEX_ID = "^DELL-[0-9]{4}";
    private static final String REGEX_NAME = "^[A-Z]{1}[a-z]*\s[A-Z]{1}[a-z]*$";
    private static IRepo repo = new Repository();
    public static boolean validateIdToAdd (String id) throws IdAlreadyExistException{
        if (id.matches(REGEX_ID)){
            Product product = repo.getProductById(id);
            if(product == null){
                return true;
            }
            else {
                throw  new IdAlreadyExistException("Id already exist.Re-enter,please");
            }
        }else {
            System.out.println("Wrong format.Re-enter,please.");
            return false;
        }
    }

    public static boolean validateIdToRemoveOrUpDate (String id) throws IdNotFoundException {
        if (id.matches(REGEX_ID)){
            Product product = repo.getProductById(id);
            if(product != null){
                return true;
            }
            else {
                throw  new IdNotFoundException("Id not found.Re-enter,please");
            }
        }else {
            System.out.println("Wrong format.Re-enter,please.");
            return false;
        }
    }

    public static boolean validateName(String name) throws NameProductAlreadyExistException {
        if(name.matches(REGEX_NAME)){
            Product product = repo.getProductByName(name);
            if(product == null){
                return true;
            }
            else {
                throw new NameProductAlreadyExistException("Name already exist.Re-enter, please");
            }
        }
        else {
            System.out.println("Wrong format. Re-enter, please");
            return false;
        }
    }

}
