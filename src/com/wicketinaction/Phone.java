package com.wicketinaction;

import java.io.Serializable;


public class Phone implements Serializable
{
    public String areacode;
    public String phone;
    public String ext;

    @Override
    public String toString()
    {
        return String.format("[Phone areacode=%s phone=%s ext=%s]", areacode, phone, ext);
    }
}
