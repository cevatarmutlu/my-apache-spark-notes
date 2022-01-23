import org.apache.spark.sql.SparkSession


object Main {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("JSON READ and Write Operation")
      .config("spark.master", "local") // read this link: https://stackoverflow.com/a/40555616
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    val json_file: String = "/home/cevat/workspace/apache-spark-notlarim/datasets/json/orders_input.json"
    val json_df = spark.read.json(json_file)
    json_df.show()

    val high_price =  json_df.filter("price > 50")
    high_price.show()
    high_price.printSchema()
    high_price.write.json("json_file")
  }
}