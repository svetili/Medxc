package com.dxc.medic;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author spetrova
 *
 */
@Provider
public class CustomExceptionMapper implements ExceptionMapper<ValidationException> {

    @Override
    public Response toResponse(final ValidationException e) {
        return Response.status(Response.Status.BAD_REQUEST).entity(e.getRoot()).type(MediaType.APPLICATION_JSON)
                .build();
    }

}
