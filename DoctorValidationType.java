package com.dxc.medic;

public enum DoctorValidationType {
    ID, NAME, AGE;

    enum IdEnum {
        EMPTY, NULL_POINTER, NEGATIVE, NOT_IN_RANGE
    }

    enum NameEnum {
        EMPTY, NULL_POINTER, NEGATIVE, NOT_IN_RANGE;
    }

    enum AgeEnum {
        EMPTY, NULL_POINTER, NEGATIVE, NOT_IN_RANGE;
    }

}