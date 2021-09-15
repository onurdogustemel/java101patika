# java101patika

# Ödev 1
## Not Ortalaması Hesaplayan Program

Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. 

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...


# Ödev 2

## KDV Tutarı Hesaplayan Program

Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;

Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.


# Ödev 3
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

## Formül

Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)


# Ödev 4

## Taksimetre Programı

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.


# Ödev 5

## Dairenin Alanını ve Çevresini Hesaplayan Program


Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360


# Ödev 6

## Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

### Formül

Kilo (kg) / Boy(m) * Boy(m)


Çıktısı
```
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
```


# Ödev 7

## Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

### Meyveler ve KG Fiyatları

Armut : 2,14 TL

Elma : 3,67 TL

Domates : 1,11 TL

Muz: 0,95 TL

Patlıcan : 5,00 TL

### Örnek Çıktı

```
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
```


# Ödev 8

## Basit Hesap Makinesi Yapımı

Java koşullu ifadeler ile basit hesap makinesi yapımı.

Videodaki hesap makinesini switch-case kullanarak yapınız.

# Ödev 9

## Kullanıcı Girişi

Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı.

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.


# Ödev 10

## Sınıfı Geçme Durumu

Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.


# Ödev 11

## Hava Sıcaklığına Göre Etkinlik Önerme

Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.

Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.

Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.

Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.

Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.


# Ödev 12

## Sayıları Büyükten Küçüğe Sıralayan Program

Java koşullu ifadeler ile girilen 3 sayıyı büyükten küçüğe sıralayan program yapımı.

Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.