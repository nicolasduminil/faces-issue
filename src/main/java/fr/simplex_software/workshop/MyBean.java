package fr.simplex_software.workshop;

import jakarta.enterprise.context.*;
import jakarta.faces.application.*;
import jakarta.faces.context.*;
import jakarta.inject.*;

@Named
@RequestScoped
public class MyBean
{
  private MyEnum myEnum;

  public MyEnum getMyEnum()
  {
    return myEnum;
  }

  public void setMyEnum(MyEnum myEnum)
  {
    this.myEnum = myEnum;
  }

  public void show()
  {
    FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", null);
    FacesContext.getCurrentInstance().addMessage(null, facesMsg);
  }
}
