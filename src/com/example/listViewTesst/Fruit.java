package com.example.listViewTesst;

/**
 * Created by c on 2015/7/26.
 */
public class Fruit {



    private String name;
    private int imageId;
    public Fruit (String name,int imageId){

        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

}