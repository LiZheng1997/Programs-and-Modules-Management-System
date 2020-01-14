package uk.ac.sheffield.coursemgr.common.utils;

import java.io.Serializable;
import java.util.UUID;

public class UUIDGenerator implements IdGenerator {

    @Override
    public Serializable nextId() {
        return UUID.randomUUID().toString();
    }

}
