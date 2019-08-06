package com.example.earthquakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, Long TimeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){ return mMagnitude ; }

    public String getLocation(){ return mLocation ; }

    public Long getTimeInMilliseconds(){ return mTimeInMilliseconds; }

    public String getUrl() { return mUrl; }
}
