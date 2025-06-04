package com.simplestore.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import java.util.Set;

import com.simplestore.models.Role;




@Entity
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;

    @Override
    public String getAuthority() {
        return nome;
    }


    @JoinTable(
     name = "usuario_role",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )



    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Set<Usuario> getUsuarios() { return usuarios; }
    public void setUsuarios(Set<Usuario> usuarios) { this.usuarios = usuarios; }
}

