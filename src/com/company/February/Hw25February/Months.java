package com.company.February.Hw25February;

public enum Months {

    DECEMBER(31, Season.WINTER), JANUARY(31,Season.WINTER), FEBRUARY(28, Season.WINTER),
    MARCH(31,Season.SPRING), APRIL(30, Season.SPRING), MAY(31,Season.SPRING),
    JUNE(30, Season.SUMMER), JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER),
    SEPTEMBER(30,Season.AUTUMN), OCTOBER(31, Season.AUTUMN), NOVEMBER(30, Season.AUTUMN);

    private int days;
    private Season season;

    Months(int days, Season season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }
}
