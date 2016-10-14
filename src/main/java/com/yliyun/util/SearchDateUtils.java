package com.yliyun.util;


import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.StrictISODateTimeFormat;

import java.util.Date;

public final class SearchDateUtils
{
    public static final String SEARCH_DATE_FORMAT_YYYY_MM_DD_T_HH_MM_SSSZZ = "yyyy-MM-dd'T'HH:mm:ssZZ";
    
    private static final DateTimeFormatter searchDateFormat = StrictISODateTimeFormat.dateTimeNoMillis();

    //new SimpleDateFormat(SEARCH_DATE_FORMAT_YYYY_MM_DD_T_HH_MM_SS_SSSZZ);
    
    private SearchDateUtils()
    {
    }
    
    public static Date getFormattedDate(String dateString)
    {
        return searchDateFormat.parseDateTime(dateString).toDate();
    }
    
    public static String formatDate(Date date)
    {
        return searchDateFormat.print(date.getTime());
    }
}