package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ProductController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getProducts() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to product controller")
  }

  def addProduct() = Action { implicit request: Request[AnyContent] =>
    Created("Created")
  }

  def updateProduct(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("product " + id + " updated")
  }

  def removeProduct(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("product " + id + " removed")
  }

  def getProduct(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("product " + id)
  }

}
