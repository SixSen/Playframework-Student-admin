package controllers;

import play.*;
import play.mvc.With;

@Check("isAdmin")
@With(Secure.class)
public class Users extends CRUD{

}
