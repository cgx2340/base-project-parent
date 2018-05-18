package xyz.ccc2340.orm;

import java.time.LocalDateTime;

/**
 * Created chenguangxue at 2018/5/18 23:55
 * Description
 */
public class TimeUtil {

    public static String now() {
        return LocalDateTime.now().toString();
    }

}
