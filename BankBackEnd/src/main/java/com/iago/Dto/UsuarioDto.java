package com.iago.Dto;

import org.hibernate.validator.constraints.br.CPF;

import com.iago.Model.Usuario;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDto {

    private int id;

    @NotNull
    @NotEmpty(message = "O campo não foi preenchido")
    @CPF(message = "O campo não foi preenchido corretamente")
    private String cpf;

    
    @NotEmpty(message = "O campo não foi preenchido")
    private String nome;

    private String token;

    public UsuarioDto(Usuario usuario, String token) {
        this.id = usuario.getId();
        this.cpf = usuario.getCpf();
        this.nome = usuario.getNome();
        this.token = token;
    }

}
