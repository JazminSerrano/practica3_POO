import java.util.*;

public class Entrada{

    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);
        int entero;
        do{
        System.out.print(""+msg+": ");
        entero = sc.nextInt();
        }while(!Validacion.validarEntero(Integer.toString(entero)));
        return entero;
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

    public static int capturarOpcionMenu(String msg,int numOp){
        String opcion="";
	    System.out.print(msg+"\n");
        do{
            opcion = capturarCadena("Opcion");
            if(!Validacion.validarEntero(opcion)||Integer.parseInt(opcion)>numOp)
                System.out.print("Ingrese una opcion numerica del menu.");
        }while(!Validacion.validarEntero(opcion)||Integer.parseInt(opcion)>numOp);
        return (Integer.parseInt(opcion));
    }
}
