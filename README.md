🧠 Effective Java – Items 85-90 Serialization Demos

Bu proje, Joshua Bloch’un Effective Java kitabındaki 85–90. maddeleri (Serialization bölümü) örnek kodlar ve açıklamalarla göstermektedir.
Her maddeye ait örnek, Java’da serileştirmenin güvenlik, performans ve sürdürülebilirlik açısından nasıl ele alınması gerektiğini açıklar.

📚 İçerik
Madde	Konu	Amaç
Item 85	Prefer alternatives to Java Serialization	Java serileştirmenin neden tehlikeli olduğunu, saldırı yüzeylerini ve JSON/Protobuf gibi alternatifleri gösterir.
Item 86	Implement Serializable with great caution	Serializable kullanırken dikkat edilmesi gereken güvenlik ve bakım risklerini gösterir.
Item 87	Consider using a custom serialized form	Default form yerine mantıksal (logical state) serileştirme örneği içerir.
Item 88	Write readObject methods defensively	readObject() içindeki güvenlik önlemleri ve MutablePeriod saldırısının çözümünü gösterir.
Item 89	For instance control, prefer enum types to readResolve	Singleton nesnelerin readResolve() veya enum ile nasıl korunacağını gösterir.
Item 90	Consider serialization proxies instead of serialized instances	Serialization Proxy Pattern uygulaması ile güvenli serileştirme örneği sunar.

⚙️ Çalıştırma
1. Gereksinimler

Java 17+

Gradle veya IntelliJ IDEA (Gradle destekli)

2. Derleme
./gradlew build


🔍 Kavramsal Özet
Konsept	Açıklama
Serialization	Nesnenin bayt akışına çevrilip diske veya ağ üzerinden taşınması.
Deserialization	Bu bayt akışından nesnenin tekrar oluşturulması.
readObject()	Nesne okunurken çalışan özel “gizli constructor” benzeri metot.
readResolve()	Deserialize edilen nesne yerine mevcut tek örneği (singleton) döndürür.
Serialization Proxy	Deserialization’ı public constructor’a yönlendirerek güvenliği sağlar.
🧱 Güvenlik Notları

Güvenilmeyen veriyi asla deserialize etme.

transient alanları doğru kullan; gizli bilgileri yazma.

serialVersionUID’yi manuel tanımla.

ObjectInputFilter veya whitelist kullan.

Eğer mümkünse JSON / Protobuf gibi modern formatlara geç.

📦 Alternatifler
Format	Avantaj	Kullanım Alanı
JSON	İnsan okunabilir, kolay debug	Web API’ler
Protobuf	Şemalı, hızlı, az yer kaplar	Servis-servis iletişimi
Kendi Binary Formatın	Tam kontrol sağlar	Özel sistem protokolleri
👨‍💻 Katkıda Bulunma

Pull Request’ler ve öneriler memnuniyetle karşılanır!
Kodlar eğitim ve güvenlik farkındalığı amaçlıdır — gerçek üretim ortamında bu yaklaşımlar Proxy Pattern veya JSON/Protobuf ile değiştirilmelidir.

📜 Lisans

MIT License
© 2025 Alpsu Tuğ
