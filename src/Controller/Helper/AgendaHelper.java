/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leonardoa
 */
public class AgendaHelper implements IHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
       DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
       tableModel.setNumRows(0);
        
       //Percorrer a lista preenchendo o table model
       for (Agendamento agendamento : agendamentos) {
       
           tableModel.addRow(new Object[]{
           agendamento.getId(),
           agendamento.getCliente().getNome(),
           agendamento.getServico().getDescricao(),
           agendamento.getValor(),
           agendamento.getDataFormatada(),
           agendamento.getHoraFormatada(),
           agendamento.getObservacao()
           });
       
       }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente); 
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
        
    }

    public Servico obterServico() {
        return (Servico) view.getjComboBoxServico().getSelectedItem();
        
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor+"");
        
    }

    @Override
    public Object obeterModelo() {
        
        
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
