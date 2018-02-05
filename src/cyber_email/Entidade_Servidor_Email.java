/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyber_email;

import java.util.logging.Logger;

/**
 *
 * @author Serigne Khassim
 */
public class Entidade_Servidor_Email {
    private static final Logger LOG = Logger.getLogger(Entidade_Servidor_Email.class.getName());
    private static String Email_host_servidor = "";
    private static String Port_Smtp_host = "";
    private static boolean  Authent_Smtp = true;
    private static String Email_servidor = "";
    private static String Senha_Email_servidor ="";
    private static String Destinario = "";
    private static String Titulo = "";
    private static String Conteudo = "";
    

    public Entidade_Servidor_Email() {
    }

    public static String getEmail_host_servidor() {
        return Email_host_servidor;
    }

    public static void setEmail_host_servidor(String Email_host_servidor) {
        Entidade_Servidor_Email.Email_host_servidor = Email_host_servidor;
    }

    public static String getPort_Smtp_host() {
        return Port_Smtp_host;
    }

    public static void setPort_Smtp_host(String Port_Smtp_host) {
        Entidade_Servidor_Email.Port_Smtp_host = Port_Smtp_host;
    }

    public static boolean isAuthen_Smtp() {
        return Authent_Smtp;
    }

    public static void setAuthen_Smtp(boolean Authen_Smtp) {
        Entidade_Servidor_Email.Authent_Smtp = Authen_Smtp;
    }

    public static String getEmail_servidos() {
        return Email_servidor;
    }

    public static void setEmail_servidos(String Email_servidos) {
        Entidade_Servidor_Email.Email_servidor = Email_servidos;
    }

    public static String getSenha_Email_servidor() {
        return Senha_Email_servidor;
    }

    public static void setSenha_Email_servidor(String Senha_Email_servidor) {
        Entidade_Servidor_Email.Senha_Email_servidor = Senha_Email_servidor;
    }

    public static String getDestinario() {
        return Destinario;
    }

    public static void setDestinario(String Destinario) {
        Entidade_Servidor_Email.Destinario = Destinario;
    }

    public static String getTitulo() {
        return Titulo;
    }

    public static void setTitulo(String Titulo) {
        Entidade_Servidor_Email.Titulo = Titulo;
    }

    public static String getConteudo() {
        return Conteudo;
    }

    public static void setConteudo(String Conteudo) {
        Entidade_Servidor_Email.Conteudo = Conteudo;
    }
    /**
     *Confuguraçã_Servidor Email Smtp
     * @param Email
     * @param port
     * @param Auth_smtp
     */
    public static void Configuarar_Servidor(String Email,String port,boolean Auth_smtp){
        setEmail_host_servidor(Email);
        setPort_Smtp_host(port);
        setAuthen_Smtp(Auth_smtp);       
    }
    
    /**
     *Abrir Session Email que vai enviar 
     * @param Email
     * @param Senha
     */
    
    public static void Abrir_Session(String Email,String Senha){
        setEmail_servidos(Email);
        setSenha_Email_servidor(Senha);        
    }
    
    /**
     *Enviar E,ail para destinario
     * @param Email
     * @param Titulo
     * @param Conteudo_dest
     */
    public static void Mandar(String Email,String Titulo,String Conteudo_dest){
        setDestinario(Email);
        setTitulo(Titulo);
        setConteudo(Conteudo_dest);
    } 
}
