public class Persona{
    String primer_nom;
    String segundo_nom;
    String primer_ap;
    String segundo_ap;
    String curp;
    String rfc;
    int dia_nac;
    int mes_nac;
    int anio_nac;
    String estado_nac;
    String sexo;

    public Persona(String primerNom,String segundoNom,String primerAp,String segundoAp,int anioNac,int mesNac,int diaNac,String estadoNac,String sexo){
        primer_nom = primerNom;
        segundo_nom = segundoNom;
        primer_ap = primerAp;
        segundo_ap = segundoAp;
        dia_nac = diaNac;
        mes_nac = mesNac;
        anio_nac = anioNac;
        estado_nac = estadoNac;
        this.sexo = sexo;
    }

    public Persona(){
    }

    public void setPrimerNom(String primerNom){
        primer_nom = primerNom;
    }
    public void setSegundoNom(String segundoNom){
        segundo_nom = segundoNom;
    }
    public void setPrimerAp(String primerAp){
        primer_ap = primerAp;
    }
    public void setSegundoAp(String segundoAp){
        segundo_ap = segundoAp;
    }
    public void setCURP(String curp){
        this.curp = curp;
    }
    public void setRFC(String rfc){
        this.rfc = rfc;
    }
    public void setDiaNac(int diaNac){
        dia_nac = diaNac;
    }
    public void setMesNac(int mesNac){
        mes_nac = mesNac;
    }
    public void setAnioNac(int anioNac){
        anio_nac = anioNac;
    }
    public void setEstadoNac(String estadoNac){
        estado_nac = estadoNac;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getPrimerNom(){
        return primer_nom;
    }
    public String getSegundoNom(){
        return segundo_nom;
    }
    public String getPrimerAp(){
        return primer_ap;
    }
    public String getSegundoAp(){
        return segundo_ap;
    }
    public String getCURP(){
        return curp;
    }
    public String getRFC(){
        return rfc;
    }
    public int getDiaNac(){
        return dia_nac;
    }
    public int getMesNac(){
        return mes_nac;
    }
    public int getAnioNac(){
        return anio_nac;
    }
    public String getEstadoNac(){
        return estado_nac;
    }
    public String getSexo(){
        return sexo;
    }
}
