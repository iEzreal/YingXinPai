package com.yingxinpai.app.model;

public class Menu {
    private String bgNormalColor;
    private String bgSelectedColor;
    private int icon;
    private String text;
    private String textColor;

    private int indicator;

    public String getBgNormalColor() {
        return bgNormalColor;
    }

    public void setBgNormalColor(String bgNormalColor) {
        this.bgNormalColor = bgNormalColor;
    }

    public String getBgSelectedColor() {
        return bgSelectedColor;
    }

    public void setBgSelectedColor(String bgSelectedColor) {
        this.bgSelectedColor = bgSelectedColor;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public int getIndicator() {
        return indicator;
    }

    public void setIndicator(int indicator) {
        this.indicator = indicator;
    }
}
