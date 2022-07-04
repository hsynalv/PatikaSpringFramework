package com.beyazskorsky.cdi;

import javax.inject.Named;

// life-cycle süresini belirler,
@Named
//@ApplicationScoped => Bütün uygulama boyunca çalışır.
//RequestScoped => Bir istek boyunca çalışır.
//Sessionscoped => Bir kullanıcı için çalışır log out olduğu zaman sona erer.
//Dependent => life-cycle biçimini çağırıldığı yere göre dinamik olarak belirler.
//@ConversationScoped => Belli istekler oyunca çalışır.
public class _00_Scoped {
}
