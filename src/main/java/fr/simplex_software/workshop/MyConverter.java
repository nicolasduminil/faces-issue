package fr.simplex_software.workshop;

import jakarta.faces.component.*;
import jakarta.faces.context.*;
import jakarta.faces.convert.*;

@FacesConverter(value = "myConverter", managed = true)
public class MyConverter implements Converter<MyEnum>
{
  @Override
  public MyEnum getAsObject(FacesContext context, UIComponent component, String value)
  {
    return value == null || value.trim().isEmpty() ? null : MyEnum.valueOf(value);
  }

  @Override
  public String getAsString(FacesContext context, UIComponent component, MyEnum value)
  {
    return value != null ? value.name() : "";
  }
}
