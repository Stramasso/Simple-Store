package com.simplestore.services;

import com.simplestore.models.Pedido;
import com.simplestore.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Lista todos os pedidos de um usuário pelo e-mail.
     * @param email E-mail do usuário
     * @return Lista de pedidos do usuário
     */
    public List<Pedido> listarPorUsuario(String email) {
        return pedidoRepository.findByUsuarioEmail(email);
    }

    /**
     * Busca um pedido pelo ID.
     * @param id ID do pedido
     * @return Pedido encontrado ou null
     */
    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    /**
     * Finaliza o pedido do usuário (exemplo simplificado).
     * @param email E-mail do usuário
     */
    public void finalizarPedido(String email) {
        // Exemplo simplificado:
        Pedido pedido = new Pedido();
        // Supondo que Pedido tem um campo usuarioEmail:
        // pedido.setUsuarioEmail(email);
        // pedidoRepository.save(pedido);

        // ATENÇÃO: Adapte conforme sua entidade Pedido.
    }

    // Outros métodos úteis podem ser adicionados aqui.
}
