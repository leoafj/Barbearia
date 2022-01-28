/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author leonardoa
 */
public class AgendaController {
    
    private final Agenda view;

    public AgendaController(Agenda view) {
        this.view = view;
    }
    
    public void atualizaTabela(){
        
       AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
       ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
    }
    
}
