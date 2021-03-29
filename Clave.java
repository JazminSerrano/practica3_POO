import java.util.regex.*;
import java.util.*;

public class Clave{
    public static String determinarPrimerLetra(String str){
        if( str.matches("[A-Z]{1,3}\\s+[A-Z]{1,}") ){
            //comprueba casos de nombres compuestos
            String[] divisor = str.split("\\s");
            return Character.toString(divisor[1].charAt(0));
        }else
            if( str.matches("[A-Z]{1,3}\\s+[A-Z]{1,3}\\s+[A-Z]{1,}") ){
                String[] divisor = str.split("\\s");
                return Character.toString(divisor[2].charAt(0));
            }else{
                String primerLetra = Character.toString(str.charAt(0));
                if( primerLetra.matches("\\p{Punct}")||primerLetra.matches("Ñ") )
                    return "X";
                else
                    return primerLetra;
            }
    }
    public static char determinarPrimerVocal(String str){
        if( str.matches("[A-Z]{1,3}\\s+[A-Z]{1,}") ){
            //comprueba casos de nombres compuestos
            String[] divisor = str.split("\\s");
            Pattern pattern = Pattern.compile("[AEIOU]");
            Matcher matcher = pattern.matcher(divisor[1]);
            if(matcher.find(1)) //comenzara la busqueda en la posicion [1]
                return divisor[1].charAt(matcher.start());
            else
                return 'X';
        }else
            if( str.matches("[A-Z]{1,3}\\s+[A-Z]{1,3}\\s+[A-Z]{1,}") ){
                String[] divisor = str.split("\\s");
                Pattern pattern = Pattern.compile("[AEIOU]");
                Matcher matcher = pattern.matcher(divisor[2]);
                if(matcher.find(1))
                    return divisor[2].charAt(matcher.start());
                else
                    return 'X';
            }else{
                Pattern pattern = Pattern.compile("[AEIOU]");
                Matcher matcher = pattern.matcher(str);
                if(matcher.find(1))
                    return str.charAt(matcher.start());
                else
                    return 'X';
            }
    }
    public static char determinarPrimerConsonante(String str){
        if( str.matches("[A-Z]{1,3}\\s+[A-Z]{1,}") ){
            //comprueba casos de nombres compuestos
            String[] divisor = str.split("\\s");
            Pattern pattern = Pattern.compile("[A-Z&&[^AEIOU]]");
            Matcher matcher = pattern.matcher(divisor[1]);
            if(matcher.find(1)) //comenzara la busqueda en la posicion [1]
                return divisor[1].charAt(matcher.start());
            else
                return 'X';
        }else
            if( str.matches("[A-Z]{1,3}\\s+[A-Z]{1,3}\\s+[A-Z]{1,}") ){
                String[] divisor = str.split("\\s");
                Pattern pattern = Pattern.compile("[A-Z&&[^AEIOU]]");
                Matcher matcher = pattern.matcher(divisor[2]);
                if(matcher.find(1))
                    return divisor[2].charAt(matcher.start());
                else
                    return 'X';
            }else{
                Pattern pattern = Pattern.compile("[A-Z&&[^AEIOU]]");
                Matcher matcher = pattern.matcher(str);
                if(matcher.find(1))
                    return str.charAt(matcher.start());
                else
                    return 'X';
            }
    }
    public static char calcularLetraAleatoria(){
        Random gen = new Random();
        switch(gen.nextInt(26)){
        case 0: return 'A';
        case 1: return 'B';
        case 2: return 'C';
        case 3: return 'D';
        case 4: return 'E';
        case 5: return 'F';
        case 6: return 'G';
        case 7: return 'H';
        case 8: return 'I';
        case 9: return 'J';
        case 10: return 'K';
        case 11: return 'L';
        case 12: return 'M';
        case 13: return 'N';
        case 14: return 'O';
        case 15: return 'P';
        case 16: return 'Q';
        case 17: return 'R';
        case 18: return 'S';
        case 19: return 'T';
        case 20: return 'U';
        case 21: return 'V';
        case 22: return 'W';
        case 23: return 'X';
        case 24: return 'Y';
        case 25: return 'Z';
        }
        return 'X';
    }

    public static String calcularCURP(Persona persona){
        String curp="";
        String anio,mes,dia;
        //primer letra del primer apellido
        curp+=determinarPrimerLetra(persona.getPrimerAp());
        //primer vocal del primer apellido
        curp+=determinarPrimerVocal(persona.getPrimerAp());
        //primer letra del segundo apellido
        if(persona.getSegundoAp()!=null)
            curp+=determinarPrimerLetra(persona.getSegundoAp());
        else
            curp+='X';
        //primer letra del primer nombre
        if((persona.getPrimerNom()=="MARIA")||(persona.getPrimerNom()=="MA")||(persona.getPrimerNom()=="MA.")||(persona.getPrimerNom()=="JOSE")||(persona.getPrimerNom()=="J")||(persona.getPrimerNom()=="J."))
            curp+=determinarPrimerLetra(persona.getSegundoNom());
        else
            curp+=determinarPrimerLetra(persona.getPrimerNom());
        //fecha de nacimiento AA/MM/DD
        if( (persona.getAnioNac()%100)<10 )
            anio = "0"+Integer.toString(persona.getAnioNac()%100);
        else
            anio = Integer.toString(persona.getAnioNac()%100);

        if(persona.getMesNac()<10)
            mes = "0"+Integer.toString(persona.getMesNac());
        else
            mes = Integer.toString(persona.getMesNac());

        if(persona.getDiaNac()<10)
            dia = "0"+Integer.toString(persona.getDiaNac());
        else
            dia = Integer.toString(persona.getDiaNac());

        curp = curp+anio+mes+dia;
        //sexo H o M
        if(persona.getSexo()=="HOMBRE")
            curp+='H';
        else
            curp+='M';
        //estado de nacimiento EE
        switch(persona.getEstadoNac()){
        case "AGUASCALIENTES":
            curp+="AS"; break;
        case "BAJA CALIFORNIA":
            curp+="BC"; break;
        case "BAJA CALIFORNIA SUR":
            curp+="BS"; break;
        case "CAMPECHE":
            curp+="CC"; break;
        case "COAHUILA":
            curp+="CL"; break;
        case "COLIMA":
            curp+="CM"; break;
        case "CHIAPAS":
            curp+="CS"; break;
        case "CHIHUAHUA":
            curp+="CH"; break;
        case "CIUDAD DE MEXICO":
        case "DISTRITO FEDERAL":
            curp+="DF"; break;
        case "DURANGO":
            curp+="DG"; break;
        case "GUANAJUATO":
            curp+="GT"; break;
        case "GUERRERO":
            curp+="GR"; break;
        case "HIDALGO":
            curp+="HG"; break;
        case "JALISCO":
            curp+="JC"; break;
        case "MEXICO":
            curp+="MC"; break;
        case "MICHOACAN":
            curp+="MN"; break;
        case "MORELOS":
            curp+="MS"; break;
        case "NAYARIT":
            curp+="NT"; break;
        case "NUEVO LEON":
            curp+="NL"; break;
        case "OAXACA":
            curp+="OC"; break;
        case "PUEBLA":
            curp+="PL"; break;
        case "QUERETARO":
            curp+="QT"; break;
        case "QUINTANA ROO":
            curp+="QR"; break;
        case "SAN LUIS POTOSI":
            curp+="SP"; break;
        case "SINALOA":
            curp+="SL"; break;
        case "SONORA":
            curp+="SR"; break;
        case "TABASCO":
            curp+="TC"; break;
        case "TAMAULIPAS":
            curp+="TS"; break;
        case "TLAXCALA":
            curp+="TL"; break;
        case "VERACRUZ":
            curp+="VZ"; break;
        case "YUCATAN":
            curp+="YN"; break;
        case "ZACATECAS":
            curp+="ZS"; break;
        case "EXTRANJERO":
        case "NACIDO EN EL EXTRANJERO":
            curp+="NE";
        }
        //primeras consonantes internas del primer apellido, segundo apellido y nombre
        curp+=determinarPrimerConsonante(persona.getPrimerAp());

        if(persona.getSegundoAp()!=null)
            curp+=determinarPrimerConsonante(persona.getSegundoAp());
        else
            curp+='X';

        if((persona.getPrimerNom()=="MARIA")||(persona.getPrimerNom()=="MA")||(persona.getPrimerNom()=="MA.")||(persona.getPrimerNom()=="JOSE")||(persona.getPrimerNom()=="J")||(persona.getPrimerNom()=="J."))
            curp+=determinarPrimerConsonante(persona.getSegundoNom());
        else
            curp+=determinarPrimerConsonante(persona.getPrimerNom());
        //diferenciador de homonimia y siglo
        Random gen = new Random();
        if( persona.getAnioNac()>2000 )
            curp+=calcularLetraAleatoria();
        else
            curp+=Integer.toString(gen.nextInt(10));
        //digito verificador
        curp+=Integer.toString(gen.nextInt(10));

        return curp;
    }
    public static String calcularRFC(Persona persona){
        String rfc="";
        String anio,mes,dia;
        //primer letra del primer apellido
        rfc+=determinarPrimerLetra(persona.getPrimerAp());
        //primer vocal del primer apellido
        rfc+=determinarPrimerVocal(persona.getPrimerAp());
        //primer letra del segundo apellido
        if(persona.getSegundoAp()!=null)
            rfc+=determinarPrimerLetra(persona.getSegundoAp());
        else
            rfc+='X';
        //primer letra del primer nombre
        if((persona.getPrimerNom()=="MARIA")||(persona.getPrimerNom()=="MA")||(persona.getPrimerNom()=="MA.")||(persona.getPrimerNom()=="JOSE")||(persona.getPrimerNom()=="J")||(persona.getPrimerNom()=="J."))
            rfc+=determinarPrimerLetra(persona.getSegundoNom());
        else
            rfc+=determinarPrimerLetra(persona.getPrimerNom());
        //fecha de nacimiento AA/MM/DD
        if( (persona.getAnioNac()%100)<10 )
            anio = "0"+Integer.toString(persona.getAnioNac()%100);
        else
            anio = Integer.toString(persona.getAnioNac()%100);

        if(persona.getMesNac()<10)
            mes = "0"+Integer.toString(persona.getMesNac());
        else
            mes = Integer.toString(persona.getMesNac());

        if(persona.getDiaNac()<10)
            dia = "0"+Integer.toString(persona.getDiaNac());
        else
            dia = Integer.toString(persona.getDiaNac());

        rfc = rfc+anio+mes+dia;
        //clave diferenciadora de homonimia
        rfc = rfc+calcularLetraAleatoria()+calcularLetraAleatoria()+calcularLetraAleatoria();
        return rfc;
    }
}
