package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class OrderController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getOrders() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to order controller controller")
  }

  def getOrder(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Order " + id)
  }

  def createOrder() = Action { implicit request: Request[AnyContent] =>
    Created("created")
  }

  def cancelOrder(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("order " + id + " canceled")
  }

  def modifyOrder(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("order " + id + " has been successfully modified")
  }

}
