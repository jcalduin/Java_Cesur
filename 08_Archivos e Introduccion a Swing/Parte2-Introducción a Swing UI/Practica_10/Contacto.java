public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private String categoria;

    public Contacto(String nombre, String telefono, String email, String categoria) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+'\n' +
                "Telefono: "+telefono+'\n'+
                "E-mail: "+email+'\n' +
                "Categoria: "+categoria+'\n';
    }
}
