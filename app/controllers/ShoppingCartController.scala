package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ShoppingCartController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getCartProducts(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to Shopping Cart Controller controller")
  }

  def createCart() = Action { implicit request: Request[AnyContent] =>
    Ok("shopping cart created")
  }

  def addProduct(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("product added to cart " + id)
  }

  def removeProduct(id: Long, prdCode: String) = Action { implicit request: Request[AnyContent] =>
    Ok("product " + prdCode + " removed from cart " + id)
  }

}
