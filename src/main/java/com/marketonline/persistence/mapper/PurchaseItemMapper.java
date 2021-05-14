package com.marketonline.persistence.mapper;

import com.marketonline.domain.service.PurchaseItem;
import com.marketonline.persistence.entity.ComprasProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;



@Mapper(componentModel = "Spring")
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source ="", target ="" )
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);
}
