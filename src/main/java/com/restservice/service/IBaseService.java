package com.restservice.service;

import com.restservice.converter.IDtoConverter;

import com.restservice.dto.IBaseDto;
import com.restservice.exception.ServiceException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface IBaseService<D, T extends IBaseDto> {

    Collection<T> getAll() throws ServiceException;

    JpaRepository<D, Long> getDao();

    IDtoConverter<D, T> getDtoConverter();
}
