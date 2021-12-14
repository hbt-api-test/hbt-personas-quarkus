package org.hbt.test.personas.config;

/*import com.heinsohn.obl.utils.seguridad.CommonEJB;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.hbt.test.personas.model.entity.exception.TechnicalException;
import org.hbt.test.personas.model.service.IUtils;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.NumericDate;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


@Slf4j
@Provider
@PreMatching
@Priority(Priorities.AUTHENTICATION)*/
public class SecurityFilter {
  /*      extends CommonEJB implements ContainerRequestFilter {

    @Context
    protected HttpServletRequest httpServletRequest;

    @Value("${spring.azure.openid.url}")
    private String urlAzure;

    @Inject
    private IUtils utils;

    @SneakyThrows
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        log.info("Inicia SeguridadFilter");
        String accessToken = getAccessToken(containerRequestContext);

        if (accessToken != null && !accessToken.equals("null")) {
            JwtClaims jwtClaims = validarToken(accessToken);
            log.info("jwtClaims: " + jwtClaims.toString());
        }
        //JwtValidate.validate(utils.getToken(containerRequestContext.getHeaderString(HttpHeaders.AUTHORIZATION)), urlAzure);
    }


    @SneakyThrows
    private JwtClaims validarToken(String accessToken) {
        JwtConsumer jwtConsumer = new JwtConsumerBuilder().setSkipSignatureVerification().setSkipAllValidators()
                .build();
        JwtClaims jwtClaims;
        try {
            jwtClaims = jwtConsumer.processToClaims(accessToken);
            NumericDate expirationTime = jwtClaims.getExpirationTime();
            if (expirationTime.isBefore(NumericDate.now())) {
                throw new TechnicalException(
                        "El token ha expirado");
            }
        } catch (MalformedClaimException e) {
            throw new TechnicalException(e.getLocalizedMessage());
        } catch (InvalidJwtException ex) {
            throw new TechnicalException(ex.getLocalizedMessage());
        }
        return jwtClaims;
    }

    private String getAccessToken(ContainerRequestContext requestContext) {
        String token = null;
        String header = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        if (header != null) {
            token = header.substring(7);
        }
        return token;
    }*/


}
