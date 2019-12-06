package com.dxc.medic;

import java.util.List;
import java.util.Map;

public class ValidationException extends IllegalArgumentException {
    private final Map<DoctorValidationType, List<Error>> root;

    public ValidationException(final Map<DoctorValidationType, List<Error>> root) {
        super();
        this.root = root;
    }

    public Map<DoctorValidationType, List<Error>> getRoot() {
        return root;
    }
}