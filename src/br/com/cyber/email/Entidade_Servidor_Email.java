/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.email;

import java.util.logging.Logger;

/**
 *
 * @author Serigne Khassim Mbaye
 */
class Entidade_Servidor_Email {
    private static final Logger LOG = Logger.getLogger(Entidade_Servidor_Email.class.getName());
    private static String email_host_servidor = "";
    private static String port_smtp_host = "";
    private static boolean authent_smtp = true;
    private static String email_servidor = "";
    private static String senha_smail_servidor ="";
    private static String destinario = "";
    private static String titulo = "";
    private static String conteudo = "";
    

    public Entidade_Servidor_Email() {
    }

    public static String getEmail_host_servidor() {
        return email_host_servidor;
    }

    public static void setEmail_host_servidor(String Email_host_servidor) {
        Entidade_Servidor_Email.email_host_servidor = Email_host_servidor;
    }

    public static String getPort_Smtp_host() {
        return port_smtp_host;
    }

    public static void setPort_Smtp_host(String Port_Smtp_host) {
        Entidade_Servidor_Email.port_smtp_host = Port_Smtp_host;
    }

    public static boolean isAuthen_Smtp() {
        return authent_smtp;
    }

    public static void setAuthen_Smtp(boolean Authen_Smtp) {
        Entidade_Servidor_Email.authent_smtp = Authen_Smtp;
    }

    public static String getEmail_servidos() {
        return email_servidor;
    }

    public static void setEmail_servidos(String Email_servidos) {
        Entidade_Servidor_Email.email_servidor = Email_servidos;
    }

    public static String getSenha_Email_servidor() {
        return senha_smail_servidor;
    }

    public static void setSenha_Email_servidor(String Senha_Email_servidor) {
        Entidade_Servidor_Email.senha_smail_servidor = Senha_Email_servidor;
    }

    public static String get_Destinario() {
        return destinario;
    }

    public static void set_Destinario(String Destinario) {
        Entidade_Servidor_Email.destinario = Destinario;
    }

    public static String get_Titulo() {
        return titulo;
    }

    public static void set_Titulo(String Titulo) {
        Entidade_Servidor_Email.titulo = Titulo;
    }

    public static String get_Conteudo() {
        return conteudo;
    }

    public static void set_Conteudo(String Conteudo) {
        Entidade_Servidor_Email.conteudo = Conteudo;
    }
    /**
     *Confuguraçã_Servidor Email Smtp
     * @param Email
     * @param port
     * @param Auth_smtp
     */
    public static void configuarar_Servidor(String Email,String port,boolean Auth_smtp){
        setEmail_host_servidor(Email);
        setPort_Smtp_host(port);
        setAuthen_Smtp(Auth_smtp);       
    }
    
    /**
     *Abrir Session Email que vai enviar 
     * @param Email
     * @param Senha
     */
    
    public static void abrir_Session(String Email,String Senha){
        setEmail_servidos(Email);
        setSenha_Email_servidor(Senha);        
    }
    
    /**
     *Enviar Email para destinario
     * @param Email
     * @param Titulo
     * @param Conteudo_dest
     */
    public static void escopo_Email(String Email,String Titulo,String Conteudo_dest){
        set_Destinario(Email);
        set_Titulo(Titulo);
        set_Conteudo(Conteudo_dest);
    } 
}
