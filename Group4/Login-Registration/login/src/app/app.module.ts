import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CarouselModule } from 'ngx-bootstrap/carousel';
import { AppComponent } from './app.component';
import { AppRoutingModule,routingComponents } from './app-routing.module';
import { LoginComponentComponent } from './login-component/login-component.component';
import { CommonModule } from '@angular/common';
import { RegisterComponentComponent } from './register-component/register-component.component';
import { HeaderComponentComponent } from './header-component/header-component.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { FooterComponentComponent } from './footer-component/footer-component.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponentComponent,
    RegisterComponentComponent,
    HeaderComponentComponent,routingComponents, HomeComponentComponent, FooterComponentComponent
  ],
  imports: [
    BrowserModule,
    CommonModule ,
    // routing,
    CarouselModule,AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
