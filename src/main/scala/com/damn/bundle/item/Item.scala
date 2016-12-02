package com.damn.bundle.item

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.actorRef2Scala
import akka.util.Timeout

object ItemActor {
  def props(implicit timeout: Timeout) = Props(new ItemActor)
  def name = "itemActor"
}

class ItemActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _       => println("huh?")
  }
}
