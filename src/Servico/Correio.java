/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author leonardoa
 */
public class Correio {
    
    public void NotificarPorEmail(Agendamento agendamento) {
    
        String emailFormatado = formarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        
        //Uso da Classe de Email
        Email email = new Email("Agendamento Barbearia", emailFormatado, destinatario);
        email.enviar();
    
    }

    private String formarEmail(Agendamento agendamento) {
        
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá" + nomeCliente + "Seu agendamento para" +
                servico + ", está marcado para o dia" + dataAgendamento + "às" + horaAgendamento + "valor R$" + valor + "Obrigado!";
    }
    
}
