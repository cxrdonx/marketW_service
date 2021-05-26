package com.marketonline.persistence;

import com.marketonline.domain.repository.PurchaseRepository;
import com.marketonline.domain.service.Purchase;
import com.marketonline.persistence.crud.CompraCrudRepository;
import com.marketonline.persistence.entity.Compra;
import com.marketonline.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper mapper;
    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>)compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdcliente(clientId).map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
