package com.marketonline.persistence.mapper;

import com.marketonline.domain.Category;
import com.marketonline.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

//
@Mapper(componentModel = "spring")


    public interface CategoryMapper{
        @Mappings({
                @Mapping(source = "idCategoria", target = "categoryId"),
                @Mapping(source = "descripcion", target = "category"),
                @Mapping(source = "estado", target = "actie"),
        })
        @InheritInverseConfiguration
        @Mapping(target = "productos", ignore = true)
        Category toCategory(Categoria categoria);
    }

