## Scala kurulumu

Çok basit bir kurulumu bulunmakta. Okumaktansa [Scala](https://www.scala-lang.org/download/)' nın resmi sayfasına gidip yapmak daha kolay olacaktır.

Bu belgenin hazırlandığı tarihte `Scala3` ve `Scala2` bulunmaktaydı. Ve yine bu belgenin hazırlandığı tarihte Spark sadece `Scala2`' yi desteklemekteydi. Bu sebeple kurulum `Scala2` kurulumudur.

### Adım 1: Java kurulumu

Scala' nı download sayfasına giderek Scala2' yi seçin. Açılan sayfada ilk önce Java8 ya da Java11' in kurulu olduğundan emin olunmasını istiyor. Bunun için:

    java -version

Eğer bu komuttan şöyle bir çıktı gelmeli:

    openjdk version "1.8.0_312"
    OpenJDK Runtime Environment (build 1.8.0_312-8u312-b07-0ubuntu1~20.04-b07)
    OpenJDK 64-Bit Server VM (build 25.312-b07, mixed mode)

İlk satırdaki 1.8 ifadesi Java11 için farklı olabilir.

Eğer `-version` ifadesinden hata alıyorsanız Java8 kurmak için:

    sudo apt install openjdk-8-jdk -y

### Adım 2: IDE' mı SBT' mı

Scala2 download sayfasındaki birinci adım olan Java kontrolünden sonra ikinci adımda Scala' yı iki şekilde kurabileceğimizden bahsediliyor. İlki IDE üzerinden ikincisi sbt(Scala's build tool) üzerinden. IDE üzerinden kurmak daha kolay. İsterseniz IDE üzerinden kurabilirsiniz. Ben sbt üzerinden kuracağım.

`Download SBT` butonuna basın ve bu butonun altındaki `GETTING STARTED WITH SCALA AND SBT ON THE COMMAND LINE` ifadesini ayrı tab' ta açın çünkü o linkte basit bir Scala örneği anlatılıyor.


### Adım 3: Scala kurulumu

`Download Sbt` butonuna tıklayınca açılan sayfadan kullandığınız işletim sistemine göre kurulum adımlarını takip edin. Ben debian tabanlı Linux dağıtımı olan Ubuntu' yu kullandığım için `Linux (deb)` seçeneğindeki satırları terminalime yapıştıracağım.

Bu kopyala ve terminale yapıştır işlemi bittikten sonra kurulum tamamlanmıştır.


### Adım 4: Basit bir Scala öğreneği

Downlaod sayfasındaki `GETTING STARTED WITH SCALA AND SBT ON THE COMMAND LINE` linkindeki tab' a geçerseniz `Create the project` ve altındaki kısımları inceliyerek proje oluşturma vb gibi işlemleri görebilirsiniz.

## Jupyter notebook' ta scala-spark 

https://medium.com/@bogdan.cojocar/how-to-run-scala-and-spark-in-the-jupyter-notebook-328a80090b3b