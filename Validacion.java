public class Validacion{
    public static boolean validarEntero(String str){
        return str != null && str.matches("[-+]?\\d*\\d+");
    }
    public static boolean validarDecimal(String str){
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
    public static boolean validarPalabra(String str){
        return str != null && str.matches("[a-zA-Z]+");
    }
    public static boolean validarVocal(String str){
        return str != null && str.matches("[aeiou]+");
    }
    public static boolean validarConsonante(String str){
        return str != null && str.matches("[b-df-hj-np-tv-z]+");
    }
}
