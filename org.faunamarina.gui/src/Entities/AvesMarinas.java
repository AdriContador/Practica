package Entities;

/**Esta clase, AvesMarinas es una subclase de Animales, por lo tanto hereda de ella, no uso esta clase por lo explicado
 * anteriormente en la clase Animales.
 */
public class AvesMarinas extends Animales {
    private String especie, habitat, medida, peso, profundidad, tiemponavegacion, numeroembarcaciones, hora,
            sexo, parasitos, anzuelos;//Estos son los atributos de la clase AvesMarinas.

    public AvesMarinas(String especie, String habitat, String medida, String peso, String profundidad,
                       String tiemponavegacion, String numeroembarcaciones, String hora, String sexo,
                       String parasitos, String anzuelos) {
        this.especie = getEspecie();
        this.medida = getMedida();
        this.peso = getPeso();
        this.habitat = getHabitat();
        this.profundidad = getProfundidad();
        this.tiemponavegacion = getTiemponavegacion();
        this.numeroembarcaciones = getNumeroembarcaciones();
        this.hora = getHora();
        this.sexo = getSexo();
        this.parasitos = getParasitos();
        this.anzuelos = getAnzuelos();
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    } //Esto es un setter para modificar o establecer el valor del atributo especie.
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    } //Esto es un setter para modificar o establecer el valor del atributo habitat.
    public void setMedida(String medida) {
        this.medida = medida;
    } //Esto es un setter para modificar o establecer el valor del atributo medida.
    public void setPeso(String  peso) {
        this.peso = peso;
    } //Esto es un setter para modificar o establecer el valor del atributo peso.
    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    } //Esto es un setter para modificar o establecer el valor del atributo profundidad.
    public void setTiemponavegacion(String tiemponavegacion) {
        this.tiemponavegacion = tiemponavegacion;
    } //Esto es un setter para modificar o establecer el valor del atributo tiemponavegacion.
    public void setNumeroembarcaciones(String numeroembarcaciones) {
        this.numeroembarcaciones = numeroembarcaciones;
    } //Esto es un setter para modificar o establecer el valor del atributo numeroembarcaciones.
    public void setHora(String hora) {
        this.hora = hora;
    } //Esto es un setter para modificar o establecer el valor del atributo hora.
    public void setSexo(String sexo) {
        this.sexo = sexo;
    } //Esto es un setter para modificar o establecer el valor del atributo sexo.
    public void setParasitos(String parasitos) {
        this.parasitos = parasitos;
    } //Esto es un setter para modificar o establecer el valor del atributo parasitos.
    public void setAnzuelos(String anzuelos) {
        this.anzuelos = anzuelos;
    } //Esto es un setter para modificar o establecer el valor del atributo anzuelos.
    public String getEspecie() {
        return especie;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getHabitat() {
        return habitat;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getMedida() {
        return medida;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getPeso() {
        return peso;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getProfundidad() {
        return profundidad;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getTiemponavegacion() {
        return tiemponavegacion;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getNumeroembarcaciones() {
        return numeroembarcaciones;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getHora() {
        return hora;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getSexo() {
        return sexo;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getParasitos() {
        return parasitos;
    } //Esto es un getter para devolver el valor de esta instancia.
    public String getAnzuelos() {
        return anzuelos;
    } //Esto es un getter para devolver el valor de esta instancia.

}

