# HW3

## **Encapsulation**
--Teknik olarak encapsulation, bir sınıfın verilerinin diğer sınıflardan gizlenmesi ve sadece ilgili sınıfın metotlarının verileri kullanabilmesi durumudur.

--Encapsulation, verilerin diğer sınıflardan saklanmasıdır dolayısıyla veri-gizleme(data-hiding) olarak da bilinir.

--Encapsulation, cınıftaki bütün değişkenlerin private olarak atanıp onlarla ilişkilendirilecek public set ve get metotlarıyla yapılabilir.

![GitHub Logo](Encapsulation.png)

## **Encapsulation Avantajları**

--Veri gizleme: Kullanıcının, sınıfın iç implementasyonu ile ilgili bilgisi sınırlandırılmış olur. Sınıfın değerleri ve değişkenlerin neler olduğu ve nasıl tutuldukları kullanıcıdan gizlenmiş olur. Sadece get ve set metotlarını izin verdiği suretle verilere ulaşabilir.

--Arttırılmış Esneklik: Sınıfın değişkenleri ihtiyaçlara göre metotlar yardımcılığı ile salt okunur ve salt yazılır hale getirilebilir. Salt okunur hale getirmek için sadece get metotları; salt yazılır hale getirmek için ise sadece set metotları kullanılır.

--Tekrar Kullanılabilirlik: Encapsulation sınıfların tekrar kullanılabilirliğini ve yeni ihtiyaçlara göre hızlı cevap verilebilmesini kolaylaştırır.

--Kodu Test Etme Kolaylığı: Encapsule edilmiş kod birim birim test için esneklik ve kolaylık sağlar.

(Harsh Agarwal makalesinden Türkçeye çevrilmiştir.)
## **Interfaces**

--Interfaceler bir sınfın neler yapacağını belirten ama nasıl yapılacağını belirtmeyen yapılardır. Sınıfların taslaklarıdır da denilebilir.

--Bir Interface bir sınıfın implemente etmesi zorunda olduğu metotları açıkça belirtir.

--Bir sınıf bir Interfaceden implemente edilmiş boş metotları doldurmaz is sınıf Abstract sınıf olarak adlandırılır.

![GitHub Logo](extends.png)

## **Interface Yapısı Neden Kullanılır?**

--Tamamen abstract bir yapı elde etmek amacıyla yapılır.

--Java çoklu kalıtımlama desteklemediğinden Interface yapısı ile gerekli kalıtımlama sağlanabilir.

--Loose Coupling da sağlanır. Objeler arası bağın esnetilebilir olması prensibi.

--Interfaceler abstract sınıflar oluşturmak için kullanılıyor ise neden direkt olarak abstract classlar kullanılmaz?
Abstract sınıflar non-final değişkenler tutabilirken, Interface değişkenleri final,static ve publictir.

## **Interface Hakkında Önemli Noktalar: **

--Interfaceler instance edilemezler lakin sınıflara implemente edilebilirler.

--Bir sınıf birden fazla Interfaceden implemente edilebilir.

--Interfaceler birden fazla interface ile genişletilebilir. 

--Bir Interfaceden implemente edilmiş class bütün metotları implemente etmelidir.

--Bütün metotları public ve abstract, bütün değişkenleri public,static ve finaldır.

--Çoklu Kalıtım yapabilmek için kullanılır.

(Mehak Kumar makalesinden Türkçeye çevrilmiştir.)



