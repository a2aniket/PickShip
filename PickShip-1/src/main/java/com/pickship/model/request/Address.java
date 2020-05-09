package com.pickship.model.request;

public class Address
{
    String line_1;
    String line_2;
    String line_3;
    String line_4;
    int postalCode;
    int state;
    String country = "IN";
    
    public String getLine_1()
    {
        return line_1;
    }
    public void setLine_1(String line_1)
    {
        this.line_1 = line_1;
    }
    public String getLine_2()
    {
        return line_2;
    }
    public void setLine_2(String line_2)
    {
        this.line_2 = line_2;
    }
    public String getLine_3()
    {
        return line_3;
    }
    public void setLine_3(String line_3)
    {
        this.line_3 = line_3;
    }
    public String getLine_4()
    {
        return line_4;
    }
    public void setLine_4(String line_4)
    {
        this.line_4 = line_4;
    }
    public int getPostalCode()
    {
        return postalCode;
    }
    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }
    public int getState()
    {
        return state;
    }
    public void setState(int state)
    {
        this.state = state;
    }
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }

}
