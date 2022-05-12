package com.keep.googlekeepspringboot.notes.Entity;

public class Label {
    private String labelId;
    private String labelName;

    public Label(String labelId, String labelName) {
        this.labelId=labelId;
        this.labelName=labelName;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
