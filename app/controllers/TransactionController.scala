package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class TransactionController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getTransactions() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to transaction controller")
  }

  def modifyTransaction(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Transaction " + id + " updated")
  }

  def createSaleTransaction() = Action { implicit request: Request[AnyContent] =>
    Ok("OK")
  }

  // transactions cannot be removed, can only be reversed
  def reverseTransaction(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("transaction " + id + " reversed")
  }

}
