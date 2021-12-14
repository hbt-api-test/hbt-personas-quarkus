package org.hbt.test.personas.seguridad;

import lombok.extern.slf4j.Slf4j;
import org.hbt.test.personas.model.entity.ResponseData;
import org.hbt.test.personas.model.service.IUtils;

import javax.inject.Singleton;

@Slf4j
@Singleton
public class RequestData implements IUtils {

    private static final String TOKEN_TYPE = "Bearer ";

    @Override
    public ResponseData requestDataWS(Object T, int count) {

        String status = count > 0 ? "OK" : "ERROR";

        ResponseData<Object> responseData = ResponseData.builder()
                .status(status)
                .count(count)
                .payload(T)
                .build();
        return responseData;

    }

   /* @Override
    public String getToken(String token) throws Exception {

        log.info("Inicia la obtencion del token: " + token);
        if(token != null){
            if(token.startsWith(TOKEN_TYPE)){
                return token.substring(TOKEN_TYPE.length());
            }else {
                log.error("No es un token valido");
                throw new Exception("No es un token valido");
            }
        }else {
            log.error("No es un token valido");
            throw new Exception("No es un token valido");
        }

    }*/
}
