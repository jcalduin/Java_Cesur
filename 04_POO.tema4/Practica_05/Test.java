package Practica_05;

public class Test {
    public static void main(String[] args) {

        PuestoTrabajo pt1 = new PuestoTrabajo("PT01","Puesto de nivel A",2500);
        PuestoTrabajo pt2 = new PuestoTrabajo("PT02","Puesto de nivel B", 2000);
        PuestoTrabajo pt3 = new PuestoTrabajo("PT03","Puesto de nivel C",1500);

        Empleado e = new Empleado("101","Pepe","Grillo","c/flores","CP01","Málaga",pt1);
        Administrativo a = new Administrativo("102","Lola","Flores","c/lepanto","CP02","Cordoba",pt2,5);
        Consultor c = new Consultor("103","Armando","Paredes","c/ parauta","CP03","Mallorca",pt3,"adjunto");

        e.getAtributos();
        a.getAtributos();
        c.getAtributos();
    }
}
