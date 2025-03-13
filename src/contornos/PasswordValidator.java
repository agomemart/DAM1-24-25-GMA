package contornos;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password.length() < 8) { //Quito el igual para que ssi son menores a 8 caracteres no valgan
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) { //Cambio a upper case para que se compruebe si hay letras mayúsculas
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true; //Cambio a true
            }
        }
        return hasUpperCase && hasDigit; //Cambio a and para que se cumplan las dos condiciones
    }
}