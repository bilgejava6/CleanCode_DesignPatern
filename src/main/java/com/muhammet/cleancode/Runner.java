package com.muhammet.cleancode;

public class Runner {
    public static void main(String[] args) {
        /**
         *  Clean Code?
         *  1- Kodun anlaşılır ve açık bir şekile yazılması. (code smell)
         *  2- Kodlarınızı(Class ları) soyutlarken oluşturduğunuz sınıfların tek bir görev yapmasını sağlayın.
         *  Tek sorumluluk ilkesi (sinlge responsbility).
         *  3- Sınıflarınızın olabildiğince az method kullanmasını sağlayınız. İdeal 10-15 Method.
         *  4- Tek bir method tek bir iş yapmalıdır. Bir method un yaptığı iş-kod başka bir method
         *  gösdesinde copy-paste yapılmamış ve kullanılmamış ise muhtemelen doğru bir iş yapıyorsunuzdur.
         *  methodlarda tekrar eden kodunuz ASLA olmasın.
         *  5- Methodlarınızı olabildiğince küçük tutun. 15-20 satır aralığında olması tercihimizdir.
         *  içinde kullanacağınız değişkenleri max 2-3 değişken olacak şekilde kurgulayın.
         *  6- MEthodlarda karar yapıları kullanılmaktadır. Bu karar yapılarını 7-8 aralığından az tutmak
         *  kaydıyla kurgulamak doğrudur.
         *  7- Method yazarken ilk başlarda küçük olabilir. ancak ilerleyen zaman içinde gelen isterler neticesinde
         *  method genişlemeye başlar ve okunurluğu azalır. Böyle durumlarla karşılaşmamak için kodlarınızı 5. maddede
         *  olduğu şeklinde muhafaza etmek için bölmek mantıklıdır.
         *  8- Methodlarımız bir birlerine yakın işlemler yapabilirler. yakın işlemler yapılan kod öbeklerini
         *  başka bir methodta toplayıp diğer methodlarınızın bu yeni mehodu çağırmasını sağlarsınız.
         *  9- Bir proje içinde method isimlerinin bir standardı olmalıdır. Method isimlerini proje için nasıl
         *  yazmaya karar verdi iseniz tüm proje boyunca öyle yazınız.
         *  10- Method ismi tanımlarken, olabildiğince ingilizce kullanın. İsimlendirme yaparken, yaptıkları
         *  işi niteleyen bir kelime kullanının ve olabildiğince emir kipi kullanarak tanımlayın.
         *  11- Method isimlendirmesi yaparken asla kısatlma kullanmayın. uzun uzuuuuuuun yazın.
         *  örn: satisSonrasiMusteriIdsiUzerindenAlinanUcretKayitlarininToplamTutari(long musteriId);
         *  12- Mutlaka methodlarınızın üzerinde yorum satırlarını ekleyin. Uygulamayı kendiniz kullanacak,
         *  tek başınıza yazacak olsanız bile açıklama yazmadan method yazmayın.
         *  13- Methodlarınıza isim verirken zorlanıyorsanız,muhtemelen kodu yanlış yazmışsınızdır ve method
         *  birden çok iş yapıyordur.
         *  14- Bir proje içinde projeye başlamadan, ClassName, MEthodName ve DataTypeName atsarımları belirlenmeli
         *  ve bu şekilde proje bitene kadar aynen kalmalıdır.
         *  ClassName       -> MusteriRepository
         *  MehodName       -> findAllByName
         *  DataTypeName    -> lastmount, createat, v.s. final IPADRESS
         *
         *
         */

    }
}
