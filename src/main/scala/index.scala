
package tutorial.webapp
import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {

  def main(args: Array[String]): Unit = {
  println("Hello world Aki today and tomorrow!")
    appendPar(document.body, "Hello World Aki Old")

      document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
    setupUI()
  })

  }
  
def appendPar(targetNode: dom.Node, text: String): Unit = {
  val parNode = document.createElement("p")
  parNode.textContent = text
  targetNode.appendChild(parNode)
}

@JSExportTopLevel("addClickedMessage")
def addClickedMessage(): Unit = {
  appendPar(document.body, "You clicked the button!")
}

def setupUI(): Unit = {
  
  val button = document.createElement("button")
  button.textContent = "Click me baby now!"

  button.addEventListener("click", { (e: dom.MouseEvent) =>
    // addClickedMessage()
      appendPar(document.body, "You clicked it now baby!")
  })

  document.body.appendChild(button)
  appendPar(document.body, "Hello World")
}

}