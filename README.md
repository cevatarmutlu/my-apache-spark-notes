## Giriş

Merhabar. Bu repoda Apache Spark notlarım bulunmaktadır. Ağırlık olarak Scala ile yazmayı düşünüyorum lakin PySpark ile ilgili bir takım notlarda bulunmaktadır.

> Python kısmı eskidir. Scala ile devam etmeye karar verdim.

## Klasör isimleri ve barındırdıkları

klasör  | açıklama
------  | --------
install | Kurulumlar
doc     | Okuduğum dökümanlar
code    | Belirli işlemler: JSON okuma, yazma gibi 

* [Scala](scala)
    * [install](scala/install)
    * [doc](scala/doc)
    * [code](scala/code)
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
