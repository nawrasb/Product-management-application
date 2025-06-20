import { NgModule, provideBrowserGlobalErrorListeners, provideZonelessChangeDetection } from '@angular/core';
import { BrowserModule, provideClientHydration, withEventReplay } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { About } from './about/about';
import { Contact } from './contact/contact';
import { Navbar } from './navbar/navbar';
import { Footer } from './footer/footer';
import { Listproduct } from './listproduct/listproduct';
import { Listclient } from './listclient/listclient';
import { Listcategorie } from './listcategorie/listcategorie';
import { Listcommande } from './listcommande/listcommande';
import { Listprovider } from './listprovider/listprovider';

@NgModule({
  declarations: [
    App,
    About,
    Contact,
    Navbar,
    Footer,
    Listproduct,
    Listclient,
    Listcategorie,
    Listcommande,
    Listprovider
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideZonelessChangeDetection(),
    provideClientHydration(withEventReplay())
  ],
  bootstrap: [App]
})
export class AppModule { }
