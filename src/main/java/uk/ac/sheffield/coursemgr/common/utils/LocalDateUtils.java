package uk.ac.sheffield.coursemgr.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 关于时间的工具类.
 */
@SuppressWarnings("unused")
public class LocalDateUtils {

    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前的日期的字符串
     *
     * <p>
     *     for example:
     *     LocalDateUtils.getLocalDateStr() 返回 2019-03-04
     * </p>
     * @return
     */
    public static String getLocalDateStr() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(YYYY_MM_DD));
    }

    /**
     * 获取当前的日期时间的字符串
     * <p>
     *     for example:
     *     LocalDateUtils.getLocalDateTimeStr() 返回 2019-03-04 20:48:00
     * </p>
     * @return
     */
    public static String getLocalDateTimeStr() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(YYYY_MM_DD_HH_MM_SS));
    }

}
