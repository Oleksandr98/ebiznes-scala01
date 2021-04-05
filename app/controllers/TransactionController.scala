package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class TransactionController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getTransactions() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to transaction controller")
  }

  def getCustomerTransactions(customerId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("customer " + customerId + " transactions")
  }

  def processTransaction() = Action { implicit request: Request[AnyContent] =>
    Ok("OK")
  }

  def reverseTransaction(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("transaction " + id + " reversed")
  }

}
