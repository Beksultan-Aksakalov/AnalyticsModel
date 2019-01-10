package com.example.eightex;

import android.support.annotation.NonNull;
import java.util.Date;

public class AnalyticsModel {

    @NonNull
    private String mSection;

    @NonNull
    private String mSubsection;

    @NonNull
    private String mCategory;

    @NonNull
    private String mRegionAlias;

    @NonNull
    private String mAddress;

    private float mLatitude;

    private float mLongitude;

    @NonNull
    private String mTitle;

    @NonNull
    private String mSubTitle;

    @NonNull
    private String mText;

    @NonNull
    private String mPhone;

    @NonNull
    private String mEmail;

    @NonNull
    private Date mCreateDate;

    public AnalyticsModel(
            @NonNull String section,
            @NonNull String subsection,
            @NonNull String category,
            @NonNull String regionAlias,
            @NonNull String address,
            float latitude,
            float longitude,
            @NonNull String title,
            @NonNull String subTitle,
            @NonNull String text,
            @NonNull String phone,
            @NonNull String email,
            @NonNull Date createDate
    ) {
        mSection = section;
        mSubsection = subsection;
        mCategory = category;
        mRegionAlias = regionAlias;
        mAddress = address;
        mLatitude = latitude;
        mLongitude = longitude;
        mTitle = title;
        mSubTitle = subTitle;
        mText = text;
        mPhone = phone;
        mEmail = email;
        mCreateDate = createDate;
    }

    public AnalyticsModel(
            @NonNull String section,
            @NonNull String subsection,
            @NonNull String category
    ) {
        mSection = section;
        mSubsection = subsection;
        mCategory = category;
    }

    public AnalyticsModel(@NonNull String section) {
        this(section, null, null);
    }

    public AnalyticsModel(
            @NonNull String address,
            float latitude,
            float longitude
    ) {
        mAddress = address;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    @NonNull
    public String getSection() {
        return mSection;
    }

    public void setSection(@NonNull String section) {
        mSection = section;
    }

    @NonNull
    public String getSubsection() {
        return mSubsection;
    }

    public void setSubsection(@NonNull String subsection) {
        mSubsection = subsection;
    }

    @NonNull
    public String getCategory() {
        return mCategory;
    }

    public void setCategory(@NonNull String category) {
        mCategory = category;
    }

    @NonNull
    public String getRegionAlias() {
        return mRegionAlias;
    }

    public void setRegionAlias(@NonNull String regionAlias) {
        mRegionAlias = regionAlias;
    }

    @NonNull
    public String getAddress() {
        return mAddress;
    }

    public void setAddress(@NonNull String address) {
        mAddress = address;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public void setLatitude(float latitude) {
        mLatitude = latitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

    public void setLongitude(float longitude) {
        mLongitude = longitude;
    }

    @NonNull
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(@NonNull String title) {
        mTitle = title;
    }

    @NonNull
    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(@NonNull String subTitle) {
        mSubTitle = subTitle;
    }

    @NonNull
    public String getText() {
        return mText;
    }

    public void setText(@NonNull String text) {
        mText = text;
    }

    @NonNull
    public String getPhone() {
        return mPhone;
    }

    public void setPhone(@NonNull String phone) {
        mPhone = phone;
    }

    @NonNull
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(@NonNull String email) {
        mEmail = email;
    }

    @NonNull
    public Date getCreateDate() {
        return mCreateDate;
    }

    public void setCreateDate(@NonNull Date createDate) {
        mCreateDate = createDate;
    }
}
