Umarım Düzenlerim :)

## Kurulum

İlk önce Spark' ın kendi sitesindeki Spark' ı indirebileceğim siteye girdim. Pip üzerinden Spark' ı kurabileceğimi gördüm. Bir tane virtualenv oluşturdum ve spark' ı bu env' ye kurdum.

```
pip install pyspark
```

env aktif olarak terminale pyspark yazında `JAVA_HOME is not set` hatası verdi.

VSCode' un java ekleleri sayesinde internetten sanırım OpenJDK11' i indirdim. VsCode' un kendisi java eklentilerini kurduktan sonra JDK var mı yok mu kontrol ediyor eğer yoksa indirmek için bir link veriyor.

jdk indikten sonra inen tar.gz dosyasını çıkardım ve dosyayı. Çıkan dosya şu şekildeydi `OpenJDK11U-jdk_x64_linux_hotspot_11.0.9.1_1` ve içinde `jdk-11.0.9.1+1` adında bir klasör vardı.

```
sudo mkdir /opt/java
sudo mv /OpenJDK11U-jdk_x64_linux_hotspot_11.0.9.1_1/jdk-11.0.9.1+1 java/jdk-11
```
olarak taşıdım.

Daha sonra `.bashrc` klasörünün içine aşağıdaki yazdım.

```
JAVA_HOME="/opt/java/jdk-11"
export PATH="${PATH}:$NODE_HOME/bin:$JAVA_HOME/bin"
```
sonra 
```
source .bashrc
```

Bu sayede oluşturduğum env aktifken pyspark yazdığımda spark çalışmıs oldu.

Bu haliyle spark terminal üzerinden çalışan bir şey. Onu Python script' i ile çalıştırmayı araştırdım. En kolayı findspark adında bir modül kurmak.

```pip install findspark````

Bir python dosyasının içine aşağıdaki kodları yazdım 

```python
import findspark
import pyspark
findspark.init()
sc = pyspark.SparkContext()
```

oluşturduğum env' nin yorumluyucusu ile bu python dosyasını çalıştırdım. `SPARK_HOME` dan dolayı hata verdi.

Onun için ise `.bashrc` dosyasına

```bash
export SPARK_HOME="env_yolu/env_adı/lib/python3.8/site-packages/pyspark"
```

```
source .bashrc
```

sonra eğer python dosyasını vscode üzerinden çalıştırıyorsan vscode' u kapat aç ya da terminal üzerinden çalışıyorsan terminali kapat ve env' yi tekrar aktifleştir ve python dosyasını tekrar çalıştır. Çalışacaktır.

Şimdi jupyter notebook üzerindende çalıştırmayı deniyelim.

env' ye

```
pip install ipykernel
```

sonra 
  
```
python -m ipykernel install --user --name ENVNAME
```

sonra env' yi deaktif et. Terminal' e jupyter-notebook yaz ve oluşturduğun env adı ile yeni bir ipbynb dosyası oluşturabiliyorsun.