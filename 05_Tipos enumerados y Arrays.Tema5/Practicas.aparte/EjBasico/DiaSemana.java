package EjBasico;

public class DiaSemana {
    private DiasDeLaSemana dia;

    public DiaSemana(String dia) {
        this.dia = DiasDeLaSemana.valueOf(dia.toUpperCase());
    }

    public void diaDeLaSemana() {

        switch (dia) {
            case LUNES, MARTES, MIERCOLES,JUEVES,VIERNES -> System.out.println(dia+ " es un día laboral");
            case SABADO,DOMINGO -> System.out.println(dia + " es fin de semana");
            default -> System.out.println(dia + " no es un día de la semana");
        }
    }
}
