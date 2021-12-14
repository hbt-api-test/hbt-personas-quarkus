package org.hbt.test.personas.model.service;


import org.hbt.test.personas.model.entity.ResponseData;

public interface IUtils {
    ResponseData requestDataWS(Object T, int count);
    //String getToken(String token) throws Exception;
}
