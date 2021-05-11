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
                @Mapping(source = "estado", target = "active"),
        })
        Category toCategory(Categoria categoria);
        @InheritInverseConfiguration //lo equivalente a Categoria toCategoria(Category category);
        @Mapping(target = "productos", ignore = true)  // productos existe en categoria pero no en category, entonces ignoramos
        Categoria toCategoria(Category category);
    }

