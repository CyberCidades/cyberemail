/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.example;

import br.com.cyber.email.CyberEmail;


/**
 *
 * @author Serigne Khassim Mbaye
 */
public class UseThisLibrary {

    public UseThisLibrary() {
    }
    
    
 
    public static  void main(String []args){
        CyberEmail.configuarar_Servidor("smtp.gmail.com", "587", true);
        CyberEmail.abrir_Session("sergiobombaye@gmail.com", "Toubads12");
        CyberEmail.escopo_Email("serignekhassim@gmail.com", "Titulo_email", "Conteudo_email");
        CyberEmail.envia_Email();
    }
    
    
}
