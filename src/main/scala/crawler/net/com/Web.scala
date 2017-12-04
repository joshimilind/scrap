package crawler.net.com

import org.jsoup.Jsoup
//import java.io._
import scala.collection.JavaConversions._

object Web extends App {
  println("-----")
  def crawl(url: String, depth: Int) {
    var depth1 = depth

    var diggedurls: String = ""

    if(depth1 > 0)
    try {


      val doc = Jsoup
        .connect(url)
        .get()

      val links = doc.select("a[href]")
      var cnt = 0

      for (link <- links) {
        cnt += 1
        diggedurls += links.attr("abs:href" + "\n" + links)
        println(s"urls-----$diggedurls")
        println(s"\n \t ${cnt}) title : " + link.text)
        println("\t     link : " + link.attr("href"))
        depth1 -=1
      }


      println(s"\n________ :\n")
      println(s"\n--total Links are : $cnt")
    } catch {
      case _: Throwable =>
        println(
          "\n Something went wrong, may be web site has disabled robot.txt!")
    }
  }

  crawl("https://www.google.com", 2)
}