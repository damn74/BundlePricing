package com.damn.bundle.backoffice

import akka.actor.{ Actor, Props, PoisonPill }

object Warehouse {
  def props(event: String) = Props(new Warehouse(items))

  case class AddItems(items: Vector[Items])
  case class Get(id: Int, quantity: Long)
  case class Items(id: Int, name: String, price: Double, quantity: Long)
  
  case object GetEvent
  case object Cancel

}


class Warehouse(event: String) extends Actor {
  import Warehouse._

  var items = Vector.empty[Items]

  def receive = {
    case AddItems(newItems) => items = items ++ newItems
//    case Get(id, quantity) =>
//      val entries = items.take(quantity).toVector
//      if(entries.size >= nrOfTickets) {
//        sender() ! Tickets(event, entries)
//        tickets = tickets.drop(nrOfTickets)
//      } else sender() ! Tickets(event)
//    case GetEvent => sender() ! Some(BoxOffice.Event(event, tickets.size))
//    case Cancel =>
//      sender() ! Some(BoxOffice.Event(event, tickets.size))
//      self ! PoisonPill
  }