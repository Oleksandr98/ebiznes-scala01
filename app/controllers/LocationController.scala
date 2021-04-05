package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class LocationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getLocations() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to location controller")
  }

  def addLocation() = Action { implicit request: Request[AnyContent] =>
    Created("Created")
  }

  def getLocation(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Location " + id)
  }

  def modifyLocation(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Location " + id + " updated")
  }

  def removeLocation(id: Long) = Action { implicit request: Request[AnyContent] =>
    Created("Location " + id + " removed")
  }

}
