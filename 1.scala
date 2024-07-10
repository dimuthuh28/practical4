object Store extends App {
  var names = Array("A", "B", "C", "D")
  var quantity = Array(10, 33, 21, 11)

  def displayInventory(): Unit = {
    for (i <- names.indices) {
      val n = names(i)
      val q = quantity(i)
      println(s"$n -> $q")
    }
  }

  def restockItem(name: String, qty: Int): Unit = {
    var found = false
    for (i <- names.indices) {
      if (names(i) == name) {
        quantity(i) += qty
        found = true
      }
    }
    if (!found) {
      println(s"$name does not exist.")
    }
  }

  def sellItem(name: String, qty: Int): Unit = {
    var found = false
    for (i <- names.indices) {
      if (names(i) == name) {
        if (quantity(i) >= qty) {
          quantity(i) -= qty
        } else {
          println(s"Not enough $name left.")
        }
        found = true
      }
    }
    if (!found) {
      println(s"$name does not exist.")
    }
  }

  displayInventory()

  restockItem("A", 5)
  displayInventory()

  sellItem("B", 12)
  displayInventory()
}
