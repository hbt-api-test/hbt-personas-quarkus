package org.hbt.test.personas.config;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.security.cert.CertificateException;

@Slf4j
public class JwtValidate {

    public static void validate(String token, String urlazure) throws CertificateException, IOException {
        log.info("Metodo JwtValidate.validate " + token);
      //  AzureAdJwtToken jwtToken = new AzureAdJwtToken(token, urlazure);
       // jwtToken.verify();

    }
}
