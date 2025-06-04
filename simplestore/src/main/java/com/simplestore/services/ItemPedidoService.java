package com.simplestore.services;

import com.simplestore.repositories.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public void remover(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
