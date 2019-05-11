package controllers;

import play.mvc.With;

@Check("isAdmin")
@With(Secure.class)
public class Students extends CRUD{

}
