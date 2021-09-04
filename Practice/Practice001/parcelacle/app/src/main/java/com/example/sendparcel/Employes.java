package com.example.sendparcel;

import android.os.Parcel;
import android.os.Parcelable;

public class Employes implements Parcelable
{ public String name;
public String email;
public int age;


    public Employes(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    protected Employes(Parcel in) {
        name = in.readString();
        email = in.readString();
        age = in.readInt();
    }

    public static final Creator<Employes> CREATOR = new Creator<Employes>() {
        @Override
        public Employes createFromParcel(Parcel in) {
            return new Employes(in);
        }

        @Override
        public Employes[] newArray(int size) {
            return new Employes[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
        dest.writeInt(age);
    }
}


}
