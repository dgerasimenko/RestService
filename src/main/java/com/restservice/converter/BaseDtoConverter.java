package com.restservice.converter;

import com.restservice.dto.IBaseDto;
import com.restservice.utils.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseDtoConverter<F, D extends IBaseDto> implements IDtoConverter<F, D> {

    @Override
    public List<D> convertToDto(List<F> from) {

        if (CollectionUtils.isNotNullOrEmpty(from)) {
            return from.stream().map(etity -> convertToDto(etity)).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<F> convertFromDto(List<D> from) {
        if (CollectionUtils.isNotNullOrEmpty(from)) {
            return from.stream().map(etity -> convertFromDto(etity)).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }
}
