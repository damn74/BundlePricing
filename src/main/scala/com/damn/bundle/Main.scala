package com.damn.bundle

import akka.actor._
import akka.util.Timeout
import scala.concurrent.duration._

object Main extends App {

//  val config = ConfigFactory.load() 
//  val host = config.getString("http.host") // Gets the host and a port from the configuration
//  val port = config.getInt("http.port")

  implicit val system = ActorSystem() 
  implicit val ec = system.dispatcher  
  implicit val timeout = Timeout(5 seconds)
  
  val api = new BundlePricingApi(system, timeout) 
  
  api.sayHello("hello")
  api.sayHello("pippo")
  
}

//trait RequestTimeout {
//  import scala.concurrent.duration._
//  def requestTimeout(config: Config): Timeout = {
//    val t = config.getString("akka.http.server.request-timeout")
//    val d = Duration(t)
//    FiniteDuration(d.length, d.unit)
//  }
//}