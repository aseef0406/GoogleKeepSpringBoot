package com.keep.googlekeepspringboot.notes.Entity;

import java.util.Date;
import java.util.List;

public class Reminder {
    private Date date;
    private Boolean isRepeat;
    private List<Integer> repetedDates;
}
