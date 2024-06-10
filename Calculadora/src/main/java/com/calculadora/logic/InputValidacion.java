package main.java.com.calculadora.logic;

public class InputValidacion {

    public static boolean areAllFieldsFilled(String... fields) {
        for (String field : fields) {
            if (field.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAllFieldsValidNumbers(String... fields) {
        try {
            for (String field : fields) {
                Integer.parseInt(field);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
