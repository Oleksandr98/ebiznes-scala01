package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ShoppingCartController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def createCart() = Action { implicit request: Request[AnyContent] =>
    Ok("shopping cart created")
  }

  def getCart(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("shopping cart " + id)
  }

  def modifyCart(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("shopping cart " + id + " updated")
  }

  def removeCart(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("shopping cart " + id + " removed")
  }

}
