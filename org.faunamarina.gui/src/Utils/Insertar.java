package Utils;

import Entities.Animales;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**Con esta clase introducimos los datos en la bbdd.
 * @author Adri Contador
 */
public class Insertar {
    private Comprobador conectar;
    private Animales modelo;
    private Connection con;


    public Insertar(){
        conectar = new Comprobador();
        modelo = new Animales();
    }

    /**Este método implementa un try except mediante el cual introduce todos los getters de Animales, al finalizar nos
     * indica si se han insertado correctamente o no.
     */
    public void introducir(String tipoanimal, String especie, String habitat, String medida, String peso,
                           String profundidad, String tiemponavegacion, String numeroembarcaciones, String hora,
                           String sexo, String parasitos, String anzuelos){
            PreparedStatement ps;
            String sql;
            modelo.setTipoanimal(tipoanimal);
            modelo.setEspecie(especie);
            modelo.setHabitat(habitat);
            modelo.setMedida(medida);
            modelo.setPeso(peso);
            modelo.setProfundidad(profundidad);
            modelo.setTiemponavegacion(tiemponavegacion);
            modelo.setNumeroembarcaciones(numeroembarcaciones);
            modelo.setHora(hora);
            modelo.setSexo(sexo);
            modelo.setParasitos(parasitos);
            modelo.setAnzuelos(anzuelos);

            try{
                con = conectar.getConexion();
                sql = "insert into especiesmarinas(tipoanimal, especie, habitat, medida, peso, profundidad," +
                        " tiemponavegacion, numeroembarcaciones, hora, sexo, parasitos, presenciadeanzuelos)" +
                        " values(?,?,?,?,?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, modelo.getTipoanimal());
                ps.setString(2, modelo.getEspecie());
                ps.setString(3, modelo.getHabitat());
                ps.setString(4, modelo.getMedida());
                ps.setString(5, modelo.getPeso());
                ps.setString(6, modelo.getProfundidad());
                ps.setString(7, modelo.getTiemponavegacion());
                ps.setString(8,modelo.getNumeroembarcaciones());
                ps.setString(9,modelo.getHora());
                ps.setString(10,modelo.getSexo());
                ps.setString(11,modelo.getParasitos());
                ps.setString(12,modelo.getAnzuelos());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente.");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Fallo de conexión:" + e.getMessage());
            }
    }
}

