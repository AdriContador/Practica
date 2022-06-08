package Panel;


import Utils.Insertar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**Esta clase está relacionada con la interfaz gráfica, tanto con la visualización, como con la recopilación de datos.
 * @author Adri Contador
 */
public class MyPanel extends JPanel {
    private JComboBox especie;
    private JComboBox habitat;
    private JComboBox parasitos;
    private JComboBox sexo;
    private JComboBox anzuelos;
    private JTextField tiempo;
    private JTextField profundidad;
    private JLabel especieeti;
    private JLabel habitateti;
    private JLabel profundidadeti;
    private JLabel tiempoeti;
    private JTextField hora;
    private JTextField nembarcaciones;
    private JLabel horaeti;
    private JLabel neti;
    private JLabel sexoeti;
    private JTextField medida;
    private JLabel medidaeti;
    private JTextField peso;
    private JLabel pesoeti;
    private JLabel presenciaeti;
    private JLabel parasitoseti;
    private JComboBox tipo;
    private JLabel tipoeti;
    private JButton enviarboton;

    /**
     * Este método genera la interfaz.
     */
    public MyPanel() {
        //construct preComponents
        String[] especieItems = {"Fraret atlantic", "Gavot", "Delphinus delphis", "Gymnura altavela", "Hexanchus griseus", "Coris julis", "Sarpa salpa"};
        String[] habitatItems = {"Agua salada", "Agua dulce", "Terrestre/aereo"};
        String[] parasitosItems = {"Si", "No"};
        String[] sexoItems = {"Macho", "Hembra"};
        String[] anzuelosItems = {"Si", "No"};
        String[] tipoItems = {"Aves marinas", "Mamiferos", "Peces", "Tiburones/mantas"};

        //construct components
        especie = new JComboBox (especieItems);
        habitat = new JComboBox (habitatItems);
        parasitos = new JComboBox (parasitosItems);
        sexo = new JComboBox (sexoItems);
        anzuelos = new JComboBox (anzuelosItems);
        tiempo = new JTextField(5);
        profundidad = new JTextField(5);
        especieeti = new JLabel("Especie");
        habitateti = new JLabel("Habitat");
        profundidadeti = new JLabel("Profundidad(m)");
        tiempoeti = new JLabel("Tiempo navegacion(min)");
        hora = new JTextField(5);
        nembarcaciones = new JTextField(5);
        horaeti = new JLabel("Hora de llegada");
        neti = new JLabel("Numero de embarcaciones");
        sexoeti = new JLabel("Sexo");
        medida = new JTextField(5);
        medidaeti = new JLabel("Medida(cm)");
        peso = new JTextField(5);
        pesoeti = new JLabel("Peso(kg)");
        presenciaeti = new JLabel("Presencia de anzuelos");
        parasitoseti = new JLabel("Parasitos");
        tipo = new JComboBox (tipoItems);
        tipoeti = new JLabel("Tipo de animal");
        enviarboton = new JButton("Enviar");

        //adjust size and set layout
        setPreferredSize(new Dimension(1180, 574));
        setLayout(null);

        //add components
        add(especie);
        add(habitat);
        add(parasitos);
        add(sexo);
        add(anzuelos);
        add(tiempo);
        add(profundidad);
        add(especieeti);
        add(habitateti);
        add(profundidadeti);
        add(tiempoeti);
        add(hora);
        add(nembarcaciones);
        add(horaeti);
        add(neti);
        add(sexoeti);
        add(medida);
        add(medidaeti);
        add(peso);
        add(pesoeti);
        add(presenciaeti);
        add(parasitoseti);
        add(tipo);
        add(tipoeti);
        add(enviarboton);

        //set component bounds (only needed by Absolute Positioning)
        especie.setBounds(205, 180, 100, 25);
        habitat.setBounds(425, 180, 100, 25);
        parasitos.setBounds(205, 460, 100, 25);
        sexo.setBounds(425, 390, 100, 25);
        anzuelos.setBounds(425, 460, 100, 25);
        tiempo.setBounds(205, 330, 100, 25);
        profundidad.setBounds(625, 260, 100, 25);
        especieeti.setBounds(205, 160, 100, 25);
        habitateti.setBounds(425, 160, 100, 25);
        profundidadeti.setBounds(625, 240, 100, 25);
        tiempoeti.setBounds(205, 310, 140, 20);
        hora.setBounds(205, 390, 100, 25);
        nembarcaciones.setBounds(425, 325, 100, 25);
        horaeti.setBounds(205, 370, 100, 25);
        neti.setBounds(425, 305, 155, 25);
        sexoeti.setBounds(425, 370, 100, 25);
        medida.setBounds(205, 260, 100, 25);
        medidaeti.setBounds(205, 240, 100, 25);
        peso.setBounds(425, 260, 100, 25);
        pesoeti.setBounds(425, 240, 125, 25);
        presenciaeti.setBounds(425, 440, 140, 25);
        parasitoseti.setBounds(205, 440, 100, 25);
        tipo.setBounds(205, 100, 100, 25);
        tipoeti.setBounds(205, 80, 100, 25);
        enviarboton.setBounds(625, 460, 100, 25);
        enviarboton.addActionListener(this::enviar);
    }

    /**Con este método conseguimos que cuando el usuario pulse el boton de enviar, los datos que ha introducido sean
     * recogidos i enviados a la bbdd.
     */
    private void enviar(ActionEvent actionEvent) {
        //Valores del selector
        String tipus = (String) tipo.getSelectedItem();

        String especies = (String) especie.getSelectedItem();

        String habitats = (String) habitat.getSelectedItem();

        String sexe = (String) sexo.getSelectedItem();

        String parasits = (String) parasitos.getSelectedItem();

        String ham = (String) anzuelos.getSelectedItem();

        //Introducción de datos por teclado
        String mesura = medida.getText();

        String pes = peso.getText();

        String profunditat = profundidad.getText();

        String temps = tiempo.getText();

        String nembarcacions = nembarcaciones.getText();

        String horaact = hora.getText();

        /**Gracias a insertar pasamos los datos que hay que introducir.
         *
         */
        Insertar con=new Insertar();
        con.introducir(tipus, especies, habitats, mesura, pes, profunditat, temps, nembarcacions, horaact,
                sexe, parasits, ham);
    }



}
