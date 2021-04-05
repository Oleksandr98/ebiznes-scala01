package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class CouponsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getCoupons() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to coupons controller")
  }

  def addCoupon() = Action { implicit request: Request[AnyContent] =>
    Created("Created")
  }

  def modifyCoupon(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Coupon " + id + " updated")
  }

  def removeCoupon(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Coupon " + id + " removed")
  }

  def invalidateCoupon(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Coupon " + id + " invalidated")
  }

  def getCoupon(id: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Coupon " + id)
  }

}
