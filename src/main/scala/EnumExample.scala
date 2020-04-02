sealed trait geeks {
  val article = "not done";
}

// Class extends trait
class scala extends geeks {
  override val article = "scala article";
}

// Class extends trait
class java extends geeks {
  override val article = "java article";
}

// Class extends trait
class csharp extends geeks {
  override val article = "csharp article";
}

object EnumExample extends App {

  def checkArticle(article: geeks) = article match {
    case s: scala =>  println(s.article)
    case j: java => println(j.article)
  }
  checkArticle(new scala())
}
