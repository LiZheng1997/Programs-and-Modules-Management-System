package uk.ac.sheffield.coursemgr.common.utils;

public class CommonUtils {

    private static final IdGenerator defaultIdGenerator;

    static {
        defaultIdGenerator = new SnowFlakeIdGenerator();
    }

    public static synchronized Long nextId() {
        return (Long) defaultIdGenerator.nextId();
    }

}
