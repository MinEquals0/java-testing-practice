package com.minequals0.coffee.mapper;

import com.minequals0.coffee.dto.CoffeePatchDto;
import com.minequals0.coffee.dto.CoffeePostDto;
import com.minequals0.coffee.dto.CoffeeResponseDto;
import com.minequals0.coffee.entity.Coffee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
    List<CoffeeResponseDto> coffeesToCoffeeResponseDtos(List<Coffee> coffees);
}
