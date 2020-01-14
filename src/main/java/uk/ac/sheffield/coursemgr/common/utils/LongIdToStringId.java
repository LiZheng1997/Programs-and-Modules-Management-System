package uk.ac.sheffield.coursemgr.common.utils;


public class LongIdToStringId {


    private static String  stringId;

    public static String toStringId(Long id){
         stringId = "\""+id.toString()+"\"";
        return stringId;
    }
}
