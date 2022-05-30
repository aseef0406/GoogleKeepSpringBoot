package com.keep.googlekeepspringboot.notes.Entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Reminder {
    private final String reminderId;
    private Boolean isRepeat;
    private String cronExpression;
    private String noteId;

    public Reminder() {
        this.reminderId = UUID.randomUUID().toString().substring(0,9);
    }

    public Reminder(String reminder_id) {
		this.reminderId = reminder_id;
	}

	public String getReminderId() {
        return reminderId;
    }

    public Boolean getRepeat() {
        return isRepeat;
    }

    public void setRepeat(Boolean repeat) {
        isRepeat = repeat;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
}
//    Quartz format is :
//
//        (second, minute, hour, day_of_month, month, day_of_week, year)
//Unix format is :
//
//        (minute, hour, day_of_month, month, day_of_week, year)