## Açıklama

Aşağıdaki yazılar bana ait değildir. Yazıların kaynakları gerekli başlıkta yazanların isimleri de anılarak verilmiştir.

Bu yazıyı benden başka okuyanlar için;

*İtalik*(?) bu şekildeki ifadeler ne demek istendiğini bilmediğim, bende tam olarak bir karşılığı olmayan şeylerdir. Bu bilmediğim şeyleri hızlı bir şekilde öğrenmeye çalışmayacağım. İlk önce dünyaya alışmak istiyorum. Alışma süreci sırasında kendi kendine zaten bu soruların cevaplarını bulabileceğimi düşünüyorum. Ek olarak bunun daha doğru bir öğrenme süreci olduğunu düşünmekteyim.


<br/>
<br/>


## Kaynak 1

İlk [kaynak][1] olarak Amine YEŞİLYURT tarafından yazılan medium yazısını okudum. Dünyaya yabancı olduğumdan diye tahmin ediyorum yazılanların çoğunu anlamadım. 

Hanımefendinin yazıklarına kendim anladığım şekilde bir şeyler eklemeye çalıştım ve anlamadığım şeyleri belirttim.

[1]: https://medium.com/@amine.yesilyurt/apache-spark-nedir-sparka-giri%C5%9F-582d2e0059af

<br/>
<br/>

### Apache Spark

Apache Spark büyük *veri işleme*(?) motorudur. Büyük veriler üzerinde paralel işlem yapmaya yarar. Açık kaynak kodludur. Scala dili ile geliştirilmiştir. Hadoop' tan 100 kat daha hızlı olduğu iddia edilir.

Apache Spark' ın SQL, MLlib, Streaming, GraphX adında 4 tane modülü bulunmaktadır.

Temelde *veri mühendis*(?)leri kullanırmış ama *veri bilimci*(?)leri de *keşif amaçlı*(?) *veri analizi*(?), *özellik çıkarımı*(?) ve ML yapmak için Apache Spark' tan faydalanabilirler.

Scala, Python, Java, SQL, R desteği vardır.

*In-memory*(?) işlem kapasitesine sahipmiş.

<br/>
<br/>

### Ne zaman Spark’ı kullanırız?

<br/>

__*Data entegrasyonu*(?) ve *ETL*(?)__: *Farklı kaynaklar*(?)dan veriler elde ediyoruz. Farklı kaynaklardan elde ettiğimiz bu verilerin *görselleştirilmesi*(?), *işlenebilmesi*(?), *analiz*(?)lerinin yapılabilmesi için *temizlenme*(?)si ve *birleştirilmes*(?)i işleminde kullanılır.

<br/>

__Makine öğrenmesi ve *İleri Seviye Analitik*(?)ler__: *Karmaşık algoritma*(?)lar kullanılarak *çıktı tahmini*(?), *hata tesbiti*(?), *saklı bilgilerin ortaya çıkarılması*(?) ve *girdi verilerine dayanarak karar verilmesi*(?). [Sanırım ML algoritmalarının yaptığı işleri Spark ile yapabiliyoruz demek istemiş. Bu bağlamda yukarıdaki ifadeler şunlar olabilir: Çıktı tahmini, input' tan output elde etme olabilir. Hata tespiti, noise(gürültülü) verilerin tespiti olabilir. Saklı bilgilerin ortaya çıkarılması, veri madenciliğinde eldeki verileriden kullanıcı hakkında bir şey öğrendiğimiz sistemi kastediyor olabilir. Girdi verilerine dayanarak karar verilmesi: Mesela kullanıcı bu reklama tıklar mı tıklamaz mı? sorusunun cevabı olabilir.]

</br>

__*Interaktif Analitik*(?)ler (veya *İş Zekası*(?))__: Burayı anlamadım. Anladığım şey şirket veya belli kurumların kararlarında kullanılıyor. Cümlenin tamamı: [
  *Özel soruşturmalar*(?)da veya *sürekli planlı panolar*(?)da ürün veya işletme kararlarını bildirmek için büyük veri kümelerinden fikir edinmek. Örnekler arasında DNV GL’nin enerji sektöründeki öngörücü analitiği, Capital One’ın finansal sektörde daha akıllı stratejik kararlar almak için veri kullanımı ve Shell’in envanteri ve tedarik zinciri yönetimini optimize etmek için analitik kullanımı sayılabilir.
]

</br>

__Gerçek zamanlı veri işleme (veya streaming)__: Düşük gecikme süresi ve yüksek güvenilirlikle sürekli veri yakalama ve işleme. Örnekler arasında Automatic’in daha akıllı otomobiller için gerçek zamanlı analitiği, Viacom’un video hizmetlerinin kalitesini izlemek için akış analizini kullanması ve HP’nin ürün sorunlarını tahmin etmek için 20 milyon IoT cihazından gelen akış verilerini analiz etme yeteneği bulunmaktadır. [Real-time olarak gelen verilerden kendi ihtiyacına göre bir şeyler öğrenmeye çalışıyor diye anladım]

<br/>
<br/>

### Apache Spark Ekosistemi

<br/>

__Spark Core:__ Apache Spark' ın sunduğu işlevleri gerçekleştiren modüller ile veri kaynağı (Cassandra,Kafta, Elasticsearch gibi) arasına oturan ve yapılacak işlemleri gerçekleştiren katman. Şu şekilde bir benzetme kafamda oluştu: Apache Spark' ın sunduğu modüller yazılım dilleri ise Spark Core ise Makine kodu olmaktadır. Donanım ise veri kaynağına karşılık gelmektedir. Apache Spark.

</br>

__Spark SQL + *Dataframes*(?)__: Birçok veri bilimcisi, veri analisti ve iş zekası kullanıcıları, veri keşfi için *interaktif SQL sorguları*(?)na güvenir. *Structured data*(yapılandırılmış veri) processing işleminde kullanılır. *DataFrames olarak adlandırılan bir soyutlama sağlar*(?). Ayrıca dağıtık SQL sorgu motoru olarak da davranabilir [Sanırım üzerinde SQL sorguları yaparak veri çekebiliriz diyor]. *Değiştirilmemiş Hadoop Hive sorguları*(?)nın mevcut dağıtımlarda ve verilerde 100 kata daha kadar hızlı çalışmasını sağlar. Spark SQL, aynı zamanda Spark ekosisteminin geri kalanıyla güçlü bir entegrasyon sağlar. (Örneğin: SQL sorgu işleminin makine öğrenmesiyle entegre edilmesi)

<br/>

__Streaming__: Birçok uygulama sadece batch verileri değil, aynı zamanda gerçek zamanlı olarak akan yeni verileri işleme ve analiz etme yeteneğine de ihtiyaç duyar. *Spark’ ın zirvesinde çalışan* (sanırım diğer modüller gibi en üst katman olarak çalışmasından bahsediyor)  Spark Streaming, Spark’ın kullanım kolaylığını ve *hata tolerans özellikleri*(?)ni birleştirirken, hem akan veriler hem de geçmiş veriler üzerinde güçlü etkileşimli ve analitik uygulamalar sağlar. HDFS, Flume, Kafka ve Twitter dahil olmak üzere çok çeşitli popüler veri kaynakları ile kolayca entegre olur.

<br/>

__MLlib(Machine Learning)__: *Aksiyon almaya yarayan öngörüler*(?) elde etmek için, makine öğrenmesi, büyük verinin işlenmesinde kritik bir aşama olarak ortaya çıkmıştır. Ölçeklenebilir makine öğrenmesi kütüphanesi olan MLLib, hem yüksek kalitede algoritmalar( başarıyı artırmak için birden fazla iterasyon yapan) sunar hem de hız sunar( MapReduce[Hadoop' a ait bir yapı]’den 100 kat fazla). Kütüphane Java, Scala ve Python’da Spark uygulamalarının bir parçası olarak kullanılabilir.

<br/>

__Grafik Hesaplama (GraphX)__: GraphX Spark’ın üzerinde bulunan *grafik hesaplama*(?) motorudur. Kullanıcılara etkileşimli graph yapısında çıktı oluşturmasına olanak sağlar. [Pythondaki Scikit Learn gibi sanırım]

Spark' ın rakipleri Hadoop, Kafka, Apex, Cloudera.


<br/>
<br/>


## Kaynak 2

İkinci [kaynak][2] olarak Özgün ÜNLÜ' nün bu güzel yazısını okudum. Hâlâ anlamadığım çok şey olsada bir çok şeyi öğrenmemi sağlamıştır. Gerçekten güzel bir yazı olmuş.

Yazısında bazı yerleri doğrudan aldım. Bazı yerleri ise biraz değiştirerek yazdım.


[2]: https://ozgununlu.com/blog-detay/apache-spark-nedir

<br/>
<br/>

### Apache Spark Nedir?

Büyük veriyi işlemek amacıyla ortaya çıkmıştır. Apache Spark; *Directed Acyclic Graph*(?) motoruna sahiptir.

Apache Spark; yapay öğrenme algoritmalarının dağıtık implementasyonu konusunda Hadoop'a kıyasla çok daha iyi performans vermektedir.

Apache Spark' ın Hadoop' un doğrudan bir alternatifi olduğunu söylemek doğru olmazmış. Apache Spark, Hadoop' un eksik kaldığı yerlerde tamamlayıcı görevinde kullanıldığını söylemek daha doğru olurmuş.

Hadoop, binlerce sunucuda bulunan petabyte' larca veriyi saklayıp işleyecek şekilde tasarlanmıştır. Apache Spark ise Hadoop' a kısayla daha az veriyi in-memory şekilde işlemek ve Hadoop' tan daha hızlı netice almak için tasarlanmış.

Spark; Hadoop'a kıyasla HDFS gibi bir *storage çözümü*(?) sunmaz. Ancak, Spark sayesinde HDFS üzerinden okuma yapmak mümkün hale gelir.

<br/>

### Hadoop ve Apache Spark Arasındaki Farklar ve Benzerlikler

Her ikiside büyük veriyi işler.

Hadoop veriyi işler ve kaydeder. Verilerin saklanması için HDFS, işlenmesi için MapReduce sistemini kullanır.

Apache Spark ise sadece veriyi işler, kaydetmez. Kendisine ait dosya yönetim sistemi ve veri depolama aracı bulunmaz. Bu sebepten dolayı, Spark'ın HDFS veya farklı bir bulut tabanlı veri platformuyla entegre edilmesi şarttır.

*Hadoop, başka makinelere gerek duymaksızın büyük verilerin saklanabileceği HDFS yapısını bulundurmaktadır.*(?)

Spark, veriyi RAM'de işler(sanırım in-memory bu demek). Hadoop ise bundan farklı olarak MapReduce yapısı sayesinde veriyi diskte tutarak işler. Bu özelliğinden dolayı, Spark'ın Hadoop'tan tam 100 kat daha hızlı olduğu iddia edilmektedir. Ancak, bu iddianın duruma göre değişebileceğini söylemek gerekir.

Spark; belleğe sığmayan verileri işlemek amacıyla diskte kullanmaktadır. Bu durumda, elde edilen veri kümesinin hali hazırdaki RAM'den daha büyük olması durumunda Hadoop MapReduce, Spark'a kıyasla daha hızlı olabilir.

Apache Spark'ın bunlar dışında da farklı avantajları söz konusudur. Apache Spark içerisinde Spark Streaming bulunur. Bu sayede, Spark, yakın gerçek zamanlı veri işleme için de kullanılmaktadır. Özellikle, sosyal medya sitelerinden elde edilen verilerin gerçek zamanlı olarak analitiğinin yapılmasında Spark'ın bu özelliği işe yarar. 

Hadoop MapReduce ise Spark'tan farklı olarak var olan verileri işlemek amacıyla ortaya çıkmıştır.

<br/>

### Apache Spark'ın Özellikleri

RDD ismindeki *yüksek seviyeli bir operatöre*(?) sahiptir. RDD sayesinde *yapısal olmayan datalar*(sanırım unstructured data) ile süreklilik gösteren işlemleri yapmak daha kolay hale gelir. 

Spark; makine öğrenmesi uygulamaları geliştirmek adına MLib kütüphanesi sunmaktadır. 

GraphX kütüphanesi sayesinde graph tabanlı hesaplamalar yapmak mümkündür. 

Spark SQL adında SQL diline çok benzeyen bir sorgu diline sahiptir. 

Hadoop'a kıyasla birden çok veri kümesinin birleştirilmesi gereken yerlerde çok daha hızlı bir şekilde join işlemi gerçekleştirebilir. 

Spark, çalıştığı sırada ortaya çıkan bir hatayı rahatlıkla telafi edebilir. Arıza durumunda Spark uygulamasının en baştan başlatılmasına gerek yoktur. 

Spark, güvenlik konusunda da Hadoop'a kıyasla daha avantajlıdır. Spark'ta Shared Secret sistemi vardır. Bu sistem, kimlik doğrulama sistemi sayesinde her iki tarafın da gizliliğinin korunmasını sağlar.

<br/>

### Apache Spark mı Yoksa Hadoop mu Seçilmelidir?

Spark'ın avantajları hızlı performans, *sürekli işlemlerde*(?) kolaylık, grafik işleme, gerçek zamanlı analiz, makine öğrenimi bulunmaktadır. 

Projesinde bütünlüğe sahip bir dosya sistemine ihtiyacı olanların aynı zamanda büyük boyutlu veri setleriyle çalışanların Hadoop kullanması daha mantıklı olacaktır. 

Veri güvenliğini ön planda tutanlar ve gerçek zamanlı bir uygulama geliştirmeyecek olanlar için de Hadoop öncelikli olmalıdır. 

Gerçek zamanlı işlemler yapmak isteyenler, bunun yanı sıra işlediği verileri saklamak isteyenler için HDFS kullanımında her iki teknolojiden de faydalanmak mümkün olacaktır. [Anlamadım. Yukarıda gerçek zamanlı uygulama geliştirmeyecek olanların Hadoop seçmesi daha iyi olur diyor ama burada ise HDFS kullanımında her ikisi de gerçek zamanlı uygulamalarda kullanılabilir diyor.]

<br/>

### Apache Spark Ne İşe Yarar?

*Import ve export transform*(?) konusunda Spark'ın en önemli ortam olması, ciddi bir avantaj teşkil etmektedir. 

Buna ek olarak, Apache Spark; *sürekli işlem*(?)lerde yüksek performans verir. 

Spark'ın *Hive*(?) ve HDFS ile native entegrasyonu bulunmaktadır. 
