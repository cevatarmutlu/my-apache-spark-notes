## Giriş

Merhabar. Bu repoda Apache Spark notlarım bulunmaktadır. Ağırlık olarak Scala ile yazmayı düşünüyorum lakin PySpark ile ilgili bir takım notlarda bulunmaktadır.

> Python kısmı eskidir. Scala ile devam etmeye karar verdim.

### Klasör isimleri ve barındırdıkları

klasör  | açıklama
------  | --------
install | Kurulumlar
doc     | Okuduğum dökümanlar
code    | Belirli işlemler: JSON okuma, yazma gibi 

## Linkler

* [Scala](scala)
    * [install](scala/install)
        * [Jupyter notebook' ta Scala yazma: Başka kaynak](https://medium.com/@bogdan.cojocar/how-to-run-scala-and-spark-in-the-jupyter-notebook-328a80090b3b)
    * [doc](scala/doc)
        * [:construction: SparkDoc: Interactive Analysis with the Spark Shell](scala/doc/scala_doc_01.ipynb)
        * [SparkDoc: RDD Programming Guide](scala/doc/scala_doc_2_RDD.ipynb)
    * [code](scala/code)
        * [Read and Write: JSON](scala/code/read_write_json.ipynb)
        * [Read and Write: CSV](scala/code/read_write_csv.ipynb)
* [Python](python)
    * [install](python/install)
    * [doc](python/code)
        * [DataFrame](python/doc/PySparkDataFrame.ipynb)
        * [Broadcast and Accumulator](python/doc/python_spark_broadcast_and_accumulator.ipynb)
        * [Context and RDD](python/doc/python_spark_context_and_rdd.ipynb)
        * [SQL with dataset](python/doc/python_spark_sql-with_dataset.ipynb)
    * [code](python/code)
        * [JSON: read and write](python/code/pySparkJSON.ipynb)
        * [PostgreSQL: read and write](python/code/pySparkPostgreSQL.ipynb)
        * [CSV: read](python/code/csvFile.ipynb)
