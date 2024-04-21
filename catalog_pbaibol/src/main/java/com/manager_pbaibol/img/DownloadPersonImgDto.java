package com.manager_pbaibol.img;

import com.manager_pbaibol.entitis.person.Person;


public class DownloadPersonImgDto {

    private Person person;
    private byte[] profileImage;


    public DownloadPersonImgDto(){}

    public DownloadPersonImgDto(Person person, byte[] profileImage) {
        this.person = person;
        this.profileImage = profileImage;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public byte[] getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(byte[] profileImage) {
        this.profileImage = profileImage;
    }
}
