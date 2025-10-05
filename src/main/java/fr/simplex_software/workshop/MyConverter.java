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
    switch (value)
    {
      case "FIRST":
        return MyEnum.ONE;
      case "SECOND":
        return MyEnum.TWO;
      case "THIRD":
        return MyEnum.THREE;
      case "FOURTH":
        return MyEnum.FOUR;
      default:
        return null;
    }
  }

  @Override
  public String getAsString(FacesContext context, UIComponent component, MyEnum value)
  {
    switch (value)
    {
      case ONE:
        return "FIRST";
      case TWO:
        return "SECOND";
      case THREE:
        return "THIRD";
      case FOUR:
        return "FOURTH";
      default:
        return null;
    }
  }
}
