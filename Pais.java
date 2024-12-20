public class Pais {

    //atributos

    private String nombre;
    private int habitantes;
    private String idioma;
    private double geografia;
    private String continente;
    private boolean democracia;


    //static

    public static int numPaises=0;


    //constructores

    public Pais(){
        // este es el construcor por defecto para que no salte error
    }

    public Pais(String n, String i, String c){
        nombre = n;
        idioma = i;
        continente = c;
        numPaises++;
    }

    public Pais(String n){
        nombre = n;
        numPaises++;
    }

    public Pais(String n, int h, String i, double g, String c, boolean d){
        nombre = n;
        habitantes = h;
        idioma = i;
        geografia = g;
        continente = c;
        democracia = d;
        numPaises++;
    }

    //setters

    public void setnombre(String n){
        nombre = n;
    }
    public void setidioma(String i){
        idioma = i;
    }
    public void sethabitantes(int h){
        habitantes = h;
    }
    public void setgeografia(double g){
        geografia = g;
    }
    public void setcontinente(String c){
        continente = c;
    }
    public void setdemocracia(boolean d){
        democracia = d;
    }

    //getters

    public String getnombre(String n){

        return nombre;
    }
    public String getidioma(String i) {

        return idioma;
    }
    public int gethabitantes(int h){

        return habitantes;
    }
    public double getgeografia(double g){

        return geografia;
    }
    public String getcontinente(String c){

        return continente;
    }
    public boolean getdemocracia(boolean d){

        return democracia;
    }


    //metodos


    public void imprime_numero_habitantes(int h){
        habitantes = h;
        if(habitantes<10000){
            System.out.println("El numero de habitantes no supera los 10000");
        }else{
            System.out.println("El numero de habitantes es mayor de 10000");
        }
    }
    public void imprime_continente_geografia(String c, double g){
        System.out.println("El Pais se situa en el continente " + c);
        System.out.println("El Pais tiene una extension geografica de " + g + "km");
    }

    public void imprime_continente_pais(String n, String c){
        nombre = n;
        continente = c;
        System.out.println("El Pais " + n + " pertenece al continente " + c);

    }



//main

    public static void main(String[] args) {

        Pais c = new Pais();
        c.imprime_numero_habitantes(34500);
        c.imprime_continente_geografia("Europa", 1079.56);
        c.imprime_continente_pais("España", "Europa");

        //ejercicio3
        Pais c1 = new Pais();
        System.out.println("El nombre del pais es " + c1.getnombre("España"));
        Pais c2 = new Pais();
        System.out.println("La extension geografica de " + c1.getnombre("España") + " es de " + c2.getgeografia(1079.56) + " km");
        Pais c3 = new Pais();
        System.out.println("El numero de habitantes de " + c1.getnombre("España") + " es de " + c3.gethabitantes(34500));
        c3.gethabitantes(34500);

        //ejercicio5
        Pais cc = new Pais("España");
        System.out.println(cc.nombre);
        Pais ccc = new Pais("España", "español", "Europeo");
        System.out.println(ccc.nombre + " " + ccc.idioma + " " + ccc.continente);
        Pais cccc = new Pais("España", 34500, "español", 1079.56, "Europa", true);
        System.out.println(cccc.nombre + " " + cccc.habitantes + " " + cccc.idioma+ " "  + cccc.geografia
                + " " + cccc.continente + " " + cccc.democracia);



    }


}

