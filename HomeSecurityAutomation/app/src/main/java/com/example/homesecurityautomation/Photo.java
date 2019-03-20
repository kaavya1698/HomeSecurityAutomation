package com.example.homesecurityautomation;

public class Photo
{
    private String url;
    private String name;

    public Photo()
    {

    }

    public Photo(String imagename, String imageurl)
    {
        if(imagename.trim().equals(""))
        {
            name = "No name";
        }
        name = imagename;
        url = imageurl;
    }

    public Photo(String imageurl)
    {
        name = "";
        url = imageurl;
    }

    public String getPhotoURL()
    {
        return url;
    }

    public void setUrl(String imageurl)
    {
        url = imageurl;
    }

}