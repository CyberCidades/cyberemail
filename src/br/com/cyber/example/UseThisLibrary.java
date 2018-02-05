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
    
    
    public void main(String []args){
        CyberEmail.configuarar_Servidor("Email_smtp", "port_smtp", true);
        CyberEmail.abrir_Session("Email_rementente", "Senha_email");
        CyberEmail.escopo_Email("Email_destinario", "Titulo_email", "Conteudo_email");
        CyberEmail.enviar_Email();
    }
    
    
}
