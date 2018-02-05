/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cyber.email;


import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Serigne Khassim Mbaye
 */
public class CyberEmail extends Entidade_Servidor_Email{

    static final Properties Up_Properties = new Properties();
    
    /**
    *Configuração Servidor
    */ 
    public static void myProperties(){
        
        Up_Properties.put("mail.smtp.host",getEmail_host_servidor());   // "smtp.cybercidades.com.br"
        Up_Properties.put("mail.smtp.socketFactory.port", "587");
        Up_Properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        Up_Properties.put("mail.smtp.socketFactory.fallback", "true");
        Up_Properties.put("mail.smtp.starttls.enable", "true");
        Up_Properties.put("mail.smtp.auth",isAuthen_Smtp()); //"true"
        Up_Properties.setProperty("mail.smtp.**ssl.enable", "true");
        Up_Properties.setProperty("mail.smtp.**ssl.required", "true");
        Up_Properties.put("mail.smtp.port", getPort_Smtp_host()); //"587"
    }
    
    /**
    *Abrir Seesion
     * @return 
    */
    public Session mysesion(){
        final Session session = Session.getDefaultInstance(Up_Properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(getEmail_servidos(), getSenha_Email_servidor());
            }
        });
        /**
         * Ativa Debug para sessão
         */
        session.setDebug(true);
        return session;
    }
    
    /**
    *Enviar Email
     * @return 
    */
    public static boolean enviar_Email(){
        CyberEmail session_email = new CyberEmail();
        try {
           /*Email_session, senha_session   */ 
            Message message = new MimeMessage(session_email.mysesion());
            message.setFrom(new InternetAddress(getEmail_servidos())); //Remetente "contato@cybercidades.com.br"
            Address[] toUser = InternetAddress //Destinatário(s) 
            .parse(get_Destinario());
            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(get_Titulo());/*Assunto*/ 
            message.setText(get_Conteudo());/*Messagem*/ 
            /**
             * Método para enviar a mensagem criada
             */
            Transport.send(message);
            System.out.println("Feito!!!");
            return true;
        } catch (MessagingException e) {
            System.out.println("erro :" + e.getMessage());
            return false;
        }
    }
    /**
     *Excução das tarefas
     * @param args
     */
    private static void main(String[] args) {
        myProperties();
        enviar_Email();
    }
}
