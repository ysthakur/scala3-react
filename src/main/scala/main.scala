package com.ysthakur.react

import japgolly.scalajs.react.facade.{React, ReactDOM}

import scalajs.js
import org.scalajs.dom

@main
def main(): Unit = {
  println("Goodbye world")

  val elem = React.createElement("div", js.Object())
  ReactDOM.render(elem, dom.document)
}
