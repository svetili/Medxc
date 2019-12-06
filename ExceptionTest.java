package com.dxc.medic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("errors")
public class ExceptionTest {
    private static List<Error> errors = new ArrayList<>() {
        {
            add(new Error(ErrorType.EMPTY, Arrays.asList("Blalba", 1)));
            add(new Error(ErrorType.NEGATIVE, Arrays.asList("Tata", 1)));
        }
    };

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Error> getAllErrors() {
        return errors;
    }
}
