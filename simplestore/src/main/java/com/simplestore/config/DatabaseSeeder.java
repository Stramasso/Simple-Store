package com.simplestore.config;

import com.simplestore.models.Role;
import com.simplestore.models.Usuario;
import com.simplestore.repositories.RoleRepository;
import com.simplestore.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Verifica se já existe um usuário admin
        if (usuarioRepository.findByEmail("admin@email.com").isEmpty()) {
            // Verifica se o role ROLE_ADMIN existe, se não, cria
            Role roleAdmin = roleRepository.findByNome("ROLE_ADMIN");
            if (roleAdmin == null) {
                roleAdmin = new Role();
                roleAdmin.setNome("ROLE_ADMIN");
                roleRepository.save(roleAdmin);
            }

            Usuario admin = new Usuario();
            admin.setNome("Admin");
            admin.setEmail("admin@email.com");
            admin.setSenha(passwordEncoder.encode("123456")); // Senha criptografada
            admin.setRoles(Set.of(roleAdmin));
            usuarioRepository.save(admin);
            System.out.println("Usuário admin criado com sucesso!");
        }
    }
}
