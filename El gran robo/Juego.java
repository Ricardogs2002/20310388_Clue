// RIGS 7E 20310388
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.awt.Font;
import java.awt.*;
import java.io.*;
class Juego extends JPanel implements ActionListener,ItemListener {
    Font fuente=new Font("Algerian",Font.BOLD,20);
    Font fuente1=new Font("Edwardian Script ITC",Font.PLAIN,40);
    Font fuente2=new Font("Arial",Font.PLAIN,18);
	public JButton botonR,botonS,botonP1,botonP2,botonP3,botonP4,botonP5,botonL1,botonL2,botonL3,botonL4,botonL5,botonE1,botonE2,botonE3,botonE4,botonE5;
    public JTextArea contexto;
    public JComboBox<String> acusoP,acusoL,acusoE;
    public int Intr = 0, Q = 0;
    public String a = "GameB.jpg",coso,sujeto,lugar,equipo,sujetoi,lugari,equipoi;
    public String[] s= new String[5];
    public String lore = "\n\n\nAlguien accedió a la bóveda en el subnivel de la villa \ndel señor Mikhail, al parecer hay varios puntos de \n  acceso y es tu trabajo descubrir qué sucedió\n exactamente";
    public Juego(){
        setLayout(null);
        setBackground(new Color(200, 242, 144));
        contexto = new JTextArea(lore);
        contexto.setFont(fuente);
        contexto.setEditable(false);
        contexto.setForeground(Color.YELLOW);
        contexto.setOpaque(false);
        contexto.setBounds(20,20,760,350);
        botonR = new JButton("Comprobar");
        botonR.setBounds(250,400,230,35);
        botonR.setFont(fuente);
        botonR.setVisible(false);
        botonS = new JButton("Siguiente");
        botonS.setBounds(633,530,150,30); //x, y, ancho, alto. Dentro del frame
        botonS.setFont(fuente1);
        botonP1 = new JButton("Ing. Dell");
        botonP1.setBounds(20,200,150,30);
        botonP1.setFont(fuente2);
        botonP1.setVisible(false);
        botonP2 = new JButton("Srta. Pauling");
        botonP2.setBounds(170,200,150,30);
        botonP2.setFont(fuente2);
        botonP2.setVisible(false);
        botonP3 = new JButton(" Expl. Jeremy");
        botonP3.setBounds(320,200,150,30);
        botonP3.setFont(fuente2);
        botonP3.setVisible(false);
        botonP4 = new JButton("Dr. Ludwig");
        botonP4.setBounds(470,200,150,30);
        botonP4.setFont(fuente2);
        botonP4.setVisible(false);
        botonP5 = new JButton("Sr. Mundy");
        botonP5.setBounds(620,200,150,30);
        botonP5.setFont(fuente2);
        botonP5.setVisible(false);
        botonL1 = new JButton("Taller");
        botonL1.setBounds(20,290,150,30);
        botonL1.setFont(fuente2);
        botonL1.setVisible(false);
        botonL2 = new JButton("Laboratorio");
        botonL2.setBounds(170,290,150,30);
        botonL2.setFont(fuente2);
        botonL2.setVisible(false);
        botonL3 = new JButton("Cocina");
        botonL3.setBounds(320,290,150,30);
        botonL3.setFont(fuente2);
        botonL3.setVisible(false);
        botonL4 = new JButton("Biblioteca");
        botonL4.setBounds(470,290,150,30);
        botonL4.setFont(fuente2);
        botonL4.setVisible(false);
        botonL5 = new JButton("Jardín");
        botonL5.setBounds(620,290,150,30);
        botonL5.setFont(fuente2);
        botonL5.setVisible(false);
        botonE1 = new JButton("Ganzúa");
        botonE1.setBounds(20,380,150,30);
        botonE1.setFont(fuente2);
        botonE1.setVisible(false);
        botonE2 = new JButton("Barra");
        botonE2.setBounds(170,380,150,30);
        botonE2.setFont(fuente2);
        botonE2.setVisible(false);
        botonE3 = new JButton("Tarjeta");
        botonE3.setBounds(320,380,150,30);
        botonE3.setFont(fuente2);
        botonE3.setVisible(false);
        botonE4 = new JButton(" Key-spoofing");
        botonE4.setBounds(470,380,150,30);
        botonE4.setFont(fuente2);
        botonE4.setVisible(false);
        botonE5 = new JButton("PEM");
        botonE5.setBounds(620,380,150,30);
        botonE5.setFont(fuente2);
        botonE5.setVisible(false);
        String[] optionsP = {"Personaje","Ing. Dell", "Srta. Pauling", "Expl. Jeremy", "Dr. Ludwig", "Sr. Mundy"};
        acusoP = new JComboBox<>(optionsP);
        acusoP.setBounds(200,150,150,30);
        acusoP.setFont(fuente2);
        acusoP.setVisible(false);
        String[] optionsL = {"Lugar","Taller", "Laboratorio", "Cocina", "Biblioteca", "Jardín"};
        acusoL = new JComboBox<>(optionsL);
        acusoL.setBounds(370,150,150,30);
        acusoL.setFont(fuente2);
        acusoL.setVisible(false);
        String[] optionsE = {"Equipo","Ganzúa", "Barra", "Tarjeta", "Key-spoofing", "PEM"};
        acusoE = new JComboBox<>(optionsE);
        acusoE.setBounds(540,150,150,30);
        acusoE.setFont(fuente2);
        acusoE.setVisible(false);

        add(contexto);
        add(botonR);
        add(botonS);
        add(botonP1);
        add(botonP2);
        add(botonP3);
        add(botonP4);
        add(botonP5);
        add(botonL1);
        add(botonL2);
        add(botonL3);
        add(botonL4);
        add(botonL5);
        add(botonE1);
        add(botonE2);
        add(botonE3);
        add(botonE4);
        add(botonE5);
        add(acusoP);
        add(acusoL);
        add(acusoE);
        botonR.addActionListener(this);
        botonS.addActionListener(this);
        botonP1.addActionListener(this);
        botonP2.addActionListener(this);
        botonP3.addActionListener(this);
        botonP4.addActionListener(this);
        botonP5.addActionListener(this);
        botonL1.addActionListener(this);
        botonL2.addActionListener(this);
        botonL3.addActionListener(this);
        botonL4.addActionListener(this);
        botonL5.addActionListener(this);
        botonE1.addActionListener(this);
        botonE2.addActionListener(this);
        botonE3.addActionListener(this);
        botonE4.addActionListener(this);
        botonE5.addActionListener(this);
        acusoP.addItemListener(this);
        acusoL.addItemListener(this);
        acusoE.addItemListener(this);

        try {
            backgroundImage = ImageIO.read(new File(a));  // Imagen a cambiar
            repaint();
        } catch (Exception e) {
        }
    }
    public void itemStateChanged(ItemEvent accion){
        sujeto = acusoP.getSelectedItem().toString();
        lugar = acusoL.getSelectedItem().toString();
        equipo = acusoE.getSelectedItem().toString();
    }
    public void actionPerformed(ActionEvent accion){
        if (accion.getSource() == botonR){
            coso = "Maletin.jpg";
            IMG(coso);
            Resultado();
        }
    	if (accion.getSource() == botonS){
            Intr++;
            coso = "GameB.jpg";
            if (Intr==1) {
                Rand();
                System.out.println(Intr);
                Lista();
                IMG(coso);
            }
            else if (Intr>1) {
                Q++;
                System.out.println("elseif");
                System.out.println(Q);
                Lista();
                IMG(coso);
                if(Q>=5){
                    Juicio();
                    coso = "Juicioe.jpg";
                    IMG(coso);
                }
            }
            else{
                System.out.println("else");
            }
        }
        if (accion.getSource() == botonP1){
            coso = "Dell.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Dell")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP2){
            coso = "Paulinge.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Pauling")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP3){
            coso = "Jeremye.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Jeremy")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP4){
            coso = "Dre.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Ludwig")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP5){
            coso = "Mundye.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Mundy")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL1){
            coso = "Tallere.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Taller")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL2){
            coso = "Labe.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Laboratorio")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL3){
            coso = "Cocinae.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Cocina")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL4){
            coso = "Biblioe.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Biblioteca")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL5){
            coso = "Jardin.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Jardín")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE1){
            coso = "Lockpicke.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Ganzúa")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE2){
            coso = "Crowbare.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Barra")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE3){
            coso = "Tarjeta.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Tarjeta")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE4){
            coso = "Keye.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Key-spoofing")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE5){
            coso = "PEMe.png";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("PEM")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
    }
    public void Rand(){
        switch(Main_EGR.r){
            case 1:
                System.out.println("caso 1");
                sujetoi = "Sr. Mundy";
                lugari = "Taller";
                equipoi = "Barra";
                s[0] = "\n\n\nLos sensores del Jardín detectaron las \ncredenciales del Dr. Ludwig, el registro de su \nalacena menciona una Barra que no se encuentra \nen ninguna parte";
                s[1] = "\n\n\nLas cámaras del Laboratorio observaron a la \nSrta. Pauling, tras una revisión se encontró la \nTarjeta de acceso en el lugar";
                s[2] = "\n\n\nEl Sr. Mundy dijo estar en la Cocina, las cámaras \nno lo vieron; entre los cajones se encontró un \nKey-spoofing";
                s[3] = "\n\n\nEl Ing. Dell mencionó estar en la Biblioteca, su \nnombre está en el registro; hay una Ganzúa cerca \nde la entrada";
                s[4] = "\n\n\nJeremy menciona que trabajó todo el tiempo en el \nTaller, los datos del lugar se perdieron pero \notros miembros confirman su acceso, el inventario \nmenciona un dispositivo PEM en el lugar";
            break;
            case 2:
                System.out.println("caso 2");
                sujetoi = "Srta. Pauling";
                lugari = "Laboratorio";
                equipoi = "Tarjeta";
                s[0] = "\n\n\nLos sensores del Jardín no detectaron las \ncredenciales de la Srta. Pauling que menciono \nestar en el lugar,  hay un kit de Ganzúa en \nla zona";
                s[1] = "\n\n\nLas cámaras del Laboratorio no funcionan pero una \nbitácora menciona a Jeremy en el lugar, tras una \nrevisión se encontró una Barra";
                s[2] = "\n\n\nEl Dr. Ludwig dijo estar en la Cocina, las \ncámaras lo vieron; en la decoración de la isla se \nencontró un prototipo de PEM";
                s[3] = "\n\n\nEl Ing. Dell mencionó estar en la Biblioteca, su \nnombre está en el registro; hay un Key-spoofing \ncerca de la entrada";
                s[4] = "\n\n\nEl Sr. Mundy menciona que trabajó todo el tiempo \nen el Taller, los datos del lugar lo confirman, \ndijo que había una Tarjeta de acceso en el lugar \npero desapareció";
            break;
            case 3:
                System.out.println("caso 3");
                sujetoi = "Dr. Ludwig";
                lugari = "Cocina";
                equipoi = "PEM";
                s[0] = "\n\n\nLos sensores del Jardín detectaron las credenciales \ndel Ing. Dell y tras una revisión se encontró la \nTarjeta de acceso en el lugar";
                s[1] = "\n\n\nLas cámaras del Laboratorio observaron a la \nSrta. Pauling, ha desaparecido el prototipo de PEM";
                s[2] = "\n\n\nJeremy dijo estar en la Cocina, hay una pila de \nplatos que lo confirma pero las cámaras fueron \ndesactivadas; entre los cajones se encontró una \nGanzúa";
                s[3] = "\n\n\nEl Dr Ludwig dijo estar en la Biblioteca, su \nnombre no está en el registro; hay un Key-spoofing \ncerca de la entrada";
                s[4] = "\n\n\nEl Sr. Ludwig menciono que trabajó todo el tiempo \nen el Taller y grabó un informe de su trabajo, \nel inventario menciona una Barra en el lugar";
            break;
            case 4:
                System.out.println("caso 4");
                sujetoi = "Sr. Mundy";
                lugari = "Biblioteca";
                equipoi = "Ganzúa";
                s[0] = "\n\n\nLos sensores del Jardín detectaron las \ncredenciales del Ing. Dell y tras una revisión se \nencontró un Key-spoofing en el lugar";
                s[1] = "\n\n\nLa Srta. Pauling menciono que trabajó todo el \ntiempo en el Taller y grabó un informe de su \ntrabajo, el inventario tiene una Ganzúa en el \nlugar pero no está";
                s[2] = "\n\n\nJeremy dijo estar en la Cocina, las cámaras \nconfirman eso; junto a la puerta se encontró una \nBarra";
                s[3] = "\n\n\nEl Dr Ludwig dijo estar en la Biblioteca, el \nregistro está perdido pero varios lo vieron \nentrar; hay un PEM cerca de la entrada";
                s[4] = "\n\n\nEl Sr. Mundy menciona que estaba en el \nLaboratorio, los datos del lugar difieren, se \nrecuperó una Tarjeta de acceso en el lugar";
            break;
            case 5:
                System.out.println("caso 5");
                sujetoi = "Ing. Dell";
                lugari = "Jardín";
                equipoi = "Key-spoofing";
                s[0] = "\n\n\nLos sensores de la Cocina detectaron las \ncredenciales de la Srta. Pauling que menciono\n estar en el lugar,  se ha perdido un \nKey-spoofing en la zona";
                s[1] = "\n\n\nLas cámaras del Jardín no funcionan pero una \nbitácora menciona a Jeremy en el lugar, tras una \nrevisión se encontró una Barra";
                s[2] = "\n\n\nEl Dr. Ludwig dijo estar en el Laboratorio, las \ncámaras lo vieron; en la decoración de la isla se \nencontró una Tarjeta de acceso";
                s[3] = "\n\n\nEl Ing. Dell mencionó estar en el Taller, su \nnombre no está en el registro; hay un PEM en\n la mesa";
                s[4] = "\n\n\nEl Sr. Mundy menciona que estaba leyendo en la \nBiblioteca, los datos del lugar lo confirman, se \nrecuperó una Ganzúa en el lugar";
            break;
            default:
                System.out.println("default");
            break;
        }
    }
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    
    //Cambio de fondo
    public Image backgroundImage;
    private void IMG(String change){
        a = change;
        try {
            backgroundImage = ImageIO.read(new File(a));  // Imagen a cambiar
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    */
    public void Resultado(){
        if(sujeto==sujetoi&&lugar==lugari&&equipo==equipoi){
            lore="Ganaste";
        }
        else{
            String verdad="Te haz equivocado. \nEl culpable es: "+sujetoi+"\nEntro desde: "+lugari+"\nUsando: "+equipoi;
            lore=verdad;
        }
        contexto.setText(lore);
        contexto.setVisible(true);
        botonR.setVisible(false);
        acusoE.setVisible(false);
        acusoL.setVisible(false);
        acusoP.setVisible(false);
        botonS.setVisible(false);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
    }
    private void Lista(){
        contexto.setVisible(false);
        botonS.setVisible(false);
        botonP1.setVisible(true);
        botonP2.setVisible(true);
        botonP3.setVisible(true);
        botonP4.setVisible(true);
        botonP5.setVisible(true);
        botonL1.setVisible(true);
        botonL2.setVisible(true);
        botonL3.setVisible(true);
        botonL4.setVisible(true);
        botonL5.setVisible(true);
        botonE1.setVisible(true);
        botonE2.setVisible(true);
        botonE3.setVisible(true);
        botonE4.setVisible(true);
        botonE5.setVisible(true);
    }
    private void Info(){
        contexto.setText(lore);
        contexto.setVisible(true);
        botonS.setVisible(true);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
    }
    private void Juicio(){
        contexto.setVisible(false);
        botonR.setVisible(true);
        botonS.setVisible(false);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
        acusoP.setVisible(true);
        acusoL.setVisible(true);
        acusoE.setVisible(true);
    }
    public static void main(String[] args) {
        Juego base=new Juego();
        base.setBounds(150,100,800,600);
        base.setVisible(true);
    }
}
