package controllers

;

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class CustomerController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def getCustomers() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to customer controller")
  }

  def enrollCustomer() = Action { implicit request: Request[AnyContent] =>
    Created("Customer created")
  }

  def modifyCustomer(id: Long) = Action { implicit request: Request[AnyContent] =>
    Created("Customer modified")
  }

  def blockCustomer(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Customer blocked")
  }

  def closeCustomer(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Customer closed")
  }

  def unblockCustomer(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Customer unblocked")
  }

}
