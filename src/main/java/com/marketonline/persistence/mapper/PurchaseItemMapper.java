package com.marketonline.persistence.mapper;

import com.marketonline.domain.service.PurchaseItem;
import com.marketonline.persistence.entity.Compra;
import com.marketonline.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;



@Mapper(componentModel = "Spring", uses = {ProductMapper.class}) //includes product mapper
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source ="id.idProducto", target ="productId" ),
            @Mapping(source = "cantidad", target = "quantity"),
              //total same name in PurchaseItem and ComptasProducto and dont include in mapping
            @Mapping(source ="estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

@InheritInverseConfiguration
@Mappings({
        @Mapping(target ="compra", ignore = true),
        @Mapping(target = "producto", ignore = true),
        @Mapping(target = "id.idCompra", ignore = true)
})
    ComprasProducto toComprasProducto(PurchaseItem item);
}
