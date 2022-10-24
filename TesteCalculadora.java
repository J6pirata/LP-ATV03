package atv3;
import java.awt.*;
import java.awt.event.*;

public class TesteCalculadora {

    Calculadora C1 = new Calculadora("Semana 4 - Atividade 3", 500,
    500,50,50);
    C1.setLayout(new FlowLayout());
     
    Label l1=new Label("A",Label.LEFT);
    Label l2=new Label("B",Label.LEFT);
    Label l3=new Label("Soma",Label.LEFT); 
    Label l4=new Label("Subtração",Label.LEFT); 
    Label l5=new Label("Multiplicação",Label.LEFT); 
    Label l6=new Label("Divisão",Label.LEFT); 
    
    C1.add(l1);
    C1.add(l2);
    C1.add(l3);
    C1.add(l4);
    C1.add(l5);
    C1.add(l6);
    C1.setVisible(true);
    
}
