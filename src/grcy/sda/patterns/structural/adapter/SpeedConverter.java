package grcy.sda.patterns.structural.adapter;

public enum SpeedConverter {
    MILES_TO_KILOMETERS(1, 1.609344, "M2K"),
    KILOMETERS_TO_MILES(2, 0.6213712, "K2M");

    private double converter;
    private int index;
    private String shortname;

    SpeedConverter(int index, double converter, String shortname) {
        this.converter = converter;
        this.index = index;
        this.shortname = shortname;
    }

    public double getConverter() {
        return converter;
    }

    public int getIndex() {
        return index;
    }

    public static SpeedConverter findByShortname(String shortname) {
        for (SpeedConverter enumElement : SpeedConverter.values()) {
            if (shortname.equalsIgnoreCase(enumElement.shortname)) {
                return enumElement;
            }
        }
        return null;
    }


}
