## Kurulum

`Apache Spark` `pip` üzerinden de kurabiliyormuş. Bu bilgiyi öğrendikten sonra aklıma gelen şey bir tane `virtualenv` oluştururum ve Spark' ı o virtualenv üzerinden çalıştırırım oldu. Hem bir sıkıntı olursa oluşturduğum env' yi silerim diye düşündüm.

Apache Spark' ı kurmak için:
```
pip install pyspark
```

`virtualenv`' yi aktif ettikten sonra terminale `pyspark` yazarak Spark' ı çalıştırabiliyoruz. İlk olarak çalıştırdığımda `JAVA_HOME is not set` hatası verdi. Bu durumu aşmak için `Java`' yı kurmam gerekiyordu.

<details>
<summary>
<span style="font: 17px bold">Java Kurulumu</span>
</summary>
<br/>

JDK indirdikten sonra inen `tar.gz` dosyasını çıkardım. Çıkan dosya `OpenJDK11U-jdk_x64_linux_hotspot_11.0.9.1_1` adında bir klasördü ve o klasörün içinde ise `jdk-11.0.9.1+1` adında başka bir klasör vardı.

İçteki klasörü `jdk-11` adıyla `/opt/java` klasörünün altına taşıdım.

```
sudo mkdir /opt/java
sudo mv /OpenJDK11U-jdk_x64_linux_hotspot_11.0.9.1_1/jdk-11.0.9.1+1 java/jdk-11
```

Taşıma işleminden sonra `.bashrc` dosyasının içine `java` yolunu ekledim.

```
JAVA_HOME="/opt/java/jdk-11"
export PATH="${PATH}:$NODE_HOME/bin:$JAVA_HOME/bin"
```

Aktifleştirmek için:
```
source .bashrc
```

</details>

 ---

<br/>

`Java`' yı kurduktan sonra `env` aktifken `pyspark` yazınca, pyspark çalışmış oldu.

Bu haliyle Spark sadece terminal üzerinden çalışıyor. Onu Python dosyasını çalıştırarak çalıştırmak için neler yapılabilir araştırdım. En kolay yol `findspark` adında bir modül kurmak.

```
pip install findspark
```

Bir python dosyasının içine aşağıdaki kodları yazdım: 

```python
import findspark
import pyspark
findspark.init()
sc = pyspark.SparkContext()
```

Yukarıdaki kod sorunsuz çalışırsa `pyspark`' ı Python dosyası içine yazarak çalıştırabiliyorum demektir. Oluşturduğum Python dosyasını çalıştırdım. `SPARK_HOME` olmadığı için hata verdi.

<details>
<summary>
<span style="font: 17px bold">SPARK_HOME</span>
</summary>
<br/>

Bu işlem için ise `.bashrc` dosyasının içine aşağıdaki kısmı ekledim.

```bash
export SPARK_HOME="env_yolu/env_adı/lib/python3.8/site-packages/pyspark"
```

Bu yol oluşturduğum `env` içindeki `pyspark`' ın dosya yolu.

Yukarıdaki işlemi yaptıktan sonra:
```
source .bashrc
```

Eğer python dosyasını VsCode üzerinden çalıştırıyorsan VsCode' u kapat-aç ya da terminal üzerinden çalışıyorsan terminali kapat ve env' yi tekrar aktifleştir. Şimdi Python dosyasını tekrar çalıştır.

</details>

---

<br/>

Şimdi `SPARK_HOME` hatasından da kurtulmuş olman lazım. 

Şimdi istersen Spark' ı `Jupyter Notebook` üzerinden çalıştırabiliriz. Bu işlemi yapabilmek için oluşturduğumuz `env`' yi `Jupyter Notebook` `kernel`' ı olarak `Jupyter Notebook`' a eklemeliyiz.

<details>
<summary>
<span style="font: 17px bold">
Env' yi Kernel olarak kullanma
</span>
</summary>
<br/>

Oluşturduğumuz `env` ' yi `Jupyter Notebook` `kernel`' ı olarak kullanmak için env' ye aşağıdaki modülü kurmamız gerekiyor.

```
pip install ipykernel
```

Kurulduktan sonra aşağıdaki işlem ile kurduğumuz `env`' yi `Jupyter kernel`' ı olarak kullanabileceğiz.
  
```
python -m ipykernel install --user --name ENVNAME
```

Bu işlemlerden sonra terminal' e `jupyter-notebook` yazarak oluşturduğumuz `env`' yi `kernel` olarak kullanabiliriz. Yeni `ipbynb` dosyasını oluşturmak için `New` butonuna tıkladığımızda `Notebook` kısmında `env`' mizin adını `--name` parametresine veridiğimiz değerle görmemiz gerekiyor.

</details>

---

<br/>

Şimdi `Spark`' ı başarılı bir şekilde kurmuş olman gerekiyor. Kolay gelsin.