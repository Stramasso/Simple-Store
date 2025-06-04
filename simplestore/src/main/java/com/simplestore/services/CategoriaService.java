package com.simplestore.services;

import com.simplestore.models.Categoria;
import com.simplestore.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    // Lista todas as categorias
    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    // Salva uma nova categoria
    public Categoria criar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
