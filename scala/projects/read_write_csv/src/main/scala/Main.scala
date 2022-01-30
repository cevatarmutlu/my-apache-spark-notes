import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.types.{StructType, StructField, StringType, DateType}

object Main {

  val base_path: String = "src/csv"

  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession
      .builder()
      .appName("Read and Write operations with CSV files")
      .master("local")
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")

    read_csv_file_with_schema(spark)

  }

  def read_csv_file_with_timestampFormat(spark: SparkSession): Unit = {
    val read_csv_file_with_timestampFormat: DataFrame = spark
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .option("timestampFormat", "dd-MM-yyyy")
      .csv(base_path + "/test6.csv")

    read_csv_file_with_timestampFormat.show()
    read_csv_file_with_timestampFormat.printSchema()
  }


  def read_csv_file_with_multiple_option(spark: SparkSession): Unit = {
    val read_csv_file_with_timestampFormat: DataFrame = spark
      .read
      .options(Map(
        "header" -> "true",
        "delimiter" -> ",",
        "inferSchema" -> "true",
        "timestampFormat" -> "dd-MM-yyyy"
      ))
      .csv(base_path + "/test6.csv")

    read_csv_file_with_timestampFormat.show()
    read_csv_file_with_timestampFormat.printSchema()
  }

  def read_csv_file_with_schema(spark: SparkSession): Unit = {
    val read_csv_file_with_schema: DataFrame = spark
      .read
      .schema("name string, surname string, date date")
      .options(Map(
        "header" -> "true",
        "inferSchema" -> "true",
        "delimiter" -> ",",
        "dateFormat" -> "dd-MM-yyyy"
      ))
      .csv(base_path + "/test6.csv")

    read_csv_file_with_schema.printSchema()
    read_csv_file_with_schema.show()
  }

  def read_csv_file_with_schema2(spark: SparkSession): Unit = {

    val struct: StructType = StructType(Array(
      StructField(name = "name", dataType = StringType, nullable = false),
      StructField(name = "surname", dataType = StringType, nullable = false),
      StructField(name = "date", dataType = DateType, nullable = false)
    ))

    val df: DataFrame = spark
      .read
      .schema(struct)
      .options(Map(
        "header" -> "true", // true değil "true" olmalı
        "delimiter" -> ",",
        "dateFormat" -> "dd-MM-yyyy",
        "nullValue" -> "cevat"
      ))
      .csv(base_path + "/test6.csv")

    df.printSchema()
    df.show()
  }
}










