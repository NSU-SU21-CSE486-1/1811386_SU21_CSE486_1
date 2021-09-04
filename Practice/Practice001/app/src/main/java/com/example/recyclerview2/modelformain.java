package com.example.recyclerview2;

import android.os.Parcel;
import android.os.Parcelable;

public class modelformain implements Parcelable {
    public String nameformain;
    public String nidformain;

    protected modelformain(Parcel in) {
        nameformain = in.readString();
        nidformain = in.readString();
    }

    public static final Creator<modelformain> CREATOR = new Creator<modelformain>() {
        @Override
        public modelformain createFromParcel(Parcel in) {
            return new modelformain(in);
        }

        @Override
        public modelformain[] newArray(int size) {
            return new modelformain[size];
        }
    };

    public String getNameformain() {
        return nameformain;
    }

    public void setNameformain(String nameformain) {
        this.nameformain = nameformain;
    }

    public String getNidformain() {
        return nidformain;
    }

    public void setNidformain(String nidformain) {
        this.nidformain = nidformain;
    }

    public modelformain(String nameformain, String nidformain) {
        this.nameformain = nameformain;
        this.nidformain = nidformain;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameformain);
        dest.writeString(nidformain);
    }
}
