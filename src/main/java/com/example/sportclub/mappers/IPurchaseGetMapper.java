package com.example.sportclub.mappers;


import com.example.sportclub.dtos.PurchaseGetDto;
import com.example.sportclub.entities.PurchaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IPurchaseGetMapper {

    IPurchaseGetMapper INSTANCE = Mappers.getMapper(IPurchaseGetMapper.class);

    @Mapping(source = "user.user_id", target = "user_id")
    @Mapping(source = "user.user_name", target = "user_name")
    @Mapping(source = "courseBundle.course_bundle_id", target = "course_bundle_id")
    @Mapping(source = "courseBundle.bundle_name", target = "bundle_name")
    @Mapping(source = "courseBundle.bundle_price", target = "bundle_price")
    PurchaseGetDto purchaseToGetPurchaseDto(PurchaseEntity purchase);
    List<PurchaseGetDto> purchasesToGetAllPurchaseDto(List<PurchaseEntity> purchases);
}
