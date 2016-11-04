import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by rcorbella on 04/11/16.
  */
object App {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("dummy app")
    val sc = new SparkContext(conf)

    println("I will be idle for 20 seconds...")
    Thread.sleep(20000)

    sc.stop()
  }
}
