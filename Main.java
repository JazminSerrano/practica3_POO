public class Main{
	public static void main(String args[]){
	    Persona p1;
	    Persona p2;
	    Persona p3;
	    Persona p4;
	    int opcion;

        do{
	    opcion = Entrada.capturarOpcionMenu("\n.: Menu :.\n1.Mostrar ejemplos de CURP y RFC\n2.Calcular un CURP\n3.Calcular un RFC\n4.Salir",4);
        switch(opcion){
        case 1:
            p1 = new Persona("MARIA","LUISA","LOPES","ÑONEZ",1996,07,15,"TAMAULIPAS","MUJER");
            p2 = new Persona("JUAN","ALBERTO","DE LA VEGA","CORTEZ",2000,10,05,"BAJA CALIFORNIA SUR","HOMBRE");
            p3 = new Persona("CONCEPCION","","SALGADO","BRISEÑO",1956,06,26,"DISTRITO FEDERAL","MUJER");
            p1.setCURP(Clave.calcularCURP(p1));
            System.out.println("\nCURP de "+p1.getPrimerAp()+" "+p1.getSegundoAp()+" "+p1.getPrimerNom()+" "+p1.getSegundoNom()+"\n"+p1.getCURP());
            p2.setRFC(Clave.calcularRFC(p2));
            System.out.println("\nRFC de "+p2.getPrimerAp()+" "+p2.getSegundoAp()+" "+p2.getPrimerNom()+" "+p2.getSegundoNom()+"\n"+p2.getRFC());
            p3.setCURP(Clave.calcularCURP(p3));
            p3.setRFC(Clave.calcularRFC(p3));
            System.out.println("\nCURP de "+p3.getPrimerAp()+" "+p3.getSegundoAp()+" "+p3.getPrimerNom()+" "+p3.getSegundoNom()+"\n"+p3.getCURP());
            System.out.println("RFC de "+p3.getPrimerAp()+" "+p3.getSegundoAp()+" "+p3.getPrimerNom()+" "+p3.getSegundoNom()+"\n"+p3.getRFC());
            break;
        case 2:
            p4 = new Persona();
            System.out.println("\nIntroduzca los datos conforme se le soliciten, NO utilizar acentos o dieresis\n");
            p4.setPrimerNom(Entrada.capturarCadena("Primer Nombre").toUpperCase());
            p4.setSegundoNom(Entrada.capturarCadena("Segundo Nombre (en caso de NO existir dejar espacio en blanco)").toUpperCase());
            p4.setPrimerAp(Entrada.capturarCadena("Primer Apellido").toUpperCase());
            p4.setSegundoAp(Entrada.capturarCadena("Segundo Apellido (en caso de NO existir dejar espacio en blanco)").toUpperCase());
            p4.setAnioNac(Entrada.capturarEntero("Anio de Nacimiento (AAAA)"));
            p4.setMesNac(Entrada.capturarEntero("Mes de Nacimiento (MM)"));
            p4.setDiaNac(Entrada.capturarEntero("Dia de Nacimiento (DD)"));
            p4.setEstadoNac(Entrada.capturarCadena("Entidad Federativa de Nacimiento").toUpperCase());
            p4.setSexo(Entrada.capturarCadena("Sexo biologico (HOMBRE o MUJER)").toUpperCase());
            p4.setCURP(Clave.calcularCURP(p4));
            System.out.println("\nCURP "+p4.getCURP());
            break;
        case 3:
            p4 = new Persona();
            System.out.println("\nIntroduzca los datos conforme se le soliciten, NO utilizar acentos o dieresis\n");
            p4.setPrimerNom(Entrada.capturarCadena("Primer Nombre").toUpperCase());
            p4.setSegundoNom(Entrada.capturarCadena("Segundo Nombre (en caso de NO existir dejar espacio en blanco)").toUpperCase());
            p4.setPrimerAp(Entrada.capturarCadena("Primer Apellido").toUpperCase());
            p4.setSegundoAp(Entrada.capturarCadena("Segundo Apellido (en caso de NO existir dejar espacio en blanco)").toUpperCase());
            p4.setAnioNac(Entrada.capturarEntero("Anio de Nacimiento (AAAA)"));
            p4.setMesNac(Entrada.capturarEntero("Mes de Nacimiento (MM)"));
            p4.setDiaNac(Entrada.capturarEntero("Dia de Nacimiento (DD)"));
            p4.setRFC(Clave.calcularRFC(p4));
            System.out.println("\nRFC "+p4.getRFC());
            break;
        }
        }while(opcion!=4);
	}
}
