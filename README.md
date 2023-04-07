# ShiftOrAlgoritmasi

Shift Or algoritması  bir metin içinde belirli bir desenin aranmasında kullanılan bir algoritmadır. Bu nedenle, Shift-Or algoritması bir arama algoritmasıdır. , bit düzeyinde yapılan bir dizi işlemin sonucunu bulmak için kullanılan bir algoritmadır. 
Bu işlemler arasında bitwise OR, bitwise SHIFT ve bitwise AND gibi işlemler yer alır.

Shift Or algoritması, özellikle dijital sinyal işleme ve işaretleme alanlarında kullanılmaktadır. 
Örneğin, bir sinyaldeki belirli bir frekans bileşenini ayırmak için kullanılabilir.

Algoritmanın çalışma şekli, verilen bir bit dizisindeki belirli bir aralıktaki bitlerin OR işlemi ile toplanması ve bu toplamın belirli bir sayıda bit sağa kaydırılmasıdır. 
Bu işlem, belirli bir sayıda bit içeren bir pencere boyunca kaydırılır ve her pencere için aynı işlem tekrarlanır.

Örneğin, 8 bit uzunluğunda bir pencere için, pencere boyunca kaydırılan bitlerin OR işlemi sonucu elde edilen 8 bitlik sonuç, 
4 bit sağa kaydırılır ve bu işlem belirli bir sayıda pencere boyunca tekrarlanır. Sonuçta, belirli bir aralıktaki bitlerin toplamı elde edilir.

Shift Or algoritması, çok hızlı ve etkili bir şekilde çalışır ve sinyal işleme uygulamalarında sıkça kullanılır. 
Ancak, uygulama senaryolarına bağlı olarak, diğer bit düzeyinde işlemler de gerekebilir ve farklı varyasyonlar kullanılabilir.

Shift Or algoritmasının çalışma zamanı analizi, bit uzunluğu n ve pencere boyutu k ile ifade edilir. 
Pencere boyutu, bitlerin kaç bitlik bir pencere boyunca gruplandırılacağını belirler. 

Algoritmanın en iyi, en kötü ve ortalama sınırları aşağıdaki şekildedir:

En iyi durum: Shift Or algoritması, en iyi durumda O(n/k) çalışma zamanı ile çalışır. 
Bu durum, pencere boyutunun bit dizisinin boyutuna yakın olduğu durumlarda meydana gelir.
Bu durumda, her pencere için sadece bir OR işlemi yapılması gerektiği için algoritma oldukça hızlı çalışır.

En kötü durum: Shift Or algoritması, en kötü durumda O(nk) çalışma zamanı ile çalışır. 
Bu durum, pencere boyutunun çok küçük olduğu durumlarda meydana gelir. 
Bu durumda, bitlerin her biri için ayrı ayrı işlem yapılması gerektiği için algoritma oldukça yavaş çalışır.

Ortalama durum: Shift Or algoritması, ortalama durumda O(n) çalışma zamanı ile çalışır. 
Bu durum, pencere boyutunun bit dizisinin boyutunun birkaç katı kadar olduğu durumlarda meydana gelir.
Bu durumda, her pencere için birkaç işlem yapılması gerektiği için algoritma hızlı çalışır.


Shift Or algoritmasının çalışma zamanı analizi, pencere boyutu k'nın bit dizisinin boyutuna göre ayarlanmasıyla optimize edilebilir. 
Genellikle, k = log2(n) olarak seçilir ve bu durumda Shift Or algoritması O(n log n) çalışma zamanı ile çalışır.


KOD YÖNERGESİ  ---->>>
Bu kodu kullanmak ve test etmek için, Java programlama dilini destekleyen bir IDE (Integrated Development Environment) kullanmanız gerekiyor. Örneğin, IntelliJ IDEA, Eclipse veya NetBeans gibi bir IDE kullanabilirsiniz.

Kodu kopyalayıp, IDE'nize yeni bir Java projesi oluşturarak ekleyin. Ardından, kodu çalıştırın ve çıktıyı kontrol edin.
