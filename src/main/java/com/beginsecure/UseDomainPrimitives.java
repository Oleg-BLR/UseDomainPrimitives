package com.beginsecure;

import com.beginsecure.domain.primitives.SSN;

import java.util.ArrayList;
import java.util.List;

public class UseDomainPrimitives {
    public static void main(String[] args) {
        List<SSN> ids = new ArrayList<>();

        ids.add(new SSN("019-85-6636"));
        ids.add(new SSN("312-85-2646"));

        ids.add(new SSN("312-88-2646"));
    }
}
