package io.ushi.olio;

import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by qjdchina on 2017/5/2.
 */
public class DateTimeTrial {

    public static void main(String[] args) {

        System.out.println(DateUtils.isSameDay(new Date(), DateUtils.addDays(new Date(), 1)));

        DateTime datetime = new DateTime();
        datetime.isBefore(new DateTime());
    }
}
