package com.muhammet.designpatern.solid;

public class Runner {
    public static void main(String[] args) {
        /**
         * SOLID - ACID - AGILE
         * Amaç:
         * 1- Yazılımın esnek olmasını ve yeniden kullanılabilir olmasını sağlamak.
         * 2- Kodların daha anlaşılıur olmasını sağlar ve okunabilirliği arttırır.
         * 3- Kodların modülerliğini arttırar sadece method bazında değil sınıf ve
         * proje bazında da kodların tekrar etmemesini sağlar.
         * 4- Kodları yazarken SOLID prensiplerine uygun şekilde yazmaya özen gösterir
         * seniz aslında size maliyet gibi görünen zamandan tasarruf etmiş olursunuz.
         * kodları daha sonra revize etmek zorunda kalmaz ve geliştirmeye açık olursunuz.
         *
         * S - Single Responsbility
         * Interface, Class ve Method larınız sadece tek bir iş yapmalılar.
         * Örn:
         * IMusteriRepository.class -> sadece müşteri ile alakalı DB işlemlerini yapmak.
         * ICrud, IService, v.s. -> sadece DB ler için işlem bütünlüğünü sağlıyor.
         * save(Musteri m, IslemTuru t), findById(), findOptionalByUsernameAndPassword() -> bir method sadece bir iş yapar.
         *
         * O - open-closed
         * yazdığınız method ve class lar değiştirilmeye ve değişmime kapalı olmalıdırlar ancak
         * gelişime açık olmalıdırlar.
         * Services -> findAll(), filter-> active, yaptığı işlemler
         * findAll(){filter, silimiş hesaplar, aktif almayan hesapalr gösterilmesin } SORUN,
         * başka bir method içinde silinmiş hesapların aktivasyonunu raporlamam gerekiyordu, ancak
         * hiç data gelmediği için sorunu tespit edemedim.
         * Services -> findAllIsActiveTrue();
         *
         * L - Liskov substitution
         * Gereksiz method kullanımlarından uzakdurun, mümkün olduğu kadar  ortak kullanılan methodları
         * miras alarak kullanın, eğer ortak genişleme yapıları ce merhodlar kullanıcak sanız Interface
         * miras alarak genişlemeleri yapınız.
         * MusteriService, UrunService, SatisService -> save(); - ServiceManager<Entity,ID>{ save(); findall();}
         *
         * I - Interface Segregation
         * Uygulama içinde sorumluluğu bulunan sınıf ve methodların olabildiğinde kalıplara uymasını
         * sağlamak isteriz. bu nedenle interface lerden yararlanırız. Ancak, burada dikkat edilmesi
         * gereken bir husus vardır. Her sınıf için bir interface değil, aynı görevleri üstlenen
         * sınıflar için tek bir interface kullanmak doğru olacaktır.
         *
         * D - Dependency Inversion
         * Bir projeyi yaparken, kodlama birilk ve kodların azaltılması adına miras alma yöntemlerini
         * sıklıkla kullanırız. Ancak burada dikkat edilmez ise kodların bağımlılığı sıkılaşır ve
         * bir süre sonra sınıfların değişim ve dönüşümleri sorun yaratmaya başlar.
         * A->
         * B-A, C-A, G-A
         * E-G, D-B
         * ---------------
         * MusteriRepository(JDBC), UrunRepository, SatısService
         * MusteriRepositoryH(Hibernate)
         * Satıs -> Musteri ve Urun -> MusteriRepository mr = new MusteriRepository();
         * ---------------------
         * ÇokBiçimlilik
         * --------------
         * Ödeme Sistemi -> KrediKartı, Çek, Nakit, DijitalPara
         *
         * İslem{
         *     Odeme odeme = new Odeme();
         *     odeme.odemeYap(KrediKartı);
         *
         * }
         * ->
         */
    }
}
