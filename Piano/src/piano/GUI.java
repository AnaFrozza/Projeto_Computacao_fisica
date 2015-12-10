package piano;

import Main.DAONotas;
import Main.Notas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Ana
 *
 */
public class GUI extends JFrame implements Observer {

    DAONotas daoNotas = new DAONotas();
    private final AcessaArduino acessaArduino;
    public String var;
    Container cp;
    JPanel pnNorte = new JPanel();
    JPanel pnCentro = new JPanel();
    JPanel pnSul = new JPanel();

    JLabel lbLocalizar = new JLabel("Localizar");
    JTextField tfProcurar = new JTextField(10);
    JButton btProcurar = new JButton("Procurar");

    JButton lbDo = new JButton("Dó");
    JButton lbRe = new JButton("Ré");
    JButton lbMi = new JButton("Mi");
    JButton lbFa = new JButton("Fa");
    JButton lbSol = new JButton("Sol");
    JButton lbLa = new JButton("La");
    JButton lbSi = new JButton("Si");
    JButton lbDob = new JButton("Dob");

//    JLabel lbTocar = new JLabel("Tocar");
    JButton btTocar = new JButton("Tocar");
    JButton btSalvar = new JButton("Salvar");
    JButton btRepro = new JButton("Reproduzir");

    public GUI() throws SQLException, ClassNotFoundException {
        setSize(500, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Piano Arduino");

        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        acessaArduino = new AcessaArduino(this);

        //colocar os paineis no painel principal
        cp.add(pnNorte, BorderLayout.NORTH);
        cp.add(pnCentro, BorderLayout.CENTER);
        cp.add(pnSul, BorderLayout.SOUTH);

        //no painel norte
        pnNorte.add(lbLocalizar);
        pnNorte.add(tfProcurar);
        pnNorte.add(btProcurar);

        //no painel centro
        pnCentro.setLayout(new GridLayout(1, 3));
        pnCentro.add(lbDo);
        pnCentro.add(lbRe);
        pnCentro.add(lbMi);
        pnCentro.add(lbFa);
        pnCentro.add(lbSol);
        pnCentro.add(lbLa);
        pnCentro.add(lbSi);
        pnCentro.add(lbDob);

        //configurar os labels 8do painel centro
        lbDo.setOpaque(true);
        lbRe.setOpaque(true);
        lbMi.setOpaque(true);
        lbFa.setOpaque(true);
        lbSol.setOpaque(true);
        lbLa.setOpaque(true);
        lbSi.setOpaque(true);
        lbDob.setOpaque(true);

        lbDo.setBackground(Color.red);
        lbRe.setOpaque(true);
        lbRe.setBackground(Color.yellow);
        lbMi.setOpaque(true);
        lbMi.setBackground(Color.green);
        lbFa.setOpaque(true);
        lbFa.setBackground(Color.blue);
        lbSol.setOpaque(true);
        lbSol.setBackground(Color.orange);
        lbLa.setOpaque(true);
        lbLa.setBackground(Color.pink);
        lbSi.setOpaque(true);
        lbSi.setBackground(Color.gray);
        lbDob.setOpaque(true);
        lbDob.setBackground(Color.cyan);

        //no painel sul
//        pnSul.add(lb);
        pnSul.add(btTocar);
        pnSul.add(btSalvar);
        pnSul.add(btRepro);

        lbDo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbDo.setBackground(Color.white);
                        lbDo.setBackground(Color.red);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("DO");
                        daoNotas.inserir(notas);
                    }
                }
        );
        lbRe.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbRe.setBackground(Color.white);
                        lbRe.setBackground(Color.yellow);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("RE");
                        daoNotas.inserir(notas);
                    }
                }
        );
        lbMi.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbMi.setBackground(Color.white);
                        lbMi.setBackground(Color.green);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("MI");
                        daoNotas.inserir(notas);
                    }
                }
        );
        lbFa.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbFa.setBackground(Color.white);
                        lbFa.setBackground(Color.blue);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("FA");
                        daoNotas.inserir(notas);
                    }
                }
        );
        lbSol.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbSol.setBackground(Color.white);
                        lbSol.setBackground(Color.orange);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("SO");
                        daoNotas.inserir(notas);
                    }
                }
        );
        lbLa.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbLa.setBackground(Color.white);
                        lbLa.setBackground(Color.pink);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("LA");
                        daoNotas.inserir(notas);
                    }
                }
        );
        lbSi.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbSi.setBackground(Color.white);
                        lbSi.setBackground(Color.gray);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("SI");
                        daoNotas.inserir(notas);
                    }
                }
        );
        
        lbDob.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lbDob.setBackground(Color.white);
                        lbDob.setBackground(Color.cyan);
//                        String s = "INSERT INTO notas(notasCol) VALUES('DO')";
                        Notas notas = new Notas();
                        notas.setIdnotas(4);
                        notas.setNotascol("DB");
                        daoNotas.inserir(notas);
                    }
                }
        );
        

        setVisible(true);
//     nn.close();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg.toString());

        try {
            String nota = arg.toString();

            nota = nota.substring(0, 2);
            switch (nota) {
                case "DO":
                    lbDo.doClick();
                    lbDo.setBackground(Color.white);
                    lbDo.setBackground(Color.red);
//              
                    break;

                case "RE":
                    lbRe.doClick();
                    lbRe.setBackground(Color.white);
                    lbRe.setBackground(Color.yellow);
//              
                    break;

                case "MI":
                    lbMi.doClick();
                    lbMi.setBackground(Color.white);
                    lbMi.setBackground(Color.green);
//              
                    break;

                case "FA":
                    lbFa.doClick();
                    lbFa.setBackground(Color.white);
                    lbFa.setBackground(Color.blue);
//              
                    break;

                case "SO":
                    lbSol.doClick();
                    lbSol.setBackground(Color.white);
                    lbSol.setBackground(Color.orange);
//              
                    break;

                case "LA":
                    lbLa.doClick();
                    lbLa.setBackground(Color.white);
                    lbLa.setBackground(Color.pink);
//              
                    break;

                case "SI":
                    lbSi.doClick();
                    lbSi.setBackground(Color.white);
                    lbSi.setBackground(Color.gray);
//              
                    break;

                case "DB":
                    lbDob.doClick();
                    lbDob.setBackground(Color.white);
                    lbDob.setBackground(Color.cyan);
//              
                    break;

                default:
                    throw new AssertionError();
            }

        } catch (Exception e) {
//            System.out.println(" Erro na Converssão");
        }

//        lbRe.doClick();
    }

}
