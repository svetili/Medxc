package com.dxc.medic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@SuppressWarnings("javadoc")
@Path("doctors")
public class DoctorsRestService {

    @SuppressWarnings("nls")
    private static List<Doctor> doctors = new ArrayList<>() {
        {
            add(new Doctor(1, "Svetlana", 3, true));
            add(new Doctor(2, "Peter", 5, true));
            add(new Doctor(3, "Ali", 5, true));
        }
    };
    private static List<Error> errors = new ArrayList<>() {
        {
            add(new Error(ErrorType.EMPTY, Arrays.asList("Blalba", 1)));
            add(new Error(ErrorType.NEGATIVE, Arrays.asList("Tata", 1)));
        }
    };
    private static Map<DoctorValidationType, List<Error>> map = Map.of(DoctorValidationType.ID, errors);
    private static ValidationException ex = new ValidationException(map);

    // private static Doctor doctor = new Doctor(4, "Ilina", 4, true);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> allDoctors() {
        return doctors;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> deleteDoctor(@PathParam("id") final Integer id) {
        if (id != doctors.get(0).getId()) {
            System.out.println("deleteDoctor service start");
            throw ex;
        }
        doctors.removeIf(d -> d.getId() == id);
        return doctors;

    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> createDoctor(final Doctor doctor) {
        doctors.add(doctor);
        return doctors;

    }

}
