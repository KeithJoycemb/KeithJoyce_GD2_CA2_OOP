package com.dkit.oop;

import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private String facilities;




    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, String facilities)
    {
        this.facilities = facilities;
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = 200000.00;
        this.area = area;
    }


    public void setFacilities(String facilities)
    {
        this.facilities = facilities;
    }

    public String getFacilities()
    {
        return facilities;
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    protected void addFacility()
    {



    }

    private void removeFacility()
    {

    }

    @Override
    public String toString()
    {
        return "Property{" +
                "propertyID=" + propertyID +
                ", owner='" + owner + '\'' +
                ", postcode='" + postcode + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", facilities='" + facilities + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return propertyID == property.propertyID &&
                Double.compare(property.sellingPrice, sellingPrice) == 0 &&
                Double.compare(property.area, area) == 0 &&
                Objects.equals(owner, property.owner) &&
                Objects.equals(postcode, property.postcode) &&
                Objects.equals(facilities, property.facilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyID, owner, postcode, sellingPrice, area, facilities);
    }
}
