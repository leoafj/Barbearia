/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author leonardoa
 */
public class Usuario extends Pessoa {
    
    
    protected String senha;
    protected String NivelAcesso;

    public Usuario(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.NivelAcesso = NivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(String NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }
    
    
    
    
    
    
}
