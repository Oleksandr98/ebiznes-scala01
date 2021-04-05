package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class OffersController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getOffers() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to offers controller")
  }

  def getOffer(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Offer " + id)
  }

  def addOffer() = Action { implicit request: Request[AnyContent] =>
    Created("created")
  }

  def removeOffer(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("offer " + id + " removed")
  }

  def addPersonalOffer(customerId: Long) = Action { implicit request: Request[AnyContent] =>
    Created("created")
  }

}
