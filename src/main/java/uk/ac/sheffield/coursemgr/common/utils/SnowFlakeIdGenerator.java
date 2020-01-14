package uk.ac.sheffield.coursemgr.common.utils;

import java.io.Serializable;

public class SnowFlakeIdGenerator implements IdGenerator {

    private SnowFlake snowFlake = new SnowFlake(13,21);

    @Override
    public Serializable nextId() {
        return snowFlake.nextId();
    }

}
