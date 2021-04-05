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

  def addProduct(productId: Long, id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("product " + productId + " added to cart " + id)
  }

  def removeProduct(productId: Long, id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("product " + productId + " removed from cart " + id)
  }

}
