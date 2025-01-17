public abstract class Almacenamiento {
    private String nombre;

    public Almacenamiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void escribirDatos();
    public abstract void leerDatos();
    public void reportarDatos(){
        System.out.println();
    }
    public abstract void girar();
    public abstract void contenido();
    public abstract String tipoDeDisco();
}



