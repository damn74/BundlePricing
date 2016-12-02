package com.damn.bundle

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import akka.actor._
import akka.pattern.ask
import akka.util.Timeout

import com.damn.bundle.item._


class BundlePricingApi(system: ActorSystem, timeout: Timeout) extends BundlePricing {
  implicit val requestTimeout = timeout
  implicit def executionContext = system.dispatcher

  def createItem = system.actorOf(ItemActor.props, ItemActor.name)
}

trait BundlePricing {
  
  def createItem(): ActorRef

  implicit def executionContext: ExecutionContext
  implicit def requestTimeout: Timeout

  lazy val item = createItem()

  def sayHello(text: String) =
    item ? text

}