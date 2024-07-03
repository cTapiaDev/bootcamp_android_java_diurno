package clase15;

public class Gryffindor extends Estudiante implements IConjuros, IMaldicionesImperdonables {
    
    private String nombreCasa;
    private String colorCasa;
    private String emblemaCasa;

    public Gryffindor() {
    }

    public Gryffindor(
            String nombreCasa, 
            String colorCasa, 
            String emblemaCasa, 
            String nombre, 
            String apellido, 
            int edad, 
            String tipoSangre
    ) {
        super(nombre, apellido, edad, tipoSangre);
        this.nombreCasa = nombreCasa;
        this.colorCasa = colorCasa;
        this.emblemaCasa = emblemaCasa;
    }

    public String getNombreCasa() {
        return nombreCasa;
    }

    public void setNombreCasa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

    public String getColorCasa() {
        return colorCasa;
    }

    public void setColorCasa(String colorCasa) {
        this.colorCasa = colorCasa;
    }

    public String getEmblemaCasa() {
        return emblemaCasa;
    }

    public void setEmblemaCasa(String emblemaCasa) {
        this.emblemaCasa = emblemaCasa;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + "nombreCasa=" + nombreCasa + ", colorCasa=" + colorCasa + ", emblemaCasa=" + emblemaCasa + '}';
    }

    @Override
    public void levitar() {
        // Bloque de codigo del metodo
    }

    @Override
    public void accio() {
        // Bloque de codigo del metodo
    }

    @Override
    public String avadaKedavra() {
        // Bloque de codigo del metodo
        String cadena = "avadaKedavra";
        return cadena;
    }

    
    
    
    
    
    
    
    
    
}
