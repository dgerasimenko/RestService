package com.restservice.service;

import com.restservice.dto.IBaseDto;
import com.restservice.exception.ServiceException;

import java.util.List;

public abstract class BaseService<E, T extends IBaseDto> implements IBaseService<E, T> {

    public List<T> getAll() throws ServiceException {
        List<T> result;
        try {
            List<E> dbResult = getDao().findAll();
            result = getDtoConverter().convertToDto(dbResult);
        } catch (Exception ex) {
            throw new ServiceException("Failed to findAll.", ex);
        }
        return result;
    }

}
