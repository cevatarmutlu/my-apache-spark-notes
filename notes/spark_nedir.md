## Açıklama

Bu yazıyı benden başka okuyanlar için;

*İtalik*(?) bu şekildeki ifadeler ne demek istendiğini bilmediğim, bende tam olarak bir karşılığı olmayan şeylerdir. Bu bilmediğim şeyleri hızlı bir şekilde öğrenmeye çalışmayacağım. İlk önce dünyaya alışmak istiyorum. Alışma süreci sırasında kendi kendine zaten bu soruların cevaplarını bulabileceğimi düşünüyorum. Ek olarak bunun daha doğru bir öğrenme süreci olduğunu düşünmekteyim.


<br/>
<br/>

## Apache Spark

Apache Spark büyük *veri işleme*(?) motorudur. Büyük veriler üzerinde paralel işlem yapmaya yarar. Açık kaynak kodludur. Scala dili ile geliştirilmiştir. Hadoop' tan 100 kat daha hızlı olduğu iddia edilir.

Apache Spark' ın SQL, MLlib, Streaming, GraphX adında 4 tane modülü bulunmaktadır.

Temelde *veri mühendis*(?)leri kullanırmış ama *veri bilimci*(?)leri de *keşif amaçlı*(?) *veri analizi, özellik çıkarımı*(?) ve ML yapmak için Apache Spark' tan faydalanabilirler.

Scala, Python, Java, SQL, R desteği vardır.

*In-memory*(?) işlem kapasitesine sahipmiş

<br/>
<br/>

## Ne zaman Spark’ı kullanırız?

<br/>

__*Data entegrasyonu*(?) ve *ETL*(?)__: *Farklı kaynaklar*(?)dan veriler elde ediyoruz. Farklı kaynaklardan elde ettiğimiz bu verilerin *görselleştirilmesi*(?), *işlenebilmesi*(?), *analiz*(?)lerinin yapılabilmesi için *temizlenme*(?)si ve *birleştirilmes*(?)i işleminde kullanılır.

<br/>

__Makine öğrenmesi ve *İleri Seviye Analitik*(?)ler__: *Karmaşık algoritma*(?)lar kullanılarak *çıktı tahmini*(?), *hata tesbiti*(?), *saklı bilgilerin ortaya çıkarılması*(?) ve *girdi verilerine dayanarak karar verilmesi*(?). [Sanırım ML algoritmalarının yaptığı işleri Spark ile yapabiliyoruz demek istemiş. Bu bağlamda yukarıdaki ifadeler şunlar olabilir: Çıktı tahmini, input' tan output elde etme olabilir. Hata tespiti, noise(gürültülü) verilerin tespiti olabilir. Saklı bilgilerin ortaya çıkarılması, veri madenciliğinde eldeki verileriden kullanıcı hakkında bir şey öğrendiğimiz sistemi kastediyor olabilir. Girdi verilerine dayanarak karar verilmesi: Mesela kullanıcı bu reklama tıklar mı tıklamaz mı? sorusunun cevabı olabilir.]

</br>

*Interaktif Analitik*(?)ler (veya *İş Zekası*(?)): Burayı anlamadım. Anladığım şey şirket veya belli kurumların kararlarında kullanılıyor. Cümlenin tamamı: [
  Özel soruşturmalarda veya sürekli planlı panolarda ürün veya işletme kararlarını bildirmek için büyük veri kümelerinden fikir edinmek. Örnekler arasında DNV GL’nin enerji sektöründeki öngörücü analitiği, Capital One’ın finansal sektörde daha akıllı stratejik kararlar almak için veri kullanımı ve Shell’in envanteri ve tedarik zinciri yönetimini optimize etmek için analitik kullanımı sayılabilir.
]

</br>

__Gerçek zamanlı veri işleme (veya streaming)__: Düşük gecikme süresi ve yüksek güvenilirlikle sürekli veri yakalama ve işleme. Örnekler arasında Automatic’in daha akıllı otomobiller için gerçek zamanlı analitiği, Viacom’un video hizmetlerinin kalitesini izlemek için akış analizini kullanması ve HP’nin ürün sorunlarını tahmin etmek için 20 milyon IoT cihazından gelen akış verilerini analiz etme yeteneği bulunmaktadır. [Real-time olarak gelen verilerden kendi ihtiyacına göre bir şeyler öğrenmeye çalışıyor diye anladım]

<br/>
<br/>

## Apache Spark Ekosistemi

__Spark Core:__ Apache Spark' ın sunduğu işlevleri gerçekleştiren modüller ile veri kaynağı (Cassandra,Kafta, Elasticsearch gibi) arasına oturan ve yapılacak işlemleri gerçekleştiren katman. Şu şekilde bir benzetme kafamda oluştu: Apeche Spark' ın sunduğu modüller yazılım dilleri ise Spark Core ise Makine kodu olmaktadır. Donanım ise veri kaynağına karşılık gelmektedir. Apache Spark.

__Spark SQL + *Dataframes*(?)__: