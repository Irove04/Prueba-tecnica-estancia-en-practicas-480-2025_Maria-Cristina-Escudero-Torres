public abstract class DiscoDuro extends Almacenamiento {
    public DiscoDuro(String nombre){
        super(nombre);
    }

    public void escribirDatos(){
        System.out.println("Escribo datos..");
    }
    public void leerDatos(){
        System.out.println("Leo datos..");
    }
    public void reportarDatos(){
        System.out.println("Reporto datos..");
    }
}
