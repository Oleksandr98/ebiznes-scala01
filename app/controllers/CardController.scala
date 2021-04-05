package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class CardController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getCards() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to cards controller")
  }

  def addCard() = Action { implicit request: Request[AnyContent] =>
    Created("created")
  }

  def closeCard(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("closed")
  }

  def blockCard(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("blocked")
  }

  def getCard(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("card " + id)
  }
}
