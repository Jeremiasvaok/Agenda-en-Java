package agendaelectronica;

import agendaelectronica.igu.Principal;

public class AgendaElectronica {

    public static void main(String[] args) {
        ///////// TRes pasos para levantar la pantalla ////////////////////////
        //creaccion de un objeto de la pantalla igu
        Principal pantalla = new Principal();
        
        //setiamos para que sea visible y podemos interactuar
        pantalla.setVisible(true);
        
        //centramos la pantalla en el medio
        pantalla.setLocationRelativeTo(null);
        
        
    
    }
    
}
