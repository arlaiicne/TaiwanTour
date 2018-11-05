package com.example.tongl.taiwantour;

public class Attraction {
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAttractionDescription;
    private int mAttractionName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Attraction(int attractionDescription, int attractionName) {
        mAttractionDescription = attractionDescription;
        mAttractionName = attractionName;
    }

    public Attraction(int attractionDescription, int attractionName, int imageResourceId) {
        mAttractionDescription = attractionDescription;
        mAttractionName = attractionName;
        mImageResourceId = imageResourceId;
    }

    public int getAttractionDescription() {
        return mAttractionDescription;
    }

    public int getAttractionName() {
        return mAttractionName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "mAttractionDescription='" + mAttractionDescription + '\'' +
                ", mAttractionName='" + mAttractionName + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}

