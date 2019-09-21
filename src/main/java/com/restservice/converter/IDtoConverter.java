package com.restservice.converter;

import com.restservice.dto.IBaseDto;

import java.util.List;

public interface IDtoConverter<F, D extends IBaseDto> {

    D convertToDto(F from);

    F convertFromDto(D from);

    List<D> convertToDto(List<F> from);

    List<F> convertFromDto(List<D> from);
}
