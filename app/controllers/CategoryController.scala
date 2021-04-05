package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class CategoryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getCategories() = Action { implicit request: Request[AnyContent] =>
    Ok("Categories")
  }

  def addCategory() = Action { implicit request: Request[AnyContent] =>
    Created("Created")
  }

  def removeCategory(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Category " + id + " removed")
  }

  def modifyCategory(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Category " + id + " updated")
  }

  def getCategory(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Category: " + id)
  }
}
