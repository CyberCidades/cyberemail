# cyberemail
Este projeto consiste na implementação de uma biblioteca para envio de e-mail.

<p>
#exemple

import br.com.cyber.email.CyberEmail;

    public void main(String []args){
        #para configurar servido so chamar o methodo de configuraço e passa na parametro email smtp e  a porta smtp
        CyberEmail.configuarar_Servidor("smtp.gmail.com", "587", true);
        #sempre pra tu conseguir mandar uma email tem que ter um (a) remetente  ali tu vai passar dados de remetente 
            o emial de voce e sua senha  que quer mandar email para outro pessoa 
        CyberEmail.abrir_Session("usuario@gmail.com", "12345");
        #nessa espaço tu vai colocar dados de destinario email e titul de seu email e seu conteudo
        CyberEmail.escopo_Email("destinario@gmail.com", "Titulo_email", "Conteudo_email");
        #para sistema mandar sua messagem tem que chamar o funcao de enviar email
        CyberEmail.enviar_Email();
    }
    
</p>
