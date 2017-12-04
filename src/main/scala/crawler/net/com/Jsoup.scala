/*
package crawler.net.com

import org.jsoup.Jsoup

import scala.collection.JavaConversions._
object jsoup extends App {



  def crawl(url: String, depth: Int) {
    println("----")
    //    if (depth > 0) {

    var links: String = ""

    var doc = Jsoup.connect(url).get()

    var elements = doc.select("a[href]")
    for (element <- elements) {

      if (!element.attr(url).isEmpty) {
        println("----!")

        links += element.attr("abs:href" + "\n" + links)
      println(s"\nlinks $links")
      crawl(element.attr("abs:href"), depth)
    }
//      Elements elements = doc.select(levels[level]);
//      final int flevel = ++level;
//      for (final Element element : elements) {
//        executor.execute(new Runnable() {
//          @Override
//          public void run() {
//            if (!element.attr("href").isEmpty()) {
//              links += element.attr("abs:href") + "\n";
//              System.out.println(links);
//              getRecursive(element.attr("abs:href"), flevel, executor);
//            }






    }
  }
 crawl ("https://www.google.co.in/", 1)

}
//          println(s"\n \t ${cnt}) title : " + link.text)
//          println("\t     link : " + link.attr("href"))
/*

      }

      /*          println("\n________Body of page is :\n")
          println(s"\n--total Links are :")
          println(s"Current Time ${System.currentTimeMillis}")
//        }*/
    } /*catch {
        case _: Throwable =>
          println(
            "\n Something went wrong, may be web site has disabled robot.txt!")*/
    //      }
    /*else {
      println("don't go")
    }*/
    //  }

    crawl("https://www.google.co.in/", 1)

//  }
}
 */
*/
