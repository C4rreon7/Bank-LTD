package banking.gui;

import banking.domain.*;
import banking.data.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ATMClient {

  private static final String USAGE
    = "USAGE: java banking.gui.ATMClient <dataFilePath>";

  public static void main(String[] args) {

    // Retrieve the dataFilePath command-line argument
    if ( args.length != 1 ) {
      System.out.println(USAGE);
    } else {
      String dataFilePath = args[0];

      try {
	System.out.println("Reading data file: " + dataFilePath);
	// Create the data source and load the Bank data
	DataSource dataSource = new DataSource(dataFilePath);
    dataSource.loadData();

	// Run the ATM GUI
	ATMClient client = new ATMClient();
	client.launchFrame();

      } catch (IOException ioe) {
	System.out.println("Could not load the data file.");
	System.out.println(ioe.getMessage());
	ioe.printStackTrace(System.err);
      }
    }
  }
  // Colocar a continuación el código de la GUI.

  private JFrame frame;
  private JPanel panelIzquierdo;
  private JPanel panelDerecho;
  private JTextField field1;
  private JTextField field2;
  private JTextArea areaSalida;
  private JButton enter;

  public ATMClient(){
    frame = new JFrame("Bank LTD");
    desplegarGUI();
  }

  private void desplegarGUI(){
    panelIzquierdo = new JPanel();
    panelIzquierdo.setLayout(new GridLayout(2, 1));
    JPanel panelMenuIzq = new JPanel();
    panelMenuIzq.setLayout(new GridLayout(3, 1));

    JButton botonMenu1 = new JButton("Account Balance");
    JButton botonMenu2 = new JButton("Make a deposit");
    JButton botonMenu3 = new JButton("Make a withdrawal");

    panelMenuIzq.add(botonMenu1);
    panelMenuIzq.add(botonMenu2);
    panelMenuIzq.add(botonMenu3);
    
    botonMenu1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        enter.setActionCommand("Saldo");
        areaSalida.append("\n Balance: $$$");
      }
    });

    botonMenu2.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        enter.setActionCommand("Deposito");
        areaSalida.append("\n Indique la cantida a depositar.");
      }
    });

    botonMenu3.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        enter.setActionCommand("Retiro");
        areaSalida.append("\n Indique la cantida a retirar.");
      }
    });
    
    panelIzquierdo.add(panelMenuIzq);
    

    JPanel entrada1 = new JPanel();
    entrada1.setLayout(new BorderLayout());
    field1 = new JTextField(10);
    entrada1.add(field1, BorderLayout.NORTH);
    JPanel keyPad  = new JPanel();
    keyPad.setLayout(new GridLayout(4, 3));

    JButton botonKey1 = new JButton("1");
    JButton botonKey2 = new JButton("2");
    JButton botonKey3 = new JButton("3");
    JButton botonKey4 = new JButton("4");
    JButton botonKey5 = new JButton("5");
    JButton botonKey6 = new JButton("6");
    JButton botonKey7 = new JButton("7");
    JButton botonKey8 = new JButton("8");
    JButton botonKey9 = new JButton("9");
    JButton botonKey0 = new JButton("0");
    JButton botonPunto = new JButton(".");
    //JButton botonEnter = new JButton("Enter");

    botonKey0.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey0 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey0.getText());
      }
    });
    botonKey1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey1 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey1.getText());
      }
    });
    botonKey2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey2 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey2.getText());
      }
    });
    botonKey3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey3 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey3.getText());
      }
    });
    botonKey4.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey4 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey4.getText());
      }
    });
    botonKey5.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey5 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey5.getText());
      }
    });
    botonKey6.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey6 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey6.getText());
      }
    });
    botonKey7.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey7 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey7.getText());
      }
    });
    botonKey8.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey8 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey8.getText());
      }
    });
    botonKey9.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey9 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey9.getText());
      }
    });
    botonKey0.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonKey0 = (JButton) e.getSource();
        field1.setText(field1.getText()+botonKey0.getText());
      }
    });
    botonPunto.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JButton botonPunto = (JButton) e.getSource();
        field1.setText(field1.getText()+botonPunto.getText());
      }
    });
    

    keyPad.add(botonKey1);
    keyPad.add(botonKey2);
    keyPad.add(botonKey3);
    keyPad.add(botonKey4);
    keyPad.add(botonKey5);
    keyPad.add(botonKey6);
    keyPad.add(botonKey7);
    keyPad.add(botonKey8);
    keyPad.add(botonKey9);
    //keyPad.add(botonEnter);
    keyPad.add(botonKey0);
    keyPad.add(botonPunto);

    enter = new JButton("Enter");
    enter.addActionListener(new ManejadorEnter());
    enter.setActionCommand("Cliente");
    keyPad.add(enter);

    entrada1.add(keyPad, BorderLayout.SOUTH);

    panelIzquierdo.add(entrada1);
    frame.add(panelIzquierdo, BorderLayout.WEST);

    panelDerecho = new JPanel();
    panelDerecho.setLayout(new BorderLayout());

    areaSalida = new JTextArea(10, 25);
    areaSalida.setText("Introduzca su numero de cliente en el teclado numerico.");
    panelDerecho.add(areaSalida, BorderLayout.CENTER);
    field2 = new JTextField(25);
    panelDerecho.add(field2, BorderLayout.SOUTH);
    panelDerecho.setEnabled(false);
    frame.add(panelDerecho, BorderLayout.EAST);
  }

  private class ManejadorEnter implements ActionListener{
    public void actionPerformed(ActionEvent e){
      String funcion = enter.getActionCommand();
      switch (funcion) {
        case "Cliente":
          areaSalida.setText("Bienvenido Cliente "+field1.getText() + "\n Elija una funcion.");
          field1.setText("");
          break;
        case "Deposito":
          areaSalida.setText("Su deposito "+field1.getText() + " se realizo correctamente" + "\n Elija una funcion.");
          field1.setText("");
          break;
        case "Retiro":
          areaSalida.setText("Su retiro "+field1.getText() + " se realizo correctamente" + "\n Elija una funcion.");
          field1.setText("");
          break;
        default:
          break;
      }
    }
  }

  public void launchFrame(){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocation(500, 400);
    frame.setSize(500, 900);
    frame.pack();
    frame.setResizable(true);
    frame.setVisible(true);
  }
}
